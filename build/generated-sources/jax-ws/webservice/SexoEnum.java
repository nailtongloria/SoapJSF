
package webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sexoEnum.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="sexoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Masculino"/>
 *     &lt;enumeration value="Feminino"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sexoEnum")
@XmlEnum
public enum SexoEnum {

    @XmlEnumValue("Masculino")
    MASCULINO("Masculino"),
    @XmlEnumValue("Feminino")
    FEMININO("Feminino");
    private final String value;

    SexoEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SexoEnum fromValue(String v) {
        for (SexoEnum c: SexoEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
