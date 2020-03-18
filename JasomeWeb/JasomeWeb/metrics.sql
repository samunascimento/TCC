DROP TABLE tb_methodMetrics;
DROP TABLE tb_classMetrics;
DROP TABLE tb_packageMetrics;
DROP TABLE tb_versionMetrics;
DROP TABLE tb_projectMetrics;
DROP TABLE tb_metric;


CREATE TABLE tb_metric (
    ID int NOT NULL,
    description varchar(255) NOT NULL,
    name varchar(255),
    value REAL,
    PRIMARY KEY (ID)
);

CREATE TABLE tb_projectMetrics(
    ID int NOT NULL,
    sourceDir varchar(256) NOT NULL,
    PRIMARY KEY (ID)
);


CREATE TABLE tb_versionMetrics (
    ID int NOT NULL,
    tloc int NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (tloc) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_packageMetrics (
    ID int NOT NULL,
    aID int NOT NULL,
    ccrcID int NOT NULL,
    caID int NOT NULL,
    ceID int NOT NULL,
    dmsID int NOT NULL,
    iID int NOT NULL,
    nocID int NOT NULL,
    noiID int NOT NULL,
    pkgRCiD int NOT NULL,
    pkgTCiID int NOT NULL,
    tlocID int NOT NULL,
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
	ID int NOT NULL,
	aa int NOT NULL,
    ad int NOT NULL,
    ai int NOT NULL,
    ait int NOT NULL,
    ao int NOT NULL,
    av int NOT NULL,
    clrci int NOT NULL,
    cltci int NOT NULL,
    dit int NOT NULL,
    hmd int NOT NULL,
    hmi int NOT NULL,
    mhf int NOT NULL,
    mif int NOT NULL,
    ma int NOT NULL,
    md int NOT NULL,
    mi int NOT NULL,
    mit int NOT NULL,
    mo int NOT NULL,
    nf int NOT NULL,
    nm int NOT NULL,
    nma int NOT NULL,
    nmi int NOT NULL,
    noa int NOT NULL,
    noch int NOT NULL,
    nod int NOT NULL,
    nol int NOT NULL,
    nopa int NOT NULL,
    norm int NOT NULL,
    npf int NOT NULL,
    npm int NOT NULL,
    nsf int NOT NULL,
    nsm int NOT NULL,
    pmr int NOT NULL,
    pmd int NOT NULL,
    pmi int NOT NULL,
    rtloc int NOT NULL,
    six int NOT NULL,
    tloc int NOT NULL,
    wmc int NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (aa) REFERENCES tb_metric(ID),
    FOREIGN KEY (ad) REFERENCES tb_metric(ID),
    FOREIGN KEY (ai) REFERENCES tb_metric(ID),
    FOREIGN KEY (ait) REFERENCES tb_metric(ID),
    FOREIGN KEY (ao) REFERENCES tb_metric(ID),
    FOREIGN KEY (av) REFERENCES tb_metric(ID),
    FOREIGN KEY (clrci) REFERENCES tb_metric(ID),
    FOREIGN KEY (cltci) REFERENCES tb_metric(ID),
    FOREIGN KEY (dit) REFERENCES tb_metric(ID),
    FOREIGN KEY (hmd) REFERENCES tb_metric(ID),
    FOREIGN KEY (hmi) REFERENCES tb_metric(ID),
    FOREIGN KEY (mhf) REFERENCES tb_metric(ID),
    FOREIGN KEY (mif) REFERENCES tb_metric(ID),
    FOREIGN KEY (ma) REFERENCES tb_metric(ID),
    FOREIGN KEY (md) REFERENCES tb_metric(ID),
    FOREIGN KEY (mi) REFERENCES tb_metric(ID),
    FOREIGN KEY (mit) REFERENCES tb_metric(ID),
    FOREIGN KEY (mo) REFERENCES tb_metric(ID),
    FOREIGN KEY (nf) REFERENCES tb_metric(ID),
    FOREIGN KEY (nm) REFERENCES tb_metric(ID),
    FOREIGN KEY (nma) REFERENCES tb_metric(ID),
    FOREIGN KEY (nmi) REFERENCES tb_metric(ID),
    FOREIGN KEY (noa) REFERENCES tb_metric(ID),
    FOREIGN KEY (noch) REFERENCES tb_metric(ID),
    FOREIGN KEY (nod) REFERENCES tb_metric(ID),
    FOREIGN KEY (nol) REFERENCES tb_metric(ID),
    FOREIGN KEY (nopa) REFERENCES tb_metric(ID),
    FOREIGN KEY (norm) REFERENCES tb_metric(ID),
    FOREIGN KEY (npf) REFERENCES tb_metric(ID),
    FOREIGN KEY (npm) REFERENCES tb_metric(ID),
    FOREIGN KEY (nsf) REFERENCES tb_metric(ID),
    FOREIGN KEY (nsm) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmr) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmd) REFERENCES tb_metric(ID),
    FOREIGN KEY (pmi) REFERENCES tb_metric(ID),
    FOREIGN KEY (rtloc) REFERENCES tb_metric(ID),
    FOREIGN KEY (six) REFERENCES tb_metric(ID),
    FOREIGN KEY (tloc) REFERENCES tb_metric(ID),
    FOREIGN KEY (wmc) REFERENCES tb_metric(ID)
);

CREATE TABLE tb_methodMetrics (
    ID int NOT NULL,
    ci int NOT NULL,
    di int NOT NULL,
    fin int NOT NULL,
    fout int NOT NULL,
    iovars int NOT NULL,
    mclc int NOT NULL,
    nbd int NOT NULL,
    ncomp int NOT NULL,
    nop int NOT NULL,
    nvar int NOT NULL,
    si int NOT NULL,
    tloc int NOT NULL,
    vg int NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (ci) REFERENCES tb_metric(ID),
    FOREIGN KEY (di) REFERENCES tb_metric(ID),
    FOREIGN KEY (fin) REFERENCES tb_metric(ID),
    FOREIGN KEY (fout) REFERENCES tb_metric(ID),
    FOREIGN KEY (iovars) REFERENCES tb_metric(ID),
    FOREIGN KEY (mclc) REFERENCES tb_metric(ID),
    FOREIGN KEY (nbd) REFERENCES tb_metric(ID),
    FOREIGN KEY (ncomp) REFERENCES tb_metric(ID),
    FOREIGN KEY (nop) REFERENCES tb_metric(ID),
    FOREIGN KEY (nvar) REFERENCES tb_metric(ID),
    FOREIGN KEY (si) REFERENCES tb_metric(ID),
    FOREIGN KEY (tloc) REFERENCES tb_metric(ID),
    FOREIGN KEY (vg) REFERENCES tb_metric(ID)
);