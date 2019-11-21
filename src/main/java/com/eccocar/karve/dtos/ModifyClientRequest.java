
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyClientRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyClientRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientInformation" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="IsCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyClientRequest", propOrder = {
    "clientCode",
    "clientInformation",
    "isCompany"
})
@XmlRootElement(name = "ModifyClientRequest")
public class ModifyClientRequest {

    @XmlElement(name = "ClientCode")
    protected String clientCode;
    @XmlElement(name = "ClientInformation")
    protected PersonInformation clientInformation;
    @XmlElement(name = "IsCompany")
    protected Boolean isCompany;

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the clientInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformation }
     *     
     */
    public PersonInformation getClientInformation() {
        return clientInformation;
    }

    /**
     * Sets the value of the clientInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformation }
     *     
     */
    public void setClientInformation(PersonInformation value) {
        this.clientInformation = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompany(Boolean value) {
        this.isCompany = value;
    }

}
