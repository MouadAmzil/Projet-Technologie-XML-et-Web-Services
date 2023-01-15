
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsulterReleve_QNAME = new QName("http://example.org/", "ConsulterReleve");
    private final static QName _ConsulterReleveResponse_QNAME = new QName("http://example.org/", "ConsulterReleveResponse");
    private final static QName _Releve_QNAME = new QName("http://example.org/", "Releve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterReleve }
     * 
     * @return
     *     the new instance of {@link ConsulterReleve }
     */
    public ConsulterReleve createConsulterReleve() {
        return new ConsulterReleve();
    }

    /**
     * Create an instance of {@link ConsulterReleveResponse }
     * 
     * @return
     *     the new instance of {@link ConsulterReleveResponse }
     */
    public ConsulterReleveResponse createConsulterReleveResponse() {
        return new ConsulterReleveResponse();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterReleve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterReleve }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ConsulterReleve")
    public JAXBElement<ConsulterReleve> createConsulterReleve(ConsulterReleve value) {
        return new JAXBElement<>(_ConsulterReleve_QNAME, ConsulterReleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterReleveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterReleveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ConsulterReleveResponse")
    public JAXBElement<ConsulterReleveResponse> createConsulterReleveResponse(ConsulterReleveResponse value) {
        return new JAXBElement<>(_ConsulterReleveResponse_QNAME, ConsulterReleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "Releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

}
