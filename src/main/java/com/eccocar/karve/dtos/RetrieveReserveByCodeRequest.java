
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RetrieveReserveByCodeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveReserveByCodeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeAllConcepts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveReserveByCodeRequest", propOrder = {
    "reserveCode",
    "countryCode",
    "languageCode",
    "includeAllConcepts"
})
@XmlRootElement(name = "RetrieveReserveByCodeRequest")
public class RetrieveReserveByCodeRequest {

    @XmlElement(name = "ReserveCode")
    protected String reserveCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "IncludeAllConcepts")
    protected Boolean includeAllConcepts;

    /**
     * Gets the value of the reserveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveCode() {
        return reserveCode;
    }

    /**
     * Sets the value of the reserveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveCode(String value) {
        this.reserveCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the includeAllConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllConcepts() {
        return includeAllConcepts;
    }

    /**
     * Sets the value of the includeAllConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllConcepts(Boolean value) {
        this.includeAllConcepts = value;
    }

}
