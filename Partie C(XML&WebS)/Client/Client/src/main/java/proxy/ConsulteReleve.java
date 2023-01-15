
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ConsulteReleve", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsulteReleve {


    /**
     * 
     * @param rib
     * @return
     *     returns proxy.Releve
     */
    @WebMethod(operationName = "ConsulterReleve")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConsulterReleve", targetNamespace = "http://example.org/", className = "proxy.ConsulterReleve")
    @ResponseWrapper(localName = "ConsulterReleveResponse", targetNamespace = "http://example.org/", className = "proxy.ConsulterReleveResponse")
    @Action(input = "http://example.org/ConsulteReleve/ConsulterReleveRequest", output = "http://example.org/ConsulteReleve/ConsulterReleveResponse")
    public Releve consulterReleve(
        @WebParam(name = "rib", targetNamespace = "")
        int rib);

}