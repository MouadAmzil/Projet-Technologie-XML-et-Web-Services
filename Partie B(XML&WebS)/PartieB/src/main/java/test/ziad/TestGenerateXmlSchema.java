package test.ziad;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class TestGenerateXmlSchema {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File f=new File("Releve.xsd");
                StreamResult result=new StreamResult(f);
                return result;
            }
        });


    }
}
