package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.MethodMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.Metric;
import br.ufjf.dcc.gmr.core.jasome.model.ClassMetrics;
import br.ufjf.dcc.jasome.jdbc.dao.*;
import java.io.IOException;
import java.io.StringReader;
import java.sql.SQLException;
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

    /*
    public List<Metric> listMetric = new ArrayList<>();
    public List<Metric> methodsMetrics = new ArrayList<>();
    public List<Metric> classMetrics = new ArrayList<>();
    public List<Metric> packagesMetrics = new ArrayList<>();
    public Metric projectMetric;
     */
    private MethodMetrics methodMetrics;
    private ClassMetrics classMetrics;
    private PackageMetrics packageMetrics;
    private VersionMetrics versionMetrics;
    private ProjectMetrics projectMetrics = new ProjectMetrics();

    private MetricDao metricsDao = new MetricDao();
    private VersionMetricsDao versionMetricsDao = new VersionMetricsDao();
    private PackageMetricsDao packageMetricsDao = new PackageMetricsDao();
    private ClassMetricsDao classMetricsDao = new ClassMetricsDao();
    private MethodMetricsDao methodsMetricsDao = new MethodMetricsDao();

    public VersionMetrics getVersionMetrics() {
        return versionMetrics;
    }

    Metric metric = new Metric();

    public ReadXMLUsingSAX() {
        super();
        versionMetrics = new VersionMetrics();
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
        try {
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

                if (project && !pacckage && !clazz && !method) {

                    int id = metricsDao.insert(metric);
                    metric.setId(id);
                    versionMetrics.setTloc(metric);
                    int versionId = versionMetricsDao.insert(versionMetrics);

                } else if (project && pacckage && !clazz && !method) {
                    if (metric.getName().equals("A")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setA(metric);

                    } else if (metric.getName().equals("CCRC")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setCcrc(metric);

                    } else if (metric.getName().equals("Ca")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setCa(metric);

                    } else if (metric.getName().equals("Ce")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setCe(metric);

                    } else if (metric.getName().equals("DMS")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setDms(metric);

                    } else if (metric.getName().equals("I")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setI(metric);

                    } else if (metric.getName().equals("NOC")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setNoc(metric);

                    } else if (metric.getName().equals("NOI")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setNoi(metric);

                    } else if (metric.getName().equals("PkgRCi")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setPkgRCi(metric);

                    } else if (metric.getName().equals("PkgTCi")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setPkgTCi(metric);

                    } else if (metric.getName().equals("TLOC")) {

                        int id = metricsDao.insert(metric);
                        metric.setId(id);
                        packageMetrics.setTloc(metric);
                        
                        int packageId = packageMetricsDao.insert(packageMetrics);
                    }

                }

            } else if (project && pacckage && clazz && !method) {
                if (metric.getName().equals("Aa")) {
                    classMetrics.setAa(metric);
                } else if (metric.getName().equals("Ad")) {
                    classMetrics.setAd(metric);
                } else if (metric.getName().equals("Ai")) {
                    classMetrics.setAi(metric);
                } else if (metric.getName().equals("Ait")) {
                    classMetrics.setAit(metric);
                } else if (metric.getName().equals("Ao")) {
                    classMetrics.setAo(metric);
                } else if (metric.getName().equals("Av")) {
                    classMetrics.setAv(metric);
                } else if (metric.getName().equals("ClRCi")) {
                    classMetrics.setClrci(metric);
                } else if (metric.getName().equals("ClTCi")) {
                    classMetrics.setCltci(metric);
                } else if (metric.getName().equals("DIT")) {
                    classMetrics.setDit(metric);
                } else if (metric.getName().equals("HMd")) {
                    classMetrics.setHmd(metric);
                } else if (metric.getName().equals("HMi")) {
                    classMetrics.setHmi(metric);
                } else if (metric.getName().equals("MHF")) {
                    classMetrics.setMhf(metric);
                } else if (metric.getName().equals("MIF")) {
                    classMetrics.setMif(metric);
                } else if (metric.getName().equals("Ma")) {
                    classMetrics.setMa(metric);
                } else if (metric.getName().equals("Md")) {
                    classMetrics.setMd(metric);
                } else if (metric.getName().equals("Mi")) {
                    classMetrics.setMi(metric);
                } else if (metric.getName().equals("Mit")) {
                    classMetrics.setMit(metric);
                } else if (metric.getName().equals("Mo")) {
                    classMetrics.setMo(metric);
                } else if (metric.getName().equals("NF")) {
                    classMetrics.setNf(metric);
                } else if (metric.getName().equals("NM")) {
                    classMetrics.setNm(metric);
                } else if (metric.getName().equals("NMA")) {
                    classMetrics.setNma(metric);
                } else if (metric.getName().equals("NMI")) {
                    classMetrics.setNmi(metric);
                } else if (metric.getName().equals("NOA")) {
                    classMetrics.setNoa(metric);
                } else if (metric.getName().equals("NOCh")) {
                    classMetrics.setNoch(metric);
                } else if (metric.getName().equals("NOD")) {
                    classMetrics.setNod(metric);
                } else if (metric.getName().equals("NOL")) {
                    classMetrics.setNol(metric);
                } else if (metric.getName().equals("NOPa")) {
                    classMetrics.setNopa(metric);
                } else if (metric.getName().equals("NORM")) {
                    classMetrics.setNorm(metric);
                } else if (metric.getName().equals("NPF")) {
                    classMetrics.setNpf(metric);
                } else if (metric.getName().equals("NPM")) {
                    classMetrics.setNpm(metric);
                } else if (metric.getName().equals("NSF")) {
                    classMetrics.setNsf(metric);
                } else if (metric.getName().equals("NSM")) {
                    classMetrics.setNsm(metric);
                } else if (metric.getName().equals("PMR")) {
                    classMetrics.setPmr(metric);
                } else if (metric.getName().equals("PMd")) {
                    classMetrics.setPmd(metric);
                } else if (metric.getName().equals("PMi")) {
                    classMetrics.setPmi(metric);
                } else if (metric.getName().equals("RTLOC")) {
                    classMetrics.setRtloc(metric);
                } else if (metric.getName().equals("SIX")) {
                    classMetrics.setSix(metric);
                } else if (metric.getName().equals("TLOC")) {
                    classMetrics.setTloc(metric);
                } else if (metric.getName().equals("WMC")) {
                    classMetrics.setWmc(metric);
                }

            } else if (project && pacckage && clazz && method) {
                if (metric.getName().equals("Ci")) {
                    methodMetrics.setCi(metric);
                } else if (metric.getName().equals("Di")) {
                    methodMetrics.setDi(metric);
                } else if (metric.getName().equals("Fin")) {
                    methodMetrics.setFin(metric);
                } else if (metric.getName().equals("Fout")) {
                    methodMetrics.setFout(metric);
                } else if (metric.getName().equals("IOVars")) {
                    methodMetrics.setIovars(metric);
                } else if (metric.getName().equals("MCLC")) {
                    methodMetrics.setMclc(metric);;
                } else if (metric.getName().equals("NBD")) {
                    methodMetrics.setNbd(metric);
                } else if (metric.getName().equals("NCOMP")) {
                    methodMetrics.setNcomp(metric);
                } else if (metric.getName().equals("NOP")) {
                    methodMetrics.setNop(metric);
                } else if (metric.getName().equals("NVAR")) {
                    methodMetrics.setNvar(metric);
                } else if (metric.getName().equals("Si")) {
                    methodMetrics.setSi(metric);
                } else if (metric.getName().equals("TLOC")) {
                    methodMetrics.setTloc(metric);
                } else if (metric.getName().equals("VG")) {
                    methodMetrics.setVg(metric);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadXMLUsingSAX.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        tagAtual = qName;
        

        if (tagAtual.equals("Project")) {
            project = false;
        } else if (tagAtual.equals("Package")) {
            versionMetrics.getListPackageMetric().add(packageMetrics);
            pacckage = false;
        } else if (tagAtual.equals("Class")) {
            packageMetrics.getListClassMetrics().add(classMetrics);
            clazz = false;
        } else if (tagAtual.equals("Method")) {
            classMetrics.getListMethodsMetrics().add(methodMetrics);
            method = false;
        }

    }

}
