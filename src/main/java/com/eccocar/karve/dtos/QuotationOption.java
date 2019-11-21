
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quotationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quotationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carTypeFeatures" type="{http://rentacarwebpage.karve.com/}carTypeFeatures" minOccurs="0"/>
 *         &lt;element name="carTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carsAvailabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carsPreReserved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carsPreReservedExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carsReserved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="concepts" type="{http://rentacarwebpage.karve.com/}concept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultPercentageOfTaxes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deposit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="franchiseOfTheft" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fuelTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fuelTaxablePriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fuelTaxablePriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="kilometerTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="kilometerTaxablePriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="kilometerTaxablePriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="kilometersIncludedPerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kilometersMaximumIncluded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="multipleRentConcepts" type="{http://rentacarwebpage.karve.com/}concept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="onRequestReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionFailReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="promotionValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentConcept" type="{http://rentacarwebpage.karve.com/}concept" minOccurs="0"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxablePriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTaxesPriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quotationOption", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "carTypeFeatures",
    "carTypeId",
    "carTypeName",
    "carsAvailabled",
    "carsPreReserved",
    "carsPreReservedExpirationDateTime",
    "carsReserved",
    "concepts",
    "defaultPercentageOfTaxes",
    "deposit",
    "franchise",
    "franchiseOfTheft",
    "fuelTaxablePrice",
    "fuelTaxablePriceInDestinationCurrency",
    "fuelTaxablePriceInRequestedCurrency",
    "isAvailable",
    "kilometerTaxablePrice",
    "kilometerTaxablePriceInDestinationCurrency",
    "kilometerTaxablePriceInRequestedCurrency",
    "kilometersIncludedPerDay",
    "kilometersMaximumIncluded",
    "multipleRentConcepts",
    "onRequest",
    "onRequestReason",
    "promotionCode",
    "promotionFailReason",
    "promotionPercentage",
    "promotionValid",
    "rateId",
    "rateName",
    "rentConcept",
    "totalPrice",
    "totalPriceInDestinationCurrency",
    "totalPriceInRequestedCurrency",
    "totalTaxablePrice",
    "totalTaxablePriceInDestinationCurrency",
    "totalTaxablePriceInRequestedCurrency",
    "totalTaxesPrice",
    "totalTaxesPriceInDestinationCurrency",
    "totalTaxesPriceInRequestedCurrency"
})
public class QuotationOption {

    protected CarTypeFeatures carTypeFeatures;
    protected String carTypeId;
    protected String carTypeName;
    protected Integer carsAvailabled;
    protected Integer carsPreReserved;
    protected String carsPreReservedExpirationDateTime;
    protected Integer carsReserved;
    @XmlElement(nillable = true)
    protected List<Concept> concepts;
    protected Double defaultPercentageOfTaxes;
    protected Integer deposit;
    protected Integer franchise;
    protected Integer franchiseOfTheft;
    protected Double fuelTaxablePrice;
    protected Double fuelTaxablePriceInDestinationCurrency;
    protected Double fuelTaxablePriceInRequestedCurrency;
    protected Boolean isAvailable;
    protected Double kilometerTaxablePrice;
    protected Double kilometerTaxablePriceInDestinationCurrency;
    protected Double kilometerTaxablePriceInRequestedCurrency;
    protected Integer kilometersIncludedPerDay;
    protected Integer kilometersMaximumIncluded;
    @XmlElement(nillable = true)
    protected List<Concept> multipleRentConcepts;
    protected Boolean onRequest;
    protected String onRequestReason;
    protected String promotionCode;
    protected String promotionFailReason;
    protected Double promotionPercentage;
    protected Boolean promotionValid;
    protected String rateId;
    protected String rateName;
    protected Concept rentConcept;
    protected Double totalPrice;
    protected Double totalPriceInDestinationCurrency;
    protected Double totalPriceInRequestedCurrency;
    protected Double totalTaxablePrice;
    protected Double totalTaxablePriceInDestinationCurrency;
    protected Double totalTaxablePriceInRequestedCurrency;
    protected Double totalTaxesPrice;
    protected Double totalTaxesPriceInDestinationCurrency;
    protected Double totalTaxesPriceInRequestedCurrency;

    /**
     * Gets the value of the carTypeFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link CarTypeFeatures }
     *     
     */
    public CarTypeFeatures getCarTypeFeatures() {
        return carTypeFeatures;
    }

