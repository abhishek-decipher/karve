
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowOneway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultAirportsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultDeposit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defaultDowntownsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultFranchise" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defaultFranchiseOfTheft" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="features" type="{http://rentacarwebpage.karve.com/}carTypeFeatures" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredLicenseClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carType", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "allowOneway",
    "defaultAirportsOnRequest",
    "defaultDeposit",
    "defaultDowntownsOnRequest",
    "defaultFranchise",
    "defaultFranchiseOfTheft",
    "features",
    "id",
    "imageBase64",
    "name",
    "requiredLicenseClass"
})
public class CarType {

    protected Boolean allowOneway;
    protected Boolean defaultAirportsOnRequest;
    protected Integer defaultDeposit;
    protected Boolean defaultDowntownsOnRequest;
    protected Integer defaultFranchise;
    protected Integer defaultFranchiseOfTheft;
    protected CarTypeFeatures features;
    protected String id;
    protected String imageBase64;
    protected String name;
    protected String requiredLicenseClass;

    /**
     * Gets the value of the allowOneway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOneway() {
        return allowOneway;
    }

    /**
     * Sets the value of the allowOneway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOneway(Boolean value) {
        this.allowOneway = value;
    }

    /**
     * Gets the value of the defaultAirportsOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAirportsOnRequest() {
        return defaultAirportsOnRequest;
    }

    /**
     * Sets the value of the defaultAirportsOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAirportsOnRequest(Boolean value) {
        this.defaultAirportsOnRequest = value;
    }

    /**
     * Gets the value of the defaultDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultDeposit() {
        return defaultDeposit;
    }

    /**
     * Sets the value of the defaultDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultDeposit(Integer value) {
        this.defaultDeposit = value;
    }

    /**
     * Gets the value of the defaultDowntownsOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultDowntownsOnRequest() {
        return defaultDowntownsOnRequest;
    }

    /**
     * Sets the value of the defaultDowntownsOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultDowntownsOnRequest(Boolean value) {
        this.defaultDowntownsOnRequest = value;
    }

    /**
     * Gets the value of the defaultFranchise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultFranchise() {
        return defaultFranchise;
    }

    /**
     * Sets the value of the defaultFranchise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultFranchise(Integer value) {
        this.defaultFranchise = value;
    }

    /**
     * Gets the value of the defaultFranchiseOfTheft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultFranchiseOfTheft() {
        return defaultFranchiseOfTheft;
    }

    /**
     * Sets the value of the defaultFranchiseOfTheft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultFranchiseOfTheft(Integer value) {
        this.defaultFranchiseOfTheft = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link CarTypeFeatures }
     *     
     */
    public CarTypeFeatures getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTypeFeatures }
     *     
     */
    public void setFeatures(CarTypeFeatures value) {
        this.features = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the imageBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageBase64() {
        return imageBase64;
    }

    /**
     * Sets the value of the imageBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageBase64(String value) {
        this.imageBase64 = value;
    }

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
     * Gets the value of the requiredLicenseClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredLicenseClass() {
        return requiredLicenseClass;
    }

    /**
     * Sets the value of the requiredLicenseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredLicenseClass(String value) {
        this.requiredLicenseClass = value;
    }

}
