import proxy.ConsulteReleve;
import proxy.ConsulterReleve;
import proxy.Releve;
import proxy.ReleveWS;

public class ClientWS {
    public static void main(String[] args) {
        ConsulteReleve stub=new ReleveWS().getConsulteRelevePort();

        Releve rv=stub.consulterReleve(1);
        System.out.println(rv.getSolde());

    }
}
