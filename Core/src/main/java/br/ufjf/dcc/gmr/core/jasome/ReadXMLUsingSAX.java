/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

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
    
    public int numberPackage = 0;
    public List<Metric> listMetric = new ArrayList<>();

    public ReadXMLUsingSAX() {
        super();
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
        System.out.println(numberPackage);
        /*
        System.out.println("Imprimindo listMetric");
        for(int i = 0; i<listMetric.size(); i++){
            System.out.println(listMetric.get(i).getDescription());
            System.out.println(listMetric.get(i).getName());
            System.out.println(listMetric.get(i).getValue());
        }
        */
    }

    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes atts) {

        // recupera o nome da tag atual
        tagAtual = qName;
        //Contagem MetricPackage,MetricClass,MetricMethod
        if(tagAtual.equals("Package")){
            numberPackage++;
        }
        //Creating Metric (description,name and value)
        if (tagAtual.equals("Metric")) {
            Metric metric = new Metric();
            
            String value0 = atts.getValue(0);
            String value1 = atts.getValue(1);
            String value2 = atts.getValue(2);
            
            metric.setDescription(value0);
            metric.setName(value1);
            metric.setValue(value2);
            listMetric.add(metric);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        tagAtual = "";
    }

    public static void main(String[] args) throws Exception {

        //vou deixar o método main aqui pra fazer testes com o SAX
        ReadXMLUsingSAX mySax = new ReadXMLUsingSAX();
        mySax.fazerParsing("C:\\Users\\antonio henrique\\Desktop\\jasome\\build\\distributions\\jasome\\bin\\jasomeXML");
    }

}
