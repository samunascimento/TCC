package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.ClassMethodDao;
import br.ufjf.dcc.jasome.jdbc.dao.ClassMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.MethodMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.MetricDao;
import br.ufjf.dcc.jasome.jdbc.dao.PackageClassDao;
import br.ufjf.dcc.jasome.jdbc.dao.PackageMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectVersionDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionPackageDao;
import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author antonio henrique
 */
public class ReadXMLUsingSAX extends DefaultHandler {

    private String tagAtual;
    private String siglaAtual;

    private boolean project = false;
    private boolean pacckage = false;
    private boolean clazz = false;
    private boolean method = false;

    private MethodMetrics methodMetrics;
    private ClassMetrics classMetrics;
    private PackageMetrics packageMetrics;
    private VersionMetrics versionMetrics;
    private ProjectMetrics projectMetrics;

    MetricDao metricDao = new MetricDao();
    PackageMetricsDao packageMetricDao = new PackageMetricsDao();
    VersionMetricsDao versionMetricDao = new VersionMetricsDao();
    ClassMetricsDao classMetricDao = new ClassMetricsDao();
    MethodMetricsDao methodMetricDao = new MethodMetricsDao();
    

    ProjectVersionDao projectVersionDao = new ProjectVersionDao();
    VersionPackageDao versionPackageDao = new VersionPackageDao();
    PackageClassDao packageClassDao = new PackageClassDao();
    ClassMethodDao classMethodDao = new ClassMethodDao();

    List<MethodMetrics> listMethod = new ArrayList<>();

    public VersionMetrics getVersionMetrics() {
        return versionMetrics;
    }

    Metric metric = new Metric();

    public ReadXMLUsingSAX(ProjectMetrics project) {
        super();
        versionMetrics = new VersionMetrics();
        this.projectMetrics = project;

    }

