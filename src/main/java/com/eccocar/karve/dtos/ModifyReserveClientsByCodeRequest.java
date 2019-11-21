
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyReserveClientsByCodeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyReserveClientsByCodeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyReserveClientsByCodeRequest", propOrder = {
    "reserveCode",
    "clientCode",
    "driverCode1",
    "driverCode2",
    "countryCode",
    "languageCode"
})
@XmlRootElement(name = "ModifyReserveClientsByCodeRequest")
public class ModifyReserveClientsByCodeRequest {

    @XmlElement(name = "ReserveCode")
    protected String reserveCode;
    @XmlElement(name = "ClientCode")
    protected String clientCode;
    @XmlElement(name = "DriverCode1")
    protected String driverCode1;
    @XmlElement(name = "DriverCode2")
    protected String driverCode2;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;

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
     * Gets the value of the driverCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverCode1() {
        return driverCode1;
    }

    /**
     * Sets the value of the driverCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverCode1(String value) {
        this.driverCode1 = value;
    }

    /**
     * Gets the value of the driverCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverCode2() {
        return driverCode2;
    }

    /**
     * Sets the value of the driverCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverCode2(String value) {
        this.driverCode2 = value;
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

}
