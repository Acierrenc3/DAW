package xml_java;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XmlJava {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "concesionario", null);
            documento.setXmlVersion("1.0");

            Element coches = documento.createElement("coches");

            //-------------------------------------Primer Coche-------------------------------------
            Element coche1 = documento.createElement("coche");
            Element matricula1 = documento.createElement("matricula");
            Text textMatricula1 = documento.createTextNode("1111AAA");
            matricula1.appendChild(textMatricula1);
            coche1.appendChild(matricula1);

            Element marca1 = documento.createElement("marca");
            Text textMarca1 = documento.createTextNode("AUDI");
            marca1.appendChild(textMarca1);
            coche1.appendChild(marca1);

            Element precio1 = documento.createElement("precio");
            Text textPrecio1 = documento.createTextNode("56000");
            precio1.appendChild(textPrecio1); 
            coche1.appendChild(precio1);

            coches.appendChild(coche1);

            //-------------------------------------Segundo Coche-------------------------------------
            Element coche2 = documento.createElement("coche");
            Element matricula2 = documento.createElement("matricula");
            Text textMatricula2 = documento.createTextNode("2222BBB");
            matricula2.appendChild(textMatricula2);
            coche2.appendChild(matricula2);

            Element marca2 = documento.createElement("marca");
            Text textMarca2 = documento.createTextNode("RENAULT");
            marca2.appendChild(textMarca2); 
            coche2.appendChild(marca2);

            Element precio2 = documento.createElement("precio");
            Text textPrecio2 = documento.createTextNode("18000");
            precio2.appendChild(textPrecio2); 
            coche2.appendChild(precio2);

            coches.appendChild(coche2);

            //-------------------------------------Tercer Coche-------------------------------------
            Element coche3 = documento.createElement("coche");
            Element matricula3 = documento.createElement("matricula");
            Text textMatricula3 = documento.createTextNode("3333CCC");
            matricula3.appendChild(textMatricula3);
            coche3.appendChild(matricula3);

            Element marca3 = documento.createElement("marca");
            Text textMarca3 = documento.createTextNode("MERCEDES");
            marca3.appendChild(textMarca3); 
            coche3.appendChild(marca3);

            Element precio3 = documento.createElement("precio");
            Text textPrecio3 = documento.createTextNode("72000");
            precio3.appendChild(textPrecio3); 
            coche3.appendChild(precio3);

            coches.appendChild(coche3);

            //-------------------------------------Cuarto Coche-------------------------------------
            Element coche4 = documento.createElement("coche");
            Element matricula4 = documento.createElement("matricula");
            Text textMatricula4 = documento.createTextNode("4444DDD");
            matricula4.appendChild(textMatricula4);
            coche4.appendChild(matricula4);

            Element marca4 = documento.createElement("marca");
            Text textMarca4 = documento.createTextNode("FORD");
            marca4.appendChild(textMarca4); 
            coche4.appendChild(marca4);

            Element precio4 = documento.createElement("precio");
            Text textPrecio4 = documento.createTextNode("17000");
            precio4.appendChild(textPrecio4); 
            coche4.appendChild(precio4);

            coches.appendChild(coche4);

            documento.getDocumentElement().appendChild(coches);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("concesionario.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result); 

        } catch (TransformerConfigurationException | ParserConfigurationException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
