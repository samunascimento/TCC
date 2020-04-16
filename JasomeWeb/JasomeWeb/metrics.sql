DROP TABLE tb_methodMetrics;
DROP TABLE tb_classMetrics;
DROP TABLE tb_packageMetrics;
DROP TABLE tb_versionMetrics;
DROP TABLE tb_projectMetrics;
DROP TABLE tb_metric;


CREATE TABLE tb_metric (
    ID serial NOT NULL,
    description varchar(255) NOT NULL,
    name varchar(255),
    value REAL,
    PRIMARY KEY (ID)
);

CREATE TABLE tb_projectMetrics(
    ID serial NOT NULL,
    sourceDir varchar(256) NOT NULL,
    PRIMARY KEY (ID)
);


CREATE TABLE tb_versionMetrics (
    ID serial NOT NULL,
    tlocID serial NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_packageMetrics (
    ID serial NOT NULL,
    aID serial NOT NULL,
    ccrcID serial NOT NULL,
    caID serial NOT NULL,
    ceID serial NOT NULL,
    dmsID serial NOT NULL,
    iID serial NOT NULL,
    nocID serial NOT NULL,
    noiID serial NOT NULL,
    pkgRCiD serial NOT NULL,
    pkgTCiID serial NOT NULL,
    tlocID serial NOT NULL,
    versionID serial NOT NULL,
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
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID),
    FOREIGN KEY (versionID) REFERENCES tb_versionMetrics(ID)
);


CREATE TABLE tb_classMetrics (
    ID serial NOT NULL,
    aaID serial NOT NULL,
    adID serial NOT NULL,
    aiID serial NOT NULL,
    aitID serial NOT NULL,
    aoID serial NOT NULL,
    avID serial NOT NULL,
    clrciID serial NOT NULL,
    cltciID serial NOT NULL,
    ditID serial NOT NULL,
    hmdID serial NOT NULL,
    hmiID serial NOT NULL,
    mhfID serial NOT NULL,
    mifID serial NOT NULL,
    maID serial NOT NULL,
    mdID serial NOT NULL,
    miID serial NOT NULL,
    mitID serial NOT NULL,
    moID serial NOT NULL,
    nfID serial NOT NULL,
    nmID serial NOT NULL,
    nmaID serial NOT NULL,
    nmiID serial NOT NULL,
    noaID serial NOT NULL,
    nochID serial NOT NULL,
    nodID serial NOT NULL,
    nolID serial NOT NULL,
    nopaID serial NOT NULL,
    normID serial NOT NULL,
    npfID serial NOT NULL,
    npmID serial NOT NULL,
    nsfID serial NOT NULL,
    nsmID serial NOT NULL,
    pmrID serial NOT NULL,
    pmdID serial NOT NULL,
    pmiID serial NOT NULL,
    rtlocID serial NOT NULL,
    sixID serial NOT NULL,
    tlocID serial NOT NULL,
    wmcID serial NOT NULL,
    packageID serial NOT NULL,
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
    FOREIGN KEY (wmcID) REFERENCES tb_metric(ID),
    FOREIGN KEY (packageID) REFERENCES tb_packageMetrics(ID)
);

CREATE TABLE tb_methodMetrics (
    ID serial NOT NULL,
    ciID serial NOT NULL,
    diID serial NOT NULL,
    finID serial NOT NULL,
    foutID serial NOT NULL,
    iovarsID serial NOT NULL,
    mclcID serial NOT NULL,
    nbdID serial NOT NULL,
    ncompID serial NOT NULL,
    nopID serial NOT NULL,
    nvarID serial NOT NULL,
    siID serial NOT NULL,
    tlocID serial NOT NULL,
    vgID serial NOT NULL,
    classID serial NOT NULL,
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
    FOREIGN KEY (vgID) REFERENCES tb_metric(ID),
    FOREIGN KEY (classID) REFERENCES tb_classMetrics(ID)
);

CREATE TABLE tb_project_version (
    project_id serial NOT NULL,
    version_id serial NOT NULL,
    FOREIGN KEY (project_id) REFERENCES tb_projectMetrics(ID),
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID)
);

CREATE TABLE tb_version_package (
    version_id serial NOT NULL,
    package_id serial NOT NULL,
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID),
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID)
);

CREATE TABLE tb_package_class (
    package_id serial NOT NULL,
    class_id serial NOT NULL,
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID),
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID)
);

CREATE TABLE tb_class_method (
    class_id serial NOT NULL,
    method_id serial NOT NULL,
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID),
    FOREIGN KEY (method_id) REFERENCES tb_methodMetrics(ID)
);