    /**
     * Sets the value of the carTypeFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTypeFeatures }
     *     
     */
    public void setCarTypeFeatures(CarTypeFeatures value) {
        this.carTypeFeatures = value;
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
     * Gets the value of the carTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarTypeName() {
        return carTypeName;
    }

    /**
     * Sets the value of the carTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarTypeName(String value) {
        this.carTypeName = value;
    }

    /**
     * Gets the value of the carsAvailabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarsAvailabled() {
        return carsAvailabled;
    }

    /**
     * Sets the value of the carsAvailabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarsAvailabled(Integer value) {
        this.carsAvailabled = value;
    }

    /**
     * Gets the value of the carsPreReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarsPreReserved() {
        return carsPreReserved;
    }

    /**
     * Sets the value of the carsPreReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarsPreReserved(Integer value) {
        this.carsPreReserved = value;
    }

    /**
     * Gets the value of the carsPreReservedExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarsPreReservedExpirationDateTime() {
        return carsPreReservedExpirationDateTime;
    }

    /**
     * Sets the value of the carsPreReservedExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarsPreReservedExpirationDateTime(String value) {
        this.carsPreReservedExpirationDateTime = value;
    }

    /**
     * Gets the value of the carsReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarsReserved() {
        return carsReserved;
    }

    /**
     * Sets the value of the carsReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarsReserved(Integer value) {
        this.carsReserved = value;
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
     * Gets the value of the defaultPercentageOfTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultPercentageOfTaxes() {
        return defaultPercentageOfTaxes;
    }

    /**
     * Sets the value of the defaultPercentageOfTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultPercentageOfTaxes(Double value) {
        this.defaultPercentageOfTaxes = value;
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
     * Gets the value of the fuelTaxablePriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelTaxablePriceInDestinationCurrency() {
        return fuelTaxablePriceInDestinationCurrency;
    }

    /**
     * Sets the value of the fuelTaxablePriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelTaxablePriceInDestinationCurrency(Double value) {
        this.fuelTaxablePriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the fuelTaxablePriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelTaxablePriceInRequestedCurrency() {
        return fuelTaxablePriceInRequestedCurrency;
    }

    /**
     * Sets the value of the fuelTaxablePriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelTaxablePriceInRequestedCurrency(Double value) {
        this.fuelTaxablePriceInRequestedCurrency = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
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
     * Gets the value of the kilometerTaxablePriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKilometerTaxablePriceInDestinationCurrency() {
        return kilometerTaxablePriceInDestinationCurrency;
    }

    /**
     * Sets the value of the kilometerTaxablePriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKilometerTaxablePriceInDestinationCurrency(Double value) {
        this.kilometerTaxablePriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the kilometerTaxablePriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKilometerTaxablePriceInRequestedCurrency() {
        return kilometerTaxablePriceInRequestedCurrency;
    }

    /**
     * Sets the value of the kilometerTaxablePriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKilometerTaxablePriceInRequestedCurrency(Double value) {
        this.kilometerTaxablePriceInRequestedCurrency = value;
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
     * Gets the value of the onRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnRequest() {
        return onRequest;
    }

    /**
     * Sets the value of the onRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnRequest(Boolean value) {
        this.onRequest = value;
    }

    /**
     * Gets the value of the onRequestReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnRequestReason() {
        return onRequestReason;
    }

    /**
     * Sets the value of the onRequestReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnRequestReason(String value) {
        this.onRequestReason = value;
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
     * Gets the value of the promotionFailReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionFailReason() {
        return promotionFailReason;
    }

    /**
     * Sets the value of the promotionFailReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionFailReason(String value) {
        this.promotionFailReason = value;
    }

    /**
     * Gets the value of the promotionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPromotionPercentage() {
        return promotionPercentage;
    }

    /**
     * Sets the value of the promotionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPromotionPercentage(Double value) {
        this.promotionPercentage = value;
    }

    /**
     * Gets the value of the promotionValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionValid() {
        return promotionValid;
    }

    /**
     * Sets the value of the promotionValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionValid(Boolean value) {
        this.promotionValid = value;
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
     * Gets the value of the rateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateName() {
        return rateName;
    }

    /**
     * Sets the value of the rateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateName(String value) {
        this.rateName = value;
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

}
