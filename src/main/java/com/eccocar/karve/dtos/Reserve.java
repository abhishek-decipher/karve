
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDriver1" type="{http://rentacarwebpage.karve.com/}additionalDriver" minOccurs="0"/>
 *         &lt;element name="additionalDriver2" type="{http://rentacarwebpage.karve.com/}additionalDriver" minOccurs="0"/>
 *         &lt;element name="additionalDriver3" type="{http://rentacarwebpage.karve.com/}additionalDriver" minOccurs="0"/>
 *         &lt;element name="additionalDriverConceptId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="additionalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brokerIsPrePaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cancelationChargeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cancelationChargePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="carTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concepts" type="{http://rentacarwebpage.karve.com/}concept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="couponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardInformation" type="{http://rentacarwebpage.karve.com/}creditCardInformation" minOccurs="0"/>
 *         &lt;element name="deliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deposit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="destinationCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCurrencyValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="driverCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driverInformation1" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="driverInformation2" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="dropOffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="franchiseOfTheft" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fuelTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPartialPaymentDiscountTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPartialPaymentDiscountedPendingPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPartialPaymentDiscountedPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPartialPaymentDiscountedToPayPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPaymentDiscountTaxableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatewayPaymentDiscountedPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hiredDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isPreReserve" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="kilometerTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="kilometersIncludedPerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kilometersMaximumIncluded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multipleRentConcepts" type="{http://rentacarwebpage.karve.com/}concept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentConcept" type="{http://rentacarwebpage.karve.com/}concept" minOccurs="0"/>
 *         &lt;element name="rentaCarContractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentaCarRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedCurrencyValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reserveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCarRentPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCarRentPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCarRentPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPostPaidPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPostPaidPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPostPaidPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPrePaidPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPrePaidPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPrePaidPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConceptsPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="webChargePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserve", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "additionalDriver1",
    "additionalDriver2",
    "additionalDriver3",
    "additionalDriverConceptId",
    "additionalNotes",
    "brokerIsPrePaid",
    "cancelationChargeAmount",
    "cancelationChargePercentage",
    "carTypeId",
    "chargedAmount",
    "clientCode",
    "clientName",
    "collectionAddress",
    "concepts",
    "couponCode",
    "creditCardInformation",
    "deliveryAddress",
    "deposit",
    "destinationCurrencyCode",
    "destinationCurrencyValue",
    "driverCode1",
    "driverCode2",
    "driverInformation1",
    "driverInformation2",
    "dropOffDate",
    "dropOffOfficeId",
    "dropOffOfficeMail",
    "dropOffOfficeName",
    "dropOffTime",
    "flight",
    "franchise",
    "franchiseOfTheft",
    "fuelTaxablePrice",
    "gatewayPartialPaymentDiscountTaxableAmount",
    "gatewayPartialPaymentDiscountedPendingPrice",
    "gatewayPartialPaymentDiscountedPrice",
    "gatewayPartialPaymentDiscountedToPayPrice",
    "gatewayPaymentDiscountTaxableAmount",
    "gatewayPaymentDiscountedPrice",
    "hiredDays",
    "isPreReserve",
    "kilometerTaxablePrice",
    "kilometersIncludedPerDay",
    "kilometersMaximumIncluded",
    "localAddress",
    "multipleRentConcepts",
    "paymentMethod",
    "pickUpDate",
    "pickUpOfficeId",
    "pickUpOfficeMail",
    "pickUpOfficeName",
    "pickUpTime",
    "rateId",
    "rejectionReason",
    "rentConcept",
    "rentaCarContractCode",
    "rentaCarRef",
    "requestedCurrencyCode",
    "requestedCurrencyValue",
    "reserveId",
    "status",
    "statusCode",
    "totalCarRentPrice",
    "totalCarRentPriceInDestinationCurrency",
    "totalCarRentPriceInRequestedCurrency",
    "totalConceptsPostPaidPrice",
    "totalConceptsPostPaidPriceInDestinationCurrency",
    "totalConceptsPostPaidPriceInRequestedCurrency",
    "totalConceptsPrePaidPrice",
    "totalConceptsPrePaidPriceInDestinationCurrency",
    "totalConceptsPrePaidPriceInRequestedCurrency",
    "totalConceptsPrice",
    "totalConceptsPriceInDestinationCurrency",
    "totalConceptsPriceInRequestedCurrency",
    "totalPrice",
    "totalPriceInDestinationCurrency",
    "totalPriceInRequestedCurrency",
    "totalTaxablePrice",
    "totalTaxablePriceInDestinationCurrency",
    "totalTaxablePriceInRequestedCurrency",
    "totalTaxesPrice",
    "totalTaxesPriceInDestinationCurrency",
    "totalTaxesPriceInRequestedCurrency",
    "webChargePercentage"
})
public class Reserve {

    protected AdditionalDriver additionalDriver1;
    protected AdditionalDriver additionalDriver2;
    protected AdditionalDriver additionalDriver3;
    protected Integer additionalDriverConceptId;
    protected String additionalNotes;
    protected Boolean brokerIsPrePaid;
    protected Double cancelationChargeAmount;
    protected Double cancelationChargePercentage;
    protected String carTypeId;
    protected Double chargedAmount;
    protected String clientCode;
    protected String clientName;
    protected String collectionAddress;
    @XmlElement(nillable = true)
    protected List<Concept> concepts;
    protected String couponCode;
    protected CreditCardInformation creditCardInformation;
    protected String deliveryAddress;
    protected Integer deposit;
    protected String destinationCurrencyCode;
    protected Double destinationCurrencyValue;
    protected String driverCode1;
    protected String driverCode2;
    protected PersonInformation driverInformation1;
    protected PersonInformation driverInformation2;
    protected String dropOffDate;
    protected String dropOffOfficeId;
    protected String dropOffOfficeMail;
    protected String dropOffOfficeName;
    protected String dropOffTime;
    protected String flight;
    protected Integer franchise;
    protected Integer franchiseOfTheft;
    protected Double fuelTaxablePrice;
    protected Double gatewayPartialPaymentDiscountTaxableAmount;
    protected Double gatewayPartialPaymentDiscountedPendingPrice;
    protected Double gatewayPartialPaymentDiscountedPrice;
    protected Double gatewayPartialPaymentDiscountedToPayPrice;
    protected Double gatewayPaymentDiscountTaxableAmount;
    protected Double gatewayPaymentDiscountedPrice;
    protected Integer hiredDays;
    protected Boolean isPreReserve;
    protected Double kilometerTaxablePrice;
    protected Integer kilometersIncludedPerDay;
    protected Integer kilometersMaximumIncluded;
    protected String localAddress;
    @XmlElement(nillable = true)
    protected List<Concept> multipleRentConcepts;
    protected Integer paymentMethod;
    protected String pickUpDate;
    protected String pickUpOfficeId;
    protected String pickUpOfficeMail;
    protected String pickUpOfficeName;
    protected String pickUpTime;
    protected String rateId;
    protected String rejectionReason;
    protected Concept rentConcept;
    protected String rentaCarContractCode;
    protected String rentaCarRef;
    protected String requestedCurrencyCode;
    protected Double requestedCurrencyValue;
    protected String reserveId;
    protected String status;
    protected Integer statusCode;
    protected Double totalCarRentPrice;
    protected Double totalCarRentPriceInDestinationCurrency;
    protected Double totalCarRentPriceInRequestedCurrency;
    protected Double totalConceptsPostPaidPrice;
    protected Double totalConceptsPostPaidPriceInDestinationCurrency;
    protected Double totalConceptsPostPaidPriceInRequestedCurrency;
    protected Double totalConceptsPrePaidPrice;
    protected Double totalConceptsPrePaidPriceInDestinationCurrency;
    protected Double totalConceptsPrePaidPriceInRequestedCurrency;
    protected Double totalConceptsPrice;
    protected Double totalConceptsPriceInDestinationCurrency;
    protected Double totalConceptsPriceInRequestedCurrency;
    protected Double totalPrice;
    protected Double totalPriceInDestinationCurrency;
    protected Double totalPriceInRequestedCurrency;
    protected Double totalTaxablePrice;
    protected Double totalTaxablePriceInDestinationCurrency;
    protected Double totalTaxablePriceInRequestedCurrency;
    protected Double totalTaxesPrice;
    protected Double totalTaxesPriceInDestinationCurrency;
    protected Double totalTaxesPriceInRequestedCurrency;
    protected Double webChargePercentage;

    /**
     * Gets the value of the additionalDriver1 property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDriver }
     *     
     */
    public AdditionalDriver getAdditionalDriver1() {
        return additionalDriver1;
    }

    /**
     * Sets the value of the additionalDriver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDriver }
     *     
     */
    public void setAdditionalDriver1(AdditionalDriver value) {
        this.additionalDriver1 = value;
    }

    /**
     * Gets the value of the additionalDriver2 property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDriver }
     *     
     */
    public AdditionalDriver getAdditionalDriver2() {
        return additionalDriver2;
    }

    /**
     * Sets the value of the additionalDriver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDriver }
     *     
     */
    public void setAdditionalDriver2(AdditionalDriver value) {
        this.additionalDriver2 = value;
    }

    /**
     * Gets the value of the additionalDriver3 property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDriver }
     *     
     */
    public AdditionalDriver getAdditionalDriver3() {
        return additionalDriver3;
    }

    /**
     * Sets the value of the additionalDriver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDriver }
     *     
     */
    public void setAdditionalDriver3(AdditionalDriver value) {
        this.additionalDriver3 = value;
    }

    /**
     * Gets the value of the additionalDriverConceptId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalDriverConceptId() {
        return additionalDriverConceptId;
    }

    /**
     * Sets the value of the additionalDriverConceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalDriverConceptId(Integer value) {
        this.additionalDriverConceptId = value;
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
     * Gets the value of the brokerIsPrePaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrokerIsPrePaid() {
        return brokerIsPrePaid;
    }

    /**
     * Sets the value of the brokerIsPrePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrokerIsPrePaid(Boolean value) {
        this.brokerIsPrePaid = value;
    }

    /**
     * Gets the value of the cancelationChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelationChargeAmount() {
        return cancelationChargeAmount;
    }

    /**
     * Sets the value of the cancelationChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelationChargeAmount(Double value) {
        this.cancelationChargeAmount = value;
    }

    /**
     * Gets the value of the cancelationChargePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelationChargePercentage() {
        return cancelationChargePercentage;
    }

    /**
     * Sets the value of the cancelationChargePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelationChargePercentage(Double value) {
        this.cancelationChargePercentage = value;
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
     * Gets the value of the concepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Concept }
     * 
     * 
     */
    public List<Concept> getConcepts() {
        if (concepts == null) {
            concepts = new ArrayList<Concept>();
        }
        return this.concepts;
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
     * Gets the value of the creditCardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInformation }
     *     
     */
    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    /**
     * Sets the value of the creditCardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInformation }
     *     
     */
    public void setCreditCardInformation(CreditCardInformation value) {
        this.creditCardInformation = value;
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
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeposit(Integer value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the destinationCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCurrencyCode() {
        return destinationCurrencyCode;
    }

    /**
     * Sets the value of the destinationCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCurrencyCode(String value) {
        this.destinationCurrencyCode = value;
    }

    /**
     * Gets the value of the destinationCurrencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDestinationCurrencyValue() {
        return destinationCurrencyValue;
    }

    /**
     * Sets the value of the destinationCurrencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDestinationCurrencyValue(Double value) {
        this.destinationCurrencyValue = value;
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
     * Gets the value of the dropOffOfficeMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffOfficeMail() {
        return dropOffOfficeMail;
    }

    /**
     * Sets the value of the dropOffOfficeMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffOfficeMail(String value) {
        this.dropOffOfficeMail = value;
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
     * Gets the value of the franchise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFranchise() {
        return franchise;
    }

    /**
     * Sets the value of the franchise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFranchise(Integer value) {
        this.franchise = value;
    }

    /**
     * Gets the value of the franchiseOfTheft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFranchiseOfTheft() {
        return franchiseOfTheft;
    }

    /**
     * Sets the value of the franchiseOfTheft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFranchiseOfTheft(Integer value) {
        this.franchiseOfTheft = value;
    }

    /**
     * Gets the value of the fuelTaxablePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelTaxablePrice() {
        return fuelTaxablePrice;
    }

    /**
     * Sets the value of the fuelTaxablePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelTaxablePrice(Double value) {
        this.fuelTaxablePrice = value;
    }

    /**
     * Gets the value of the gatewayPartialPaymentDiscountTaxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPartialPaymentDiscountTaxableAmount() {
        return gatewayPartialPaymentDiscountTaxableAmount;
    }

    /**
     * Sets the value of the gatewayPartialPaymentDiscountTaxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPartialPaymentDiscountTaxableAmount(Double value) {
        this.gatewayPartialPaymentDiscountTaxableAmount = value;
    }

    /**
     * Gets the value of the gatewayPartialPaymentDiscountedPendingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPartialPaymentDiscountedPendingPrice() {
        return gatewayPartialPaymentDiscountedPendingPrice;
    }

    /**
     * Sets the value of the gatewayPartialPaymentDiscountedPendingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPartialPaymentDiscountedPendingPrice(Double value) {
        this.gatewayPartialPaymentDiscountedPendingPrice = value;
    }

    /**
     * Gets the value of the gatewayPartialPaymentDiscountedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPartialPaymentDiscountedPrice() {
        return gatewayPartialPaymentDiscountedPrice;
    }

    /**
     * Sets the value of the gatewayPartialPaymentDiscountedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPartialPaymentDiscountedPrice(Double value) {
        this.gatewayPartialPaymentDiscountedPrice = value;
    }

    /**
     * Gets the value of the gatewayPartialPaymentDiscountedToPayPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPartialPaymentDiscountedToPayPrice() {
        return gatewayPartialPaymentDiscountedToPayPrice;
    }

    /**
     * Sets the value of the gatewayPartialPaymentDiscountedToPayPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPartialPaymentDiscountedToPayPrice(Double value) {
        this.gatewayPartialPaymentDiscountedToPayPrice = value;
    }

    /**
     * Gets the value of the gatewayPaymentDiscountTaxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPaymentDiscountTaxableAmount() {
        return gatewayPaymentDiscountTaxableAmount;
    }

    /**
     * Sets the value of the gatewayPaymentDiscountTaxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPaymentDiscountTaxableAmount(Double value) {
        this.gatewayPaymentDiscountTaxableAmount = value;
    }

    /**
     * Gets the value of the gatewayPaymentDiscountedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatewayPaymentDiscountedPrice() {
        return gatewayPaymentDiscountedPrice;
    }

    /**
     * Sets the value of the gatewayPaymentDiscountedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatewayPaymentDiscountedPrice(Double value) {
        this.gatewayPaymentDiscountedPrice = value;
    }

    /**
     * Gets the value of the hiredDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHiredDays() {
        return hiredDays;
    }

    /**
     * Sets the value of the hiredDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHiredDays(Integer value) {
        this.hiredDays = value;
    }

    /**
     * Gets the value of the isPreReserve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreReserve() {
        return isPreReserve;
    }

    /**
     * Sets the value of the isPreReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreReserve(Boolean value) {
        this.isPreReserve = value;
    }

    /**
     * Gets the value of the kilometerTaxablePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKilometerTaxablePrice() {
        return kilometerTaxablePrice;
    }

    /**
     * Sets the value of the kilometerTaxablePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKilometerTaxablePrice(Double value) {
        this.kilometerTaxablePrice = value;
    }

    /**
     * Gets the value of the kilometersIncludedPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometersIncludedPerDay() {
        return kilometersIncludedPerDay;
    }

    /**
     * Sets the value of the kilometersIncludedPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometersIncludedPerDay(Integer value) {
        this.kilometersIncludedPerDay = value;
    }

    /**
     * Gets the value of the kilometersMaximumIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometersMaximumIncluded() {
        return kilometersMaximumIncluded;
    }

    /**
     * Sets the value of the kilometersMaximumIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometersMaximumIncluded(Integer value) {
        this.kilometersMaximumIncluded = value;
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
     * Gets the value of the multipleRentConcepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multipleRentConcepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultipleRentConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Concept }
     * 
     * 
     */
    public List<Concept> getMultipleRentConcepts() {
        if (multipleRentConcepts == null) {
            multipleRentConcepts = new ArrayList<Concept>();
        }
        return this.multipleRentConcepts;
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
     * Gets the value of the pickUpOfficeMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpOfficeMail() {
        return pickUpOfficeMail;
    }

    /**
     * Sets the value of the pickUpOfficeMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpOfficeMail(String value) {
        this.pickUpOfficeMail = value;
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
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the rentConcept property.
     * 
     * @return
     *     possible object is
     *     {@link Concept }
     *     
     */
    public Concept getRentConcept() {
        return rentConcept;
    }

    /**
     * Sets the value of the rentConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Concept }
     *     
     */
    public void setRentConcept(Concept value) {
        this.rentConcept = value;
    }

    /**
     * Gets the value of the rentaCarContractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentaCarContractCode() {
        return rentaCarContractCode;
    }

    /**
     * Sets the value of the rentaCarContractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentaCarContractCode(String value) {
        this.rentaCarContractCode = value;
    }

    /**
     * Gets the value of the rentaCarRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentaCarRef() {
        return rentaCarRef;
    }

    /**
     * Sets the value of the rentaCarRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentaCarRef(String value) {
        this.rentaCarRef = value;
    }

    /**
     * Gets the value of the requestedCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurrencyCode() {
        return requestedCurrencyCode;
    }

    /**
     * Sets the value of the requestedCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurrencyCode(String value) {
        this.requestedCurrencyCode = value;
    }

    /**
     * Gets the value of the requestedCurrencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedCurrencyValue() {
        return requestedCurrencyValue;
    }

    /**
     * Sets the value of the requestedCurrencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedCurrencyValue(Double value) {
        this.requestedCurrencyValue = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCode(Integer value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the totalCarRentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCarRentPrice() {
        return totalCarRentPrice;
    }

    /**
     * Sets the value of the totalCarRentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCarRentPrice(Double value) {
        this.totalCarRentPrice = value;
    }

    /**
     * Gets the value of the totalCarRentPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCarRentPriceInDestinationCurrency() {
        return totalCarRentPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalCarRentPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCarRentPriceInDestinationCurrency(Double value) {
        this.totalCarRentPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalCarRentPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCarRentPriceInRequestedCurrency() {
        return totalCarRentPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalCarRentPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCarRentPriceInRequestedCurrency(Double value) {
        this.totalCarRentPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPostPaidPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPostPaidPrice() {
        return totalConceptsPostPaidPrice;
    }

    /**
     * Sets the value of the totalConceptsPostPaidPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPostPaidPrice(Double value) {
        this.totalConceptsPostPaidPrice = value;
    }

    /**
     * Gets the value of the totalConceptsPostPaidPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPostPaidPriceInDestinationCurrency() {
        return totalConceptsPostPaidPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalConceptsPostPaidPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPostPaidPriceInDestinationCurrency(Double value) {
        this.totalConceptsPostPaidPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPostPaidPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPostPaidPriceInRequestedCurrency() {
        return totalConceptsPostPaidPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalConceptsPostPaidPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPostPaidPriceInRequestedCurrency(Double value) {
        this.totalConceptsPostPaidPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPrePaidPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPrePaidPrice() {
        return totalConceptsPrePaidPrice;
    }

    /**
     * Sets the value of the totalConceptsPrePaidPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPrePaidPrice(Double value) {
        this.totalConceptsPrePaidPrice = value;
    }

    /**
     * Gets the value of the totalConceptsPrePaidPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPrePaidPriceInDestinationCurrency() {
        return totalConceptsPrePaidPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalConceptsPrePaidPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPrePaidPriceInDestinationCurrency(Double value) {
        this.totalConceptsPrePaidPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPrePaidPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPrePaidPriceInRequestedCurrency() {
        return totalConceptsPrePaidPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalConceptsPrePaidPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPrePaidPriceInRequestedCurrency(Double value) {
        this.totalConceptsPrePaidPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPrice() {
        return totalConceptsPrice;
    }

    /**
     * Sets the value of the totalConceptsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPrice(Double value) {
        this.totalConceptsPrice = value;
    }

    /**
     * Gets the value of the totalConceptsPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPriceInDestinationCurrency() {
        return totalConceptsPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalConceptsPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPriceInDestinationCurrency(Double value) {
        this.totalConceptsPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalConceptsPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConceptsPriceInRequestedCurrency() {
        return totalConceptsPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalConceptsPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConceptsPriceInRequestedCurrency(Double value) {
        this.totalConceptsPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPrice(Double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPriceInDestinationCurrency() {
        return totalPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPriceInDestinationCurrency(Double value) {
        this.totalPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPriceInRequestedCurrency() {
        return totalPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPriceInRequestedCurrency(Double value) {
        this.totalPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalTaxablePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxablePrice() {
        return totalTaxablePrice;
    }

    /**
     * Sets the value of the totalTaxablePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxablePrice(Double value) {
        this.totalTaxablePrice = value;
    }

    /**
     * Gets the value of the totalTaxablePriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxablePriceInDestinationCurrency() {
        return totalTaxablePriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalTaxablePriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxablePriceInDestinationCurrency(Double value) {
        this.totalTaxablePriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalTaxablePriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxablePriceInRequestedCurrency() {
        return totalTaxablePriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalTaxablePriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxablePriceInRequestedCurrency(Double value) {
        this.totalTaxablePriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the totalTaxesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxesPrice() {
        return totalTaxesPrice;
    }

    /**
     * Sets the value of the totalTaxesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxesPrice(Double value) {
        this.totalTaxesPrice = value;
    }

    /**
     * Gets the value of the totalTaxesPriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxesPriceInDestinationCurrency() {
        return totalTaxesPriceInDestinationCurrency;
    }

    /**
     * Sets the value of the totalTaxesPriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxesPriceInDestinationCurrency(Double value) {
        this.totalTaxesPriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the totalTaxesPriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxesPriceInRequestedCurrency() {
        return totalTaxesPriceInRequestedCurrency;
    }

    /**
     * Sets the value of the totalTaxesPriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxesPriceInRequestedCurrency(Double value) {
        this.totalTaxesPriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the webChargePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWebChargePercentage() {
        return webChargePercentage;
    }

    /**
     * Sets the value of the webChargePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWebChargePercentage(Double value) {
        this.webChargePercentage = value;
    }

}
