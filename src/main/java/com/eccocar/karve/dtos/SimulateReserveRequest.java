
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SimulateReserveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimulateReserveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpDeliveryPlaceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DropOffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropOffOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropOffCollectionPlaceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Flight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffiliateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChargedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ConceptsIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DriverCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverInformation1" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="DriverCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverInformation2" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{http://rentacarwebpage.karve.com/}creditCardInformation" minOccurs="0"/>
 *         &lt;element name="AdditionalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SimulateReserveRequest", propOrder = {
    "reserveId",
    "clientCode",
    "clientName",
    "pickUpDate",
    "pickUpTime",
    "pickUpOfficeId",
    "pickUpDeliveryPlaceCode",
    "dropOffDate",
    "dropOffTime",
    "dropOffOfficeId",
    "dropOffCollectionPlaceCode",
    "flight",
    "localAddress",
    "deliveryAddress",
    "collectionAddress",
    "carTypeId",
    "rateId",
    "promotionCode",
    "affiliateCode",
    "couponCode",
    "discount",
    "paymentMethod",
    "chargedAmount",
    "conceptsIds",
    "driverCode1",
    "driverInformation1",
    "driverCode2",
    "driverInformation2",
    "creditCard",
    "additionalNotes",
    "countryCode",
    "currencyCode",
    "languageCode"
})
@XmlRootElement(name = "SimulateReserveRequest")
public class SimulateReserveRequest {

    @XmlElement(name = "ReserveId")
    protected String reserveId;
    @XmlElement(name = "ClientCode")
    protected String clientCode;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "PickUpDate")
    protected String pickUpDate;
    @XmlElement(name = "PickUpTime")
    protected String pickUpTime;
    @XmlElement(name = "PickUpOfficeId")
    protected String pickUpOfficeId;
    @XmlElement(name = "PickUpDeliveryPlaceCode")
    protected Integer pickUpDeliveryPlaceCode;
    @XmlElement(name = "DropOffDate")
    protected String dropOffDate;
    @XmlElement(name = "DropOffTime")
    protected String dropOffTime;
    @XmlElement(name = "DropOffOfficeId")
    protected String dropOffOfficeId;
    @XmlElement(name = "DropOffCollectionPlaceCode")
    protected Integer dropOffCollectionPlaceCode;
    @XmlElement(name = "Flight")
    protected String flight;
    @XmlElement(name = "LocalAddress")
    protected String localAddress;
    @XmlElement(name = "DeliveryAddress")
    protected String deliveryAddress;
    @XmlElement(name = "CollectionAddress")
    protected String collectionAddress;
    @XmlElement(name = "CarTypeId")
    protected String carTypeId;
    @XmlElement(name = "RateId")
    protected String rateId;
    @XmlElement(name = "PromotionCode")
    protected String promotionCode;
    @XmlElement(name = "AffiliateCode")
    protected String affiliateCode;
    @XmlElement(name = "CouponCode")
    protected String couponCode;
    @XmlElement(name = "Discount")
    protected Double discount;
    @XmlElement(name = "PaymentMethod")
    protected Integer paymentMethod;
    @XmlElement(name = "ChargedAmount")
    protected Double chargedAmount;
    @XmlElement(name = "ConceptsIds", type = Integer.class)
    protected List<Integer> conceptsIds;
    @XmlElement(name = "DriverCode1")
    protected String driverCode1;
    @XmlElement(name = "DriverInformation1")
    protected PersonInformation driverInformation1;
    @XmlElement(name = "DriverCode2")
    protected String driverCode2;
    @XmlElement(name = "DriverInformation2")
    protected PersonInformation driverInformation2;
    @XmlElement(name = "CreditCard")
    protected CreditCardInformation creditCard;
    @XmlElement(name = "AdditionalNotes")
    protected String additionalNotes;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
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
     * Gets the value of the pickUpDeliveryPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickUpDeliveryPlaceCode() {
        return pickUpDeliveryPlaceCode;
    }

    /**
     * Sets the value of the pickUpDeliveryPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickUpDeliveryPlaceCode(Integer value) {
        this.pickUpDeliveryPlaceCode = value;
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
     * Gets the value of the dropOffCollectionPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDropOffCollectionPlaceCode() {
        return dropOffCollectionPlaceCode;
    }

    /**
     * Sets the value of the dropOffCollectionPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDropOffCollectionPlaceCode(Integer value) {
        this.dropOffCollectionPlaceCode = value;
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
     * Gets the value of the rateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateId() {
        return rateId;
    }

    /**
     * Sets the value of the rateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateId(String value) {
        this.rateId = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the affiliateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateCode() {
        return affiliateCode;
    }

    /**
     * Sets the value of the affiliateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateCode(String value) {
        this.affiliateCode = value;
    }

    /**
     * Gets the value of the couponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Sets the value of the couponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount(Double value) {
        this.discount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMethod(Integer value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the chargedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Sets the value of the chargedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChargedAmount(Double value) {
        this.chargedAmount = value;
    }

    /**
     * Gets the value of the conceptsIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptsIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptsIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getConceptsIds() {
        if (conceptsIds == null) {
            conceptsIds = new ArrayList<Integer>();
        }
        return this.conceptsIds;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
