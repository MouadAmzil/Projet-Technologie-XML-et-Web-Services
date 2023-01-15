package test.ziad;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Operation operation=new Operation();
        Releve releve=new Releve();
        releve.operations.add(new Operation(TypeOperation.CREDIT,"2021-01-01",9000,"Vers Espèce"));
        releve.operations.add(new Operation(TypeOperation.DEBIT,"2021-01-11",3400,"Chèque Guichet"));
        releve.operations.add(new Operation(TypeOperation.DEBIT,"2021-01-15",120,"Prélèvement Assurence"));
        releve.operations.add(new Operation(TypeOperation.CREDIT,"2021-01-25",70000,"Virement .."));

        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("Operations.xml"));

    }
}
