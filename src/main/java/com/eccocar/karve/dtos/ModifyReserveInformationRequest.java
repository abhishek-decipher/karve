
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyReserveInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyReserveInformationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverInformation1" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="DriverInformation2" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{http://rentacarwebpage.karve.com/}creditCardInformation" minOccurs="0"/>
 *         &lt;element name="AdditionalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ModifyReserveInformationRequest", propOrder = {
    "reserveId",
    "clientName",
    "flight",
    "localAddress",
    "deliveryAddress",
    "collectionAddress",
    "driverInformation1",
    "driverInformation2",
    "creditCard",
    "additionalNotes",
    "countryCode",
    "languageCode"
})
@XmlRootElement(name = "ModifyReserveInformationRequest")
public class ModifyReserveInformationRequest {

    @XmlElement(name = "ReserveId")
    protected String reserveId;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "Flight")
    protected String flight;
    @XmlElement(name = "LocalAddress")
    protected String localAddress;
    @XmlElement(name = "DeliveryAddress")
    protected String deliveryAddress;
    @XmlElement(name = "CollectionAddress")
    protected String collectionAddress;
    @XmlElement(name = "DriverInformation1")
    protected PersonInformation driverInformation1;
    @XmlElement(name = "DriverInformation2")
    protected PersonInformation driverInformation2;
    @XmlElement(name = "CreditCard")
    protected CreditCardInformation creditCard;
    @XmlElement(name = "AdditionalNotes")
    protected String additionalNotes;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;

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

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlight(String value) {
        this.flight = value;
    }

    /**
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAddress(String value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddress(String value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the collectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAddress(String value) {
        this.collectionAddress = value;
    }

    /**
     * Gets the value of the driverInformation1 property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformation }
     *     
     */
    public PersonInformation getDriverInformation1() {
        return driverInformation1;
    }

    /**
     * Sets the value of the driverInformation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformation }
     *     
     */
    public void setDriverInformation1(PersonInformation value) {
        this.driverInformation1 = value;
    }

    /**
     * Gets the value of the driverInformation2 property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformation }
     *     
     */
    public PersonInformation getDriverInformation2() {
        return driverInformation2;
    }

    /**
     * Sets the value of the driverInformation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformation }
     *     
     */
    public void setDriverInformation2(PersonInformation value) {
        this.driverInformation2 = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInformation }
     *     
     */
    public CreditCardInformation getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInformation }
     *     
     */
    public void setCreditCard(CreditCardInformation value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the additionalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNotes() {
        return additionalNotes;
    }

    /**
     * Sets the value of the additionalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNotes(String value) {
        this.additionalNotes = value;
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
