package xml_java2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlJava2 {

    public static void main(String[] args) {
        try {
            //Leer el XML del ejercicio Anterior.

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document documento = builder.parse(new File("concesionario.xml"));

            NodeList listaCoches = documento.getElementsByTagName("coche");

            for (int i = 0; i < listaCoches.getLength(); i++) {
                Node nodo = listaCoches.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nodo;
                    NodeList hijos = e.getChildNodes();

                    for (int j = 0; j < hijos.getLength(); j++) {
                        Node hijo = hijos.item(j);
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            Element eHijo = (Element) hijo;
                            System.out.println("Propiedad: " + hijo.getNodeName() + ", Valor: " + hijo.getTextContent());
                        }

                    }
                }

            }

        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(XmlJava2.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