    public void fazerParsing(String xml) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser;
        try {
            saxParser = factory.newSAXParser();
//            saxParser.parse(pathArq, this);
            saxParser.parse(new InputSource(new StringReader(xml)), this);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            StringBuffer msg = new StringBuffer();
            msg.append("Erro:\n");
            msg.append(e.getMessage() + "\n");
            msg.append(e.toString());
            System.out.println(msg);
        }
    }

    @Override
    public void startDocument() {

    }

    @Override
    public void endDocument() {
        try {
            projectVersionDao.insert(projectMetrics, versionMetrics);
        } catch (SQLException ex) {
            Logger.getLogger(ReadXMLUsingSAX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param uri
     * @param localName
     * @param qName
     * @param atts
     */
    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes atts) {

        // recupera o nome da tag atual
        tagAtual = qName;

        if (tagAtual.equals("Project")) {
            project = true;
            versionMetrics = new VersionMetrics();
            projectMetrics.setSourceDir(atts.getValue(0));
        } else if (tagAtual.equals("Package")) {
            pacckage = true;
            packageMetrics = new PackageMetrics();
            packageMetrics.setName(atts.getValue(0));
        } else if (tagAtual.equals("Class")) {
            clazz = true;
            classMetrics = new ClassMetrics();
            classMetrics.setLineEnd(atts.getValue(0));
            classMetrics.setLineStart(atts.getValue(1));
            classMetrics.setName(atts.getValue(2));
            classMetrics.setSourceFile(atts.getValue(3));
        } else if (tagAtual.equals("Method")) {
            method = true;
            methodMetrics = new MethodMetrics();
            methodMetrics.setConstructor(atts.getValue(0));
            methodMetrics.setLineEnd(atts.getValue(1));
            methodMetrics.setLineStart(atts.getValue(2));
            methodMetrics.setName(atts.getValue(3));
        } else if (tagAtual.equals("Metric")) {
            metric = new Metric();

            String value0 = atts.getValue(0);
            String value1 = atts.getValue(1);
            String value2 = atts.getValue(2);

            metric.setDescription(value0);
            metric.setName(value1);

            if (value2.contains(",")) {
                value2 = value2.replace(",", ".");
                metric.setValue(Double.parseDouble(value2));
            } else {

                metric.setValue(Double.parseDouble(value2));
            }

            try {
                if (project && !pacckage && !clazz && !method) {

                    int insert = metricDao.insert(metric);
                    metric.setId(insert);
                    versionMetrics.setTloc(metric);

                } else if (project && pacckage && !clazz && !method) {
                    if (metric.getName().equals("A")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setA(metric);
                    } else if (metric.getName().equals("CCRC")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setCcrc(metric);
                    } else if (metric.getName().equals("Ca")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setCa(metric);
                    } else if (metric.getName().equals("Ce")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setCe(metric);
                    } else if (metric.getName().equals("DMS")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setDms(metric);
                    } else if (metric.getName().equals("I")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setI(metric);
                    } else if (metric.getName().equals("NOC")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setNoc(metric);
                    } else if (metric.getName().equals("NOI")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setNoi(metric);
                    } else if (metric.getName().equals("PkgRCi")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setPkgRCi(metric);
                    } else if (metric.getName().equals("PkgTCi")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setPkgTCi(metric);
                    } else if (metric.getName().equals("TLOC")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        packageMetrics.setTloc(metric);
                    }

                } else if (project && pacckage && clazz && !method) {
                    if (metric.getName().equals("Aa")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAa(metric);

                    } else if (metric.getName().equals("Ad")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAd(metric);

                    } else if (metric.getName().equals("Ai")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAi(metric);

                    } else if (metric.getName().equals("Ait")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAit(metric);

                    } else if (metric.getName().equals("Ao")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAo(metric);

                    } else if (metric.getName().equals("Av")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setAv(metric);

                    } else if (metric.getName().equals("ClRCi")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setClrci(metric);

                    } else if (metric.getName().equals("ClTCi")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setCltci(metric);

                    } else if (metric.getName().equals("DIT")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setDit(metric);

                    } else if (metric.getName().equals("HMd")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setHmd(metric);

                    } else if (metric.getName().equals("HMi")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setHmi(metric);

                    } else if (metric.getName().equals("MHF")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMhf(metric);

                    } else if (metric.getName().equals("MIF")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMif(metric);

                    } else if (metric.getName().equals("Ma")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMa(metric);

                    } else if (metric.getName().equals("Md")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMd(metric);

                    } else if (metric.getName().equals("Mi")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMi(metric);

                    } else if (metric.getName().equals("Mit")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMit(metric);

                    } else if (metric.getName().equals("Mo")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setMo(metric);

                    } else if (metric.getName().equals("NF")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNf(metric);

                    } else if (metric.getName().equals("NM")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNm(metric);

                    } else if (metric.getName().equals("NMA")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNma(metric);

                    } else if (metric.getName().equals("NMI")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNmi(metric);

                    } else if (metric.getName().equals("NOA")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNoa(metric);

                    } else if (metric.getName().equals("NOCh")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNoch(metric);

                    } else if (metric.getName().equals("NOD")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNod(metric);

                    } else if (metric.getName().equals("NOL")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNol(metric);

                    } else if (metric.getName().equals("NOPa")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNopa(metric);

                    } else if (metric.getName().equals("NORM")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNorm(metric);

                    } else if (metric.getName().equals("NPF")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNpf(metric);

                    } else if (metric.getName().equals("NPM")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNpm(metric);

                    } else if (metric.getName().equals("NSF")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNsf(metric);

                    } else if (metric.getName().equals("NSM")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setNsm(metric);

                    } else if (metric.getName().equals("PMR")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setPmr(metric);

                    } else if (metric.getName().equals("PMd")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setPmd(metric);

                    } else if (metric.getName().equals("PMi")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setPmi(metric);

                    } else if (metric.getName().equals("RTLOC")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setRtloc(metric);

                    } else if (metric.getName().equals("SIX")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setSix(metric);

                    } else if (metric.getName().equals("TLOC")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setTloc(metric);

                    } else if (metric.getName().equals("WMC")) {

                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        classMetrics.setWmc(metric);

                    }

                } else if (project && pacckage && clazz && method) {
                    if (metric.getName().equals("Ci")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setCi(metric);
                    } else if (metric.getName().equals("Di")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setDi(metric);
                    } else if (metric.getName().equals("Fin")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setFin(metric);
                    } else if (metric.getName().equals("Fout")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setFout(metric);
                    } else if (metric.getName().equals("IOVars")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setIovars(metric);
                    } else if (metric.getName().equals("MCLC")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setMclc(metric);
                    } else if (metric.getName().equals("NBD")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setNbd(metric);
                    } else if (metric.getName().equals("NCOMP")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setNcomp(metric);
                    } else if (metric.getName().equals("NOP")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setNop(metric);
                    } else if (metric.getName().equals("NVAR")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setNvar(metric);
                    } else if (metric.getName().equals("Si")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setSi(metric);
                    } else if (metric.getName().equals("TLOC")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setTloc(metric);
                    } else if (metric.getName().equals("VG")) {
                        int insert = metricDao.insert(metric);
                        metric.setId(insert);
                        methodMetrics.setVg(metric);
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(ReadXMLUsingSAX.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        tagAtual = qName;
        try {
            if (tagAtual.equals("Project")) {
                versionMetrics.setProjectID(projectMetrics.getId());
                int versionId = versionMetricDao.insert(versionMetrics);
                versionMetrics.setId(versionId);
                for (int i = 0; i < versionMetrics.getListPackageMetric().size(); i++) {
                    versionPackageDao.insert(versionMetrics, versionMetrics.getListPackageMetric().get(i));
                }
                project = false;
            } else if (tagAtual.equals("Package")) {

                packageMetrics.setVersionId(versionMetrics.getId());
                int packageId = packageMetricDao.insert(packageMetrics);
                packageMetrics.setId(packageId);
                for (int i = 0; i < packageMetrics.getListClassMetrics().size(); i++) {
                    packageClassDao.insert(packageMetrics, packageMetrics.getListClassMetrics().get(i));
                }
                versionMetrics.getListPackageMetric().add(packageMetrics);
                pacckage = false;

            } else if (tagAtual.equals("Class")) {
                classMetrics.setPackageId(packageMetrics.getId());
                int classId = classMetricDao.insert(classMetrics);
                classMetrics.setId(classId);
                for (int i = 0; i < classMetrics.getListMethodsMetrics().size(); i++) {
                    classMethodDao.insert(classMetrics, classMetrics.getListMethodsMetrics().get(i));
                }
                packageMetrics.getListClassMetrics().add(classMetrics);
                clazz = false;

            } else if (tagAtual.equals("Method")) {
                int methodId = methodMetricDao.insert(methodMetrics);
                methodMetrics.setId(methodId);
                classMetrics.getListMethodsMetrics().add(methodMetrics);
                method = false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(ReadXMLUsingSAX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
