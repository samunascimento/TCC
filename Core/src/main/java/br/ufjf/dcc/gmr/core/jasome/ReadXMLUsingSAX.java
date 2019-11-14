/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import com.sun.scenario.effect.impl.prism.PrCropPeer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
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
     
    
    Metric metric = new Metric();

    public ReadXMLUsingSAX() {
        super();
        projectMetrics = new ProjectMetrics();
    }

    public void fazerParsing(String pathArq) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser;

        try {
            saxParser = factory.newSAXParser();
            saxParser.parse(pathArq, this);

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
        
        if(tagAtual.equals("Project")){
            project = true;
            projectMetrics = new ProjectMetrics();
        }
        
        if(tagAtual.equals("Package")){
            pacckage = true;
            packageMetrics = new PackageMetrics();
            
        }
        if(tagAtual.equals("Class")){
            clazz = true;
            classMetrics = new ClassMetrics();
        }
        if(tagAtual.equals("Method")){
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
            
            if(project && !pacckage && !clazz && !method){
                projectMetrics.setTloc(metric);
            }
            if(project && pacckage && !clazz && !method){
               if(metric.getName().equals("A")){
                   packageMetrics.setA(metric);
               } 
               
            }
            
            //System.out.println(metric.getDescription());
            //System.out.println(metric.getName());
            //System.out.println(metric.getValue());
        }
        
        /*
        if (tagAtual.equals("Project")) {
            project = tagAtual;
            pacckage = "";
            clazz = "";
            method = "";
        } else if (tagAtual.equals("Package")) {
            pacckage = tagAtual;
            project = "";
            clazz = "";
            method = "";
        } else if (tagAtual.equals("Class")) {
            clazz = tagAtual;
            project = "";
            pacckage = "";
            method = "";

        } else if (tagAtual.equals("Method")) {
            method = tagAtual;
            clazz = "";
            project = "";
            pacckage = "";
        }
        */
        // separando as métricas
        /*
        if (project.equals("Project")) {
            if (tagAtual.equals("Metric")){
                Metric metric = new Metric();
                String value0 = atts.getValue(0);
                String value1 = atts.getValue(1);
                String value2 = atts.getValue(2);
                
                metric.setDescription(value0);
                metric.setName(value1);
                metric.setValue(value2);
                listMetric.add(metric);
                d.setTloc(metric);
            }
        } else if (pacckage.equals("Package")) {
            if (tagAtual.equals("Metric")) {
                Metric metric = new Metric();
                String value0 = atts.getValue(0);
                String value1 = atts.getValue(1);
                String value2 = atts.getValue(2);

                metric.setDescription(value0);
                metric.setName(value1);
                metric.setValue(value2);
                listMetric.add(metric);
                packagesMetrics.add(metric);
            }
            c.setListMetrics(packagesMetrics);
        } else if (clazz.equals("Class")) {
            if (tagAtual.equals("Metric")) {
                Metric metric = new Metric();
                String value0 = atts.getValue(0);
                String value1 = atts.getValue(1);
                String value2 = atts.getValue(2);

                metric.setDescription(value0);
                metric.setName(value1);
                metric.setValue(value2);
                listMetric.add(metric);
                classMetrics.add(metric);
            }
            b.setMetrics(classMetrics);
        } else if (method.equals("Method")) {
            if (tagAtual.equals("Metric")) {
                Metric metric = new Metric();
                String value0 = atts.getValue(0);
                String value1 = atts.getValue(1);
                String value2 = atts.getValue(2);

                metric.setDescription(value0);
                metric.setName(value1);
                metric.setValue(value2);
                listMetric.add(metric);
                methodsMetrics.add(metric);
        }
        a.setListMetrics(listMetric);
    }
*/
        
}

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        tagAtual = qName;
        
       if(tagAtual.equals("Project")){
            project = false;
        }
        
        if(tagAtual.equals("Package")){
            projectMetrics.getListPackageMetric().add(packageMetrics);
            packageMetrics = new PackageMetrics();
            pacckage = false;
        }
        if(tagAtual.equals("Class")){
            System.out.println("class");
            packageMetrics.getListClassMetrics().add(classMetrics);
            packageMetrics = new PackageMetrics();
            clazz = false;
        }
        if(tagAtual.equals("Method")){
            System.out.println("method");
            method = false;
        }
        
    }

    public static void main(String[] args) throws Exception {

        //vou deixar o método main aqui pra fazer testes com o SAX
        ReadXMLUsingSAX mySax = new ReadXMLUsingSAX();
        mySax.fazerParsing("C:\\Users\\antonio henrique\\Desktop\\testexml");
    }
}
