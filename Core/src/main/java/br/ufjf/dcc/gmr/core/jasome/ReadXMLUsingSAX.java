package br.ufjf.dcc.gmr.core.jasome;

import java.io.IOException;
import java.io.StringReader;
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
    private ProjectMetrics projectMetrics;

    public ProjectMetrics getProjectMetrics() {
        return projectMetrics;
    }

    Metric metric = new Metric();

    public ReadXMLUsingSAX() {
        super();
        projectMetrics = new ProjectMetrics();
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
        System.out.println("\nIniciando o Parsing...\n");
    }

    @Override
    public void endDocument() {
        System.out.println("\nFim do Parsing...");

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
            projectMetrics = new ProjectMetrics();
        }

        if (tagAtual.equals("Package")) {
            pacckage = true;
            packageMetrics = new PackageMetrics();

        }
        if (tagAtual.equals("Class")) {
            clazz = true;
            classMetrics = new ClassMetrics();
        }
        if (tagAtual.equals("Method")) {
            method = true;
            methodMetrics = new MethodMetrics();
        }

        if (tagAtual.equals("Metric")) {
            metric = new Metric();

            String value0 = atts.getValue(0);
            String value1 = atts.getValue(1);
            String value2 = atts.getValue(2);

            metric.setDescription(value0);
            metric.setName(value1);
            metric.setValue(value2);

            if (project && !pacckage && !clazz && !method) {
                projectMetrics.setTloc(metric);
            }
            if (project && pacckage && !clazz && !method) {
                if (metric.getName().equals("A")) {
                    packageMetrics.setA(metric);
                }
                if (metric.getName().equals("CCRC")) {
                    packageMetrics.setCcrc(metric);
                }
                if (metric.getName().equals("Ca")) {
                    packageMetrics.setCa(metric);
                }
                if (metric.getName().equals("Ce")) {
                    packageMetrics.setCe(metric);
                }
                if (metric.getName().equals("DMS")) {
                    packageMetrics.setDms(metric);
                }
                if (metric.getName().equals("I")) {
                    packageMetrics.setI(metric);
                }
                if (metric.getName().equals("NOC")) {
                    packageMetrics.setNoc(metric);
                }
                if (metric.getName().equals("NOI")) {
                    packageMetrics.setNoi(metric);
                }
                if (metric.getName().equals("PkgRCi")) {
                    packageMetrics.setPkgRCi(metric);
                }
                if (metric.getName().equals("PkgTCi")) {
                    packageMetrics.setPkgTCi(metric);
                }
                if (metric.getName().equals("TLOC")) {
                    packageMetrics.setTloc(metric);
                }

            }
            if (project && pacckage && clazz && !method) {
                if (metric.getName().equals("Aa")) {
                    classMetrics.setAa(metric);
                }
                if (metric.getName().equals("Ad")) {
                    classMetrics.setAd(metric);
                }
                if (metric.getName().equals("Ai")) {
                    classMetrics.setAi(metric);
                }
                if (metric.getName().equals("Ait")) {
                    classMetrics.setAit(metric);
                }
                if (metric.getName().equals("Ao")) {
                    classMetrics.setAo(metric);
                }
                if (metric.getName().equals("Av")) {
                    classMetrics.setAv(metric);
                }
                if (metric.getName().equals("ClRCi")) {
                    classMetrics.setClrci(metric);
                }
                if (metric.getName().equals("ClTCi")) {
                    classMetrics.setCltci(metric);
                }
                if (metric.getName().equals("DIT")) {
                    classMetrics.setDit(metric);
                }
                if (metric.getName().equals("HMd")) {
                    classMetrics.setHmd(metric);
                }
                if (metric.getName().equals("HMi")) {
                    classMetrics.setHmi(metric);
                }
                if (metric.getName().equals("MHF")) {
                    classMetrics.setMhf(metric);
                }
                if (metric.getName().equals("MIF")) {
                    classMetrics.setMif(metric);
                }
                if (metric.getName().equals("Ma")) {
                    classMetrics.setMa(metric);
                }
                if (metric.getName().equals("Md")) {
                    classMetrics.setMd(metric);
                }
                if (metric.getName().equals("Mi")) {
                    classMetrics.setMi(metric);
                }
                if (metric.getName().equals("Mit")) {
                    classMetrics.setMit(metric);
                }
                if (metric.getName().equals("Mo")) {
                    classMetrics.setMo(metric);
                }
                if (metric.getName().equals("NF")) {
                    classMetrics.setNf(metric);
                }
                if (metric.getName().equals("NM")) {
                    classMetrics.setNm(metric);
                }
                if (metric.getName().equals("NMA")) {
                    classMetrics.setNma(metric);
                }
                if (metric.getName().equals("NMI")) {
                    classMetrics.setNmi(metric);
                }
                if (metric.getName().equals("NOA")) {
                    classMetrics.setNoa(metric);
                }
                if (metric.getName().equals("NOCh")) {
                    classMetrics.setNoch(metric);
                }
                if (metric.getName().equals("NOD")) {
                    classMetrics.setNod(metric);
                }
                if (metric.getName().equals("NOL")) {
                    classMetrics.setNol(metric);
                }
                if (metric.getName().equals("NOPa")) {
                    classMetrics.setNopa(metric);
                }
                if (metric.getName().equals("NORM")) {
                    classMetrics.setNorm(metric);
                }
                if (metric.getName().equals("NPF")) {
                    classMetrics.setNpf(metric);
                }
                if (metric.getName().equals("NPM")) {
                    classMetrics.setNpm(metric);
                }
                if (metric.getName().equals("NSF")) {
                    classMetrics.setNsf(metric);
                }
                if (metric.getName().equals("NSM")) {
                    classMetrics.setNsm(metric);
                }
                if (metric.getName().equals("PMR")) {
                    classMetrics.setPmr(metric);
                }
                if (metric.getName().equals("PMd")) {
                    classMetrics.setPmd(metric);
                }
                if (metric.getName().equals("PMi")) {
                    classMetrics.setPmi(metric);
                }
                if (metric.getName().equals("RTLOC")) {
                    classMetrics.setRtloc(metric);
                }
                if (metric.getName().equals("SIX")) {
                    classMetrics.setSix(metric);
                }
                if (metric.getName().equals("TLOC")) {
                    classMetrics.setTloc(metric);
                }
                if (metric.getName().equals("WMC")) {
                    classMetrics.setWmc(metric);
                }

            }
            if (project && pacckage && clazz && method) {
                if (metric.getName().equals("Ci")) {
                    methodMetrics.setCi(metric);
                }
                if (metric.getName().equals("Di")) {
                    methodMetrics.setDi(metric);
                }
                if (metric.getName().equals("Fin")) {
                    methodMetrics.setFin(metric);
                }
                if (metric.getName().equals("Fout")) {
                    methodMetrics.setFout(metric);
                }
                if (metric.getName().equals("IOVars")) {
                    methodMetrics.setIovars(metric);
                }
                if (metric.getName().equals("MCLC")) {
                    methodMetrics.setMclc(metric);;
                }
                if (metric.getName().equals("NBD")) {
                    methodMetrics.setNbd(metric);
                }
                if (metric.getName().equals("NCOMP")) {
                    methodMetrics.setNcomp(metric);
                }
                if (metric.getName().equals("NOP")) {
                    methodMetrics.setNop(metric);
                }
                if (metric.getName().equals("NVAR")) {
                    methodMetrics.setNvar(metric);
                }
                if (metric.getName().equals("Si")) {
                    methodMetrics.setSi(metric);
                }
                if (metric.getName().equals("TLOC")) {
                    methodMetrics.setTloc(metric);
                }
                if (metric.getName().equals("VG")) {
                    methodMetrics.setVg(metric);
                }

            }
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        tagAtual = qName;

        if (tagAtual.equals("Project")) {
            System.out.println("Project");
            project = false;
        }

        if (tagAtual.equals("Package")) {
            System.out.println("Packages");
            projectMetrics.getListPackageMetric().add(packageMetrics);
            pacckage = false;
        }
        if (tagAtual.equals("Class")) {
            System.out.println("class");
            packageMetrics.getListClassMetrics().add(classMetrics);
            clazz = false;
        }
        if (tagAtual.equals("Method")) {
            System.out.println("method");
            classMetrics.getListMethodsMetrics().add(methodMetrics);
            method = false;
        }

    }

    public static void main(String[] args) throws Exception {

        //vou deixar o método main aqui pra fazer testes com o SAX
        ReadXMLUsingSAX mySax = new ReadXMLUsingSAX();
        mySax.fazerParsing("/Users/gleiph/Desktop/output.xml");
        System.out.println("Quantidade de pacotes: " + mySax.getProjectMetrics().getListPackageMetric().size());
    }
}
