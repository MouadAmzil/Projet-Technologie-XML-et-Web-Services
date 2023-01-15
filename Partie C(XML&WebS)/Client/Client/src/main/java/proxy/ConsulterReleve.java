
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConsulterReleve complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="ConsulterReleve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsulterReleve", propOrder = {
    "rib"
})
public class ConsulterReleve {

    protected int rib;

    /**
     * Obtient la valeur de la propriété rib.
     *
     * @return possible object is
     * {@link String }
     */
    public int getRib() {
        return rib;
    }

    /**
     * Définit la valeur de la propriété rib.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setRib(int value) {
        this.rib = value;
    }

}
