
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentityExpeditionCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseExpeditionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseExpeditionCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalDriver", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "name",
    "identityExpeditionCountryCode",
    "licenseNumber",
    "licenseExpeditionDate",
    "licenseExpeditionCountryCode"
})
public class AdditionalDriver {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IdentityExpeditionCountryCode")
    protected String identityExpeditionCountryCode;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "LicenseExpeditionDate")
    protected String licenseExpeditionDate;
    @XmlElement(name = "LicenseExpeditionCountryCode")
    protected String licenseExpeditionCountryCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identityExpeditionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityExpeditionCountryCode() {
        return identityExpeditionCountryCode;
    }

    /**
     * Sets the value of the identityExpeditionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityExpeditionCountryCode(String value) {
        this.identityExpeditionCountryCode = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseExpeditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseExpeditionDate() {
        return licenseExpeditionDate;
    }

    /**
     * Sets the value of the licenseExpeditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseExpeditionDate(String value) {
        this.licenseExpeditionDate = value;
    }

    /**
     * Gets the value of the licenseExpeditionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseExpeditionCountryCode() {
        return licenseExpeditionCountryCode;
    }

    /**
     * Sets the value of the licenseExpeditionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseExpeditionCountryCode(String value) {
        this.licenseExpeditionCountryCode = value;
    }

}
