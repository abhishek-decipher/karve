
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientNameCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver1FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver1LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver1Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveHeader", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "brokerCode",
    "carTypeId",
    "clientNameCapital",
    "creationDate",
    "creationTime",
    "driver1FirstName",
    "driver1LastName",
    "driver1Salutation",
    "dropOffDate",
    "dropOffOfficeId",
    "dropOffOfficeName",
    "dropOffTime",
    "lastModification",
    "locator",
    "pickUpDate",
    "pickUpOfficeId",
    "pickUpOfficeName",
    "pickUpTime",
    "reserveId"
})
public class ReserveHeader {

    protected String brokerCode;
    protected String carTypeId;
    protected String clientNameCapital;
    protected String creationDate;
    protected String creationTime;
    protected String driver1FirstName;
    protected String driver1LastName;
    protected String driver1Salutation;
    protected String dropOffDate;
    protected String dropOffOfficeId;
    protected String dropOffOfficeName;
    protected String dropOffTime;
    protected String lastModification;
    protected String locator;
    protected String pickUpDate;
    protected String pickUpOfficeId;
    protected String pickUpOfficeName;
    protected String pickUpTime;
    protected String reserveId;

    /**
     * Gets the value of the brokerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerCode() {
        return brokerCode;
    }

    /**
     * Sets the value of the brokerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerCode(String value) {
        this.brokerCode = value;
    }

    /**
     * Gets the value of the carTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarTypeId() {
        return carTypeId;
    }

    /**
     * Sets the value of the carTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarTypeId(String value) {
        this.carTypeId = value;
    }

    /**
     * Gets the value of the clientNameCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNameCapital() {
        return clientNameCapital;
    }

    /**
     * Sets the value of the clientNameCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNameCapital(String value) {
        this.clientNameCapital = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the driver1FirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver1FirstName() {
        return driver1FirstName;
    }

    /**
     * Sets the value of the driver1FirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver1FirstName(String value) {
        this.driver1FirstName = value;
    }

    /**
     * Gets the value of the driver1LastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver1LastName() {
        return driver1LastName;
    }

    /**
     * Sets the value of the driver1LastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver1LastName(String value) {
        this.driver1LastName = value;
    }

    /**
     * Gets the value of the driver1Salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver1Salutation() {
        return driver1Salutation;
    }

    /**
     * Sets the value of the driver1Salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver1Salutation(String value) {
        this.driver1Salutation = value;
    }

    /**
     * Gets the value of the dropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDate() {
        return dropOffDate;
    }

    /**
     * Sets the value of the dropOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDate(String value) {
        this.dropOffDate = value;
    }

    /**
     * Gets the value of the dropOffOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffOfficeId() {
        return dropOffOfficeId;
    }

    /**
     * Sets the value of the dropOffOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffOfficeId(String value) {
        this.dropOffOfficeId = value;
    }

    /**
     * Gets the value of the dropOffOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffOfficeName() {
        return dropOffOfficeName;
    }

    /**
     * Sets the value of the dropOffOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffOfficeName(String value) {
        this.dropOffOfficeName = value;
    }

    /**
     * Gets the value of the dropOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffTime() {
        return dropOffTime;
    }

    /**
     * Sets the value of the dropOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffTime(String value) {
        this.dropOffTime = value;
    }

    /**
     * Gets the value of the lastModification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModification() {
        return lastModification;
    }

    /**
     * Sets the value of the lastModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModification(String value) {
        this.lastModification = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDate(String value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the pickUpOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpOfficeId() {
        return pickUpOfficeId;
    }

    /**
     * Sets the value of the pickUpOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpOfficeId(String value) {
        this.pickUpOfficeId = value;
    }

    /**
     * Gets the value of the pickUpOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpOfficeName() {
        return pickUpOfficeName;
    }

    /**
     * Sets the value of the pickUpOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpOfficeName(String value) {
        this.pickUpOfficeName = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpTime(String value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the reserveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveId() {
        return reserveId;
    }

    /**
     * Sets the value of the reserveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveId(String value) {
        this.reserveId = value;
    }

}
