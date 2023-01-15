
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour releve complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="releve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rib" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "rib",
    "solde"
})
public class Releve {

    protected int rib;
    protected int solde;

    /**
     * Obtient la valeur de la propriété rib.
     * 
     */
    public int getRib() {
        return rib;
    }

    /**
     * Définit la valeur de la propriété rib.
     * 
     */
    public void setRib(int value) {
        this.rib = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     */
    public int getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     */
    public void setSolde(int value) {
        this.solde = value;
    }

}
