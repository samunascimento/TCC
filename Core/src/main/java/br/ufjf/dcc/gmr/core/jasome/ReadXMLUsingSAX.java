/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.jasome;

import java.io.IOException;
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

    public void startDocument() {
        System.out.println("\nIniciando o Parsing...\n");
    }

    public void endDocument() {
        System.out.println("\nFim do Parsing...");
    }
 
    public void startElement(String uri, String localName, String qName,
            Attributes atts) {
 
        // recupera o nome da tag atual
        tagAtual = qName;
 
        // se a tag for "<pais>", recupera o valor do atributo "sigla"
        if (qName.compareTo("pais") == 0) {
            siglaAtual = atts.getValue(0);
        }
    }
 
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
 
        tagAtual = "";
    }
 
    public void characters(char[] ch, int start, int length)
            throws SAXException {
 
        String texto = new String(ch, start, length);
 
    }
 
    public static void main(String[] args) throws Exception {
        
        //vou deixar o método main aqui pra fazer testes com o SAX
        ReadXMLUsingSAX mySax = new ReadXMLUsingSAX();
        mySax.fazerParsing("");
    }
 
}
