package org.example;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "ReleveWS")
public class ConsulteReleve {
    @WebMethod(operationName="ConsulterReleve")
    public Releve getReleve(@WebParam(name = "rib") String rib){
        return new Releve(1,"2021-11-10",14500);

    }


}
