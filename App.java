import javax.xmlparsers.DocumentBuilderFactory;

import javax.xml.parsers.DocumentBuilder;

public class App {

    public String getGreeting() {
        system.out.println("Hello, World!");
    }

}

    public Class_XML:{

public static void main(String[]args) {

    System.out.println("Starting XML creation...");
    createXML();
}

public static void createXML() {
    try {

        DocumentBuilderFactory factory = documentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();
        document document = builder.newDocument();

        element rootElement = document.createElement("softwares");
        document.appendChild(rootElement);

        element softwareElement = document.createElement("Software");
        softwareElement.setTextContent("Sample Software");

        rootElement.appendChild(softwareElement);

        System.out.println("XML document created successfully!");

    } catch (parser.Configuration.exception ex) {

        getLogger(XMLExample.class.getName()).log(System.Logger.Level, SEVERE, null, ex);

    }
}
