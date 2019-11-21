
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ListReservesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListReservesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Locator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Driver1FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Driver1LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeModifieds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListReservesRequest", propOrder = {
    "locator",
    "brokerCode",
    "driver1FirstName",
    "driver1LastName",
    "pickUpDate",
    "pickUpOfficeId",
    "lastMinutes",
    "includeModifieds"
})
@XmlRootElement(name = "ListReservesRequest")
public class ListReservesRequest {

    @XmlElement(name = "Locator")
    protected String locator;
    @XmlElement(name = "BrokerCode")
    protected String brokerCode;
    @XmlElement(name = "Driver1FirstName")
    protected String driver1FirstName;
    @XmlElement(name = "Driver1LastName")
    protected String driver1LastName;
    @XmlElement(name = "PickUpDate")
    protected String pickUpDate;
    @XmlElement(name = "PickUpOfficeId")
    protected String pickUpOfficeId;
    @XmlElement(name = "LastMinutes")
    protected Integer lastMinutes;
    @XmlElement(name = "IncludeModifieds")
    protected Boolean includeModifieds;

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
     * Gets the value of the lastMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastMinutes() {
        return lastMinutes;
    }

    /**
     * Sets the value of the lastMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastMinutes(Integer value) {
        this.lastMinutes = value;
    }

    /**
     * Gets the value of the includeModifieds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeModifieds() {
        return includeModifieds;
    }

    /**
     * Sets the value of the includeModifieds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeModifieds(Boolean value) {
        this.includeModifieds = value;
    }

}
