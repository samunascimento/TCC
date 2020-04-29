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
    ID Serial NOT NULL,
    description varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
    value REAL NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE tb_projectMetrics(
    ID Serial NOT NULL,
    sourceDir varchar(256) NOT NULL ,
    PRIMARY KEY (ID)
);


CREATE TABLE tb_versionMetrics (
    ID Serial NOT NULL,
    tlocID Integer,
    PRIMARY KEY (ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_packageMetrics (
    ID Serial NOT Null,
    aID Integer,
    ccrcID Integer,
    caID Integer,
    ceID Integer,
    dmsID Integer,
    iID Integer,
    nocID Integer,
    noiID Integer,
    pkgRCiD Integer,
    pkgTCiID Integer,
    tlocID Integer,
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
    ID Serial NOT Null,
    aaID Integer,
    adID Integer,
    aiID Integer,
    aitID Integer,
    aoID Integer,
    avID Integer,
    clrciID Integer,
    cltciID Integer,
    ditID Integer,
    hmdID Integer,
    hmiID Integer,
    mhfID Integer,
    mifID Integer,
    maID Integer,
    mdID Integer,
    miID Integer,
    mitID Integer ,
    moID Integer,
    nfID Integer,
    nmID Integer,
    nmaID Integer,
    nmiID Integer,
    noaID Integer,
    nochID Integer,
    nodID Integer,
    nolID Integer,
    nopaID Integer,
    normID Integer,
    npfID Integer,
    npmID Integer,
    nsfID Integer,
    nsmID Integer,
    pmrID Integer,
    pmdID Integer,
    pmiID Integer,
    rtlocID Integer,
    sixID Integer,
    tlocID Integer,
    wmcID Integer,
    nmirID Integer,
    cfID Integer,
    pfID Integer,
    aifID Integer,
    ahID Integer,
    ahfID Integer,
    lcomID Integer,
    nodeID Integer,
    nodaID Integer,
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
    FOREIGN KEY (nmirID) REFERENCES tb_metric(ID),
    FOREIGN KEY (cfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (aifID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ahID) REFERENCES tb_metric(ID),
    FOREIGN KEY (ahfID) REFERENCES tb_metric(ID),
    FOREIGN KEY (lcomID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nodeID) REFERENCES tb_metric(ID),
    FOREIGN KEY (nodaID) REFERENCES tb_metric(ID)
);

CREATE TABLE tb_methodMetrics (
    ID Serial NOT Null,
    ciID Integer,
    diID Integer,
    finID Integer,
    foutID Integer,
    iovarsID Integer,
    mclcID Integer,
    nbdID Integer,
    ncompID Integer,
    nopID Integer,
    nvarID Integer,
    siID Integer,
    tlocID Integer,
    vgID Integer,
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
    project_id Serial NOT Null,
    version_id Serial NOT Null,
    FOREIGN KEY (project_id) REFERENCES tb_projectMetrics(ID),
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID)
);

CREATE TABLE tb_version_package (
    version_id Serial NOT Null,
    package_id Serial NOT Null,
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID),
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID)
);

CREATE TABLE tb_package_class (
    package_id Serial NOT Null,
    class_id Serial NOT Null,
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID),
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID)
);

CREATE TABLE tb_class_method (
    class_id Serial NOT Null,
    method_id Serial NOT Null,
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID),
    FOREIGN KEY (method_id) REFERENCES tb_methodMetrics(ID)
);
