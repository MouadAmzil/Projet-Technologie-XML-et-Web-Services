import jakarta.xml.ws.Endpoint;
import org.example.ConsulteReleve;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new ConsulteReleve());
        System.out.println("Webservice deplyé sur http://0.0.0.0:9191/ ");
    }
}




