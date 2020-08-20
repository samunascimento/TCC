DROP TABLE tb_parents_hash;
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
DROP TABLE tb_description;


CREATE TABLE tb_metric (
    ID Serial NOT NULL,
    description varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
    value REAL NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE tb_projectMetrics(
    ID Serial NOT NULL,
    sourceDir varchar(256) NOT NULL,
	ProjectName varchar(255) NOT NULL,
    PRIMARY KEY (ID)
);


CREATE TABLE tb_versionMetrics (
    ID Serial NOT NULL,
    tlocID Integer,
    Sha varchar(255),
    authorName varchar(255),
    versionDate timeStamptz,
    analyzed boolean,
    erro boolean,
    PRIMARY KEY (ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_packageMetrics (
    ID Serial NOT Null,
	packageName varchar(255),
    aID Integer,
    ccrcID Integer,
    caID Integer,
    ceID Integer,
    dmsID Integer,
    iID Integer,
    nocID Integer,
    noiID Integer,
    pkgRCiID Integer,
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
    FOREIGN KEY (pkgRCiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (pkgTCiID) REFERENCES tb_metric(ID),
    FOREIGN KEY (tlocID) REFERENCES tb_metric(ID)
);


CREATE TABLE tb_classMetrics (
    ID Serial NOT Null,
	className varchar(255),
	ahfID Integer,
	aifID Integer,
    aaID Integer,
    adID Integer,
    aiID Integer,
    aitID Integer,
    aoID Integer,
    avID Integer,
	cfID Integer,
    clrciID Integer,
    cltciID Integer,
    ditID Integer,
    hmdID Integer,
    hmiID Integer,
	lcomID Integer,
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
	nmirID Integer,
    noaID Integer,
    nochID Integer,
    nodID Integer,
	nodaID Integer,
	nodeID Integer,
    nolID Integer,
    nopaID Integer,
    normID Integer,
    npfID Integer,
    npmID Integer,
    nsfID Integer,
    nsmID Integer,
	pfID Integer,
    pmrID Integer,
    pmdID Integer,
    pmiID Integer,
    rtlocID Integer,
    sixID Integer,
    tlocID Integer,
    wmcID Integer,
    ahID Integer,
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
	methodName varchar(255),
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
	package_name varchar (255) null,
    FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID),
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID)
);

CREATE TABLE tb_package_class (
    package_id Serial NOT Null,
    class_id Serial NOT Null,
	class_name varchar (255),
    FOREIGN KEY (package_id) REFERENCES tb_packageMetrics(ID),
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID)
);

CREATE TABLE tb_class_method (
    class_id Serial NOT Null,
    method_id Serial NOT Null,
	method_name varchar (255),
    FOREIGN KEY (class_id) REFERENCES tb_classMetrics(ID),
    FOREIGN KEY (method_id) REFERENCES tb_methodMetrics(ID)
);

CREATE TABLE tb_parents_hash (
	version_id Serial,
	parent_id Integer,
	parent_hash varchar(255),
	FOREIGN KEY (version_id) REFERENCES tb_versionMetrics(ID),
    FOREIGN KEY (parent_id) REFERENCES tb_versionMetrics(ID)
);

CREATE TABLE tb_description (
    description_id Serial,
    name varchar (10),
    description varchar (255)
);

INSERT INTO tb_description (name, description)
VALUES

    ('TLOC','Total Lines of Code: The total number of lines of code, ignoring comments, whitespace, and formatting differences (project, package, class, method)'),
    ('NOC','Number of Classes: The number of classes within a package (package)'),
    ('NOI','Number of Interfaces: The number of abstract classes (and interfaces) in a package (package)'),
    ('CA','Afferent Coupling: Number of classes outside a package that depend on it (package)'),
    ('CE','Efferent Coupling: Number of classes inside a package that depend on classes outside of it (package)'),
    ('I','Instability: Effectively the riskiness of a package, how often it has a reason to change, Ce/(Ce+Ca) (package)'),
    ('A','Abstractness: The number of abstract classes (and interfaces) divided by the total number of types in a package, NOI / NOC (package)'),
    ('DMS','Normalized Distance from Main Sequence: metric for a packages distance from ideal, | A + I: 1 | (package)'),
    ('CCRC','Class Category Relational Cohesion: The rate of cohesion between a packages classes. Sum(NOL) / NOC (package)'),
    ('PKGTCI','Package Total System Complexity: sum(Ci) over all methods in all classes in a package (package)'),
    ('PKGRCI','Package Relative System Complexity: avg(Ci) over all methods in all classes in a package (package)'),
    ('RTLOC','Raw Total Lines of Code: The actual number of lines of code in a class, using the line numbers of the file itself. Comments, whitespace, and everything else is counted. (class)'),
    ('NF','The number of fields/attributes (class)'),
    ('NSF','Number of Static Attributes: The number of static attributes (class)'),
    ('NPF','Number of Public Attributes: The number of public attributes (class)'),
    ('NM','Number of Methods: The number of methods (class)'),
    ('NSM','Number of Static Methods: The number of static methods (class)'),
    ('NPM','Number of Public Methods: The number of public methods (class)'),
    ('DIT','Depth of Inheritance Tree: The maximum depth of the inheritance hierarchy for a class. (class)'),
    ('NORM','Number of Overridden Methods: The number of methods a class overrides or implements from a parent class (class)'),
    ('NMI','Number of Inherited Methods: The number of methods a class inherits from parent classes (class)'),
    ('NMA','Number of Methods Added to Inheritance: The number of methods a class inherits adds to the inheritance hierarchy, methods defined on the class that it did not override or inherit (class)'),
    ('SIX','Specialization Index: How specialized a class is, defined as (DIT * NORM) / NOM (class)'),
    ('MIT','Number of Methods Inherited Total: Methods inherited overall (class)'),
    ('MI','Number of Methods Inherited: Methods inherited but not overridden (class)'),
    ('MD','Number of Methods Defined: Methods defined within class (same as NMA) (class)'),
    ('MO','Number of Methods Overidden: Methods in class that override an otherwis:inherited method (class)'),
    ('MA','Number of Methods (All): Methods that can be invoked on a class (inherited, overridden, defined). Ma = Md + Mi Same as NORM. (class)'),
    ('MIF','Method Inheritance Factor: Mi / Ma (class)'),
    ('PMD','Number of Public Methods Defined: Number of defined methods that are public (class)'),
    ('PMI','Number of Public Methods Inherited: Number of inherited (but not overridden) methods that are public (class)'),
    ('PMR','Public Methods Ratio: (PMd+PMi)/(Md+Mi) (class)'),
    ('HMD','Number of Hidden Methods Defined: Number of defined methods that are no:public (class)'),
    ('HMI','Number of Hidden Methods Inherited: Number of inherited (but not overridden) methods that are no:public (class)'),
    ('MHF','Method Hiding Factor: PMd / Md (class)'),
    ('NMIR','Number of Methods Inherited Ratio: (Mi / Mit) * 100 (from Lorenz and Kidd, renamed here for distinction from NMI) (class)'),
    ('CF',' Coupling Factor: the total number of relationships is 2(T:1). if a class uses every other class and is used by every other class, that is its value for a CF of 1)(class)'),
    ('PF',' Polymorphism Factor: Mo / (Md * NOD) (class)'),
    ('AIT','Number of Attributes Inherited Total (Ait): Attrobites inherited overall (class)'),
    ('AI','Number of Attributes Inherited: Attributes inherited but not overridden (class)'),
    ('AD','Number of Attributes Defined: Attributes defined within class (same as NMA) (class)'),
    ('AO','Number of Attributes Overidden: Attributes in class that override an otherwis:inherited attributes (class)'),
    ('AA','Number of Attributes (All): Attributes that can be referenced in a class (inherited, overridden, defined). Aa = Ad + Ai (class)'),
    ('AIF','Attribute Inheritance Factor: Ai / Aa (class)'),
    ('AV','Number of Public Attributes Defined: Number of defined attributes that are public (class)'),
    ('AH','Number of Hidden Attributes Defined: Number of defined attributes that are no:public (class)'),
    ('AHF',' Method Hiding Factor: Ah / Ad (class)'),
    ('WMC','Weighed Methods per Class: The summation of all of the cyclomatic complexities of all methods on a class (class)'),
    ('LCOM','Lack of Cohesion Methods: A measure for the Cohesiveness of a class. Calculated with the Henderso:Sellers method, based on the number of disjoint sets formed by comparing methods with the attribute they use (class)'),
    ('NOCH','Number of Children: Number of classes that directly extend this class (class)'),
    ('NOPA','Number of Parents: Number of classes that this class directly extends (class)'),
    ('NOD','Number of Descendants: Total number of classes that have this class as an ancestor (class)'),
    ('NOA','Number of Ancestors: Total number of classes that have this class as a descendant (class)'),
    ('NOL','Number of Links: Number of links (associations, generalizations, use links) between a class and all others (class)'),
    ('NODA','Number of Dependants: Total number of classes that depend on this class (class)'),
    ('NODE','Number of Dependencies (NODe): Total number of classes that a class depends on (same as NOL) (class)'),
    ('CLTCI','Class Total System Complexity: sum(Ci) over all methods in class (class)'),
    ('CLRCI','Class Relative System Complexity: avg(Ci) over all methods in class (class)'),
    ('NOP','Number of Parameters: The number of parameters a method takes (method)'),
    ('VG','McCabe Cyclomatic Complexity: The number of unique possible paths through code (method)'),
    ('NBD','Nested Block Depth: The maximum depth of the deepest level of nesting within a method (method)'),
    ('NCOMP','Number of Comparisons: Number of comparisons in a method (method)'),
    ('NVAR','Number of Control Variables: Number of control variables referenced in a method (method)'),
    ('MCLC','McClure’s Complexity Metric: NCOP + NVAR (method)'),
    ('FOUT','Fa:out: The number of methods immediately subordinate to a method (method)'),
    ('FIN','Fa:in: The number of methods that invoke a method (method)'),
    ('IOVARS','Input/Output Variables: NOP + 1 (0 if void return type) (method)'),
    ('DI','Data Complexity: (IOVars)/(Fout+1) (method)'),
    ('CI','System Complexity: Si + Di (method)')
