DROP TABLE tb_project_version;
DROP TABLE tb_version_package;
DROP TABLE tb_package_class;
DROP TABLE tb_class_method;
DROP TABLE tb_methodMetrics;
DROP TABLE tb_classMetrics;
DROP TABLE tb_packageMetrics;
DROP TABLE tb_versionMetrics;
DROP TABLE tb_projectMetrics;
DROP TABLE tb_metric;


CREATE TABLE tb_metric (
    ID serial Not Null,
    description varchar(255) ,
    name varchar(255),
    value REAL,
    PRIMARY KEY (ID)
);

CREATE TABLE tb_projectMetrics(
    ID serial Not Null,
    sourceDir varchar(256) ,
    PRIMARY KEY (ID)
);


CREATE TABLE tb_versionMetrics (
    ID serial Not Null,
    tlocID serial ,
    PRIMARY KEY (ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_packageMetrics (
    ID serial NOT Null,
    aID serial,
    ccrcID serial,
    caID serial,
    ceID serial,
    dmsID serial,
    iID serial,
    nocID serial,
    noiID serial,
    pkgRCiD serial,
    pkgTCiID serial,
    tlocID serial,
    PRIMARY KEY (ID),
    FOREIGN KEY (aID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ccrcID) REFERENCES tb_metric(ID),
    FOREIGN KEY (caID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ceID) REFERENCES tb_metric(ID),
    FOREIGN KEY (dmsID) REFERENCES tb_metric(ID),
    FOREIGN KEY (iID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nocID) REFERENCES tb_metric(ID),
    FOREIGN KEY (noiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pkgRCiD) REFERENCES tb_metric(ID),
    FOREIGN KEY (pkgTCiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_classMetrics (
    ID serial NOT Null,
    aaID serial,
    adID serial,
    aiID serial,
    aitID serial,
    aoID serial,
    avID serial,
    clrciID serial,
    cltciID serial,
    ditID serial,
    hmdID serial,
    hmiID serial,
    mhfID serial,
    mifID serial,
    maID serial,
    mdID serial,
    miID serial,
    mitID serial ,
    moID serial,
    nfID serial,
    nmID serial,
    nmaID serial,
    nmiID serial,
    noaID serial,
    nochID serial ,
    nodID serial ,
    nolID serial ,
    nopaID serial ,
    normID serial ,
    npfID serial ,
    npmID serial ,
    nsfID serial ,
    nsmID serial ,
    pmrID serial ,
    pmdID serial ,
    pmiID serial ,
    rtlocID serial ,
    sixID serial ,
    tlocID serial ,
    wmcID serial ,
    PRIMARY KEY (ID),
    FOREIGN KEY (aaID) REFERENCES tb_metric(ID),
    FOREIGN KEY (adID) REFERENCES tb_metric(ID),
    FOREIGN KEY (aiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (aitID) REFERENCES tb_metric(ID),
    FOREIGN KEY (aoID) REFERENCES tb_metric(ID),
    FOREIGN KEY (avID) REFERENCES tb_metric(ID),
    FOREIGN KEY (clrciID) REFERENCES tb_metric(ID),
    FOREIGN KEY (cltciID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ditID) REFERENCES tb_metric(ID),
    FOREIGN KEY (hmdID) REFERENCES tb_metric(ID),
    FOREIGN KEY (hmiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (mhfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (mifID) REFERENCES tb_metric(ID),
    FOREIGN KEY (maID) REFERENCES tb_metric(ID),
    FOREIGN KEY (mdID) REFERENCES tb_metric(ID),
    FOREIGN KEY (miID) REFERENCES tb_metric(ID),
    FOREIGN KEY (mitID) REFERENCES tb_metric(ID),
    FOREIGN KEY (moID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nmID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nmaID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nmiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (noaID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nochID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nodID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nolID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nopaID) REFERENCES tb_metric(ID),
    FOREIGN KEY (normID) REFERENCES tb_metric(ID),
    FOREIGN KEY (npfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (npmID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nsfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nsmID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmrID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmdID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (rtlocID) REFERENCES tb_metric(ID),
    FOREIGN KEY (sixID) REFERENCES tb_metric(ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID),
    FOREIGN KEY (wmcID) REFERENCES tb_metric(ID)
);

CREATE TABLE tb_methodMetrics (
    ID serial NOT Null,
    ciID serial ,
    diID serial ,
    finID serial ,
    foutID serial ,
    iovarsID serial ,
    mclcID serial ,
    nbdID serial ,
    ncompID serial ,
    nopID serial ,
    nvarID serial ,
    siID serial ,
    tlocID serial ,
    vgID serial ,
    PRIMARY KEY (ID),
    FOREIGN KEY (ciID) REFERENCES tb_metric(ID),
    FOREIGN KEY (diID) REFERENCES tb_metric(ID),
    FOREIGN KEY (finID) REFERENCES tb_metric(ID),
    FOREIGN KEY (foutID) REFERENCES tb_metric(ID),
    FOREIGN KEY (iovarsID) REFERENCES tb_metric(ID),
    FOREIGN KEY (mclcID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nbdID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ncompID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nopID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nvarID) REFERENCES tb_metric(ID),
    FOREIGN KEY (siID) REFERENCES tb_metric(ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID),
    FOREIGN KEY (vgID) REFERENCES tb_metric(ID)
);

CREATE TABLE tb_project_version (
    project_id serial NOT Null,
    version_id serial NOT Null,
    FOREIGN KEY (project_id) REFERENCES tb_projectMetrics(ID),
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID)
);

CREATE TABLE tb_version_package (
    version_id serial NOT Null,
    package_id serial NOT Null,
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID),
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID)
);

CREATE TABLE tb_package_class (
    package_id serial NOT Null,
    class_id serial NOT Null,
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID),
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID)
);

CREATE TABLE tb_class_method (
    class_id serial NOT Null,
    method_id serial NOT Null,
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID),
    FOREIGN KEY (method_id) REFERENCES tb_methodMetrics(ID)
);
