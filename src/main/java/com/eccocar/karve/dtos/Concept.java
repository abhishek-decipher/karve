
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for concept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowRepeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discountCodes" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excluding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extraOrInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDaily" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrePaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentageOfTaxes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="priceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="priceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxablePriceInDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxablePriceInRequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concept", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "allowRepeat",
    "billingDays",
    "description",
    "discount",
    "discountCodes",
    "excluding",
    "extraOrInsurance",
    "id",
    "included",
    "isDaily",
    "isPrePaid",
    "name",
    "percentageOfTaxes",
    "price",
    "priceInDestinationCurrency",
    "priceInRequestedCurrency",
    "rateId",
    "required",
    "taxablePrice",
    "taxablePriceInDestinationCurrency",
    "taxablePriceInRequestedCurrency"
})
public class Concept {

    protected Boolean allowRepeat;
    protected Integer billingDays;
    protected String description;
    protected Double discount;
    @XmlElement(nillable = true)
    protected List<Integer> discountCodes;
    protected Boolean excluding;
    protected Boolean extraOrInsurance;
    protected Integer id;
    protected Boolean included;
    protected Boolean isDaily;
    protected Boolean isPrePaid;
    protected String name;
    protected Double percentageOfTaxes;
    protected Double price;
    protected Double priceInDestinationCurrency;
    protected Double priceInRequestedCurrency;
    protected String rateId;
    protected Boolean required;
    protected Double taxablePrice;
    protected Double taxablePriceInDestinationCurrency;
    protected Double taxablePriceInRequestedCurrency;

    /**
     * Gets the value of the allowRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRepeat() {
        return allowRepeat;
    }

    /**
     * Sets the value of the allowRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRepeat(Boolean value) {
        this.allowRepeat = value;
    }

    /**
     * Gets the value of the billingDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingDays() {
        return billingDays;
    }

    /**
     * Sets the value of the billingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingDays(Integer value) {
        this.billingDays = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the discountCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDiscountCodes() {
        if (discountCodes == null) {
            discountCodes = new ArrayList<Integer>();
        }
        return this.discountCodes;
    }

    /**
     * Gets the value of the excluding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluding() {
        return excluding;
    }

    /**
     * Sets the value of the excluding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluding(Boolean value) {
        this.excluding = value;
    }

    /**
     * Gets the value of the extraOrInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraOrInsurance() {
        return extraOrInsurance;
    }

    /**
     * Sets the value of the extraOrInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraOrInsurance(Boolean value) {
        this.extraOrInsurance = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluded(Boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the isDaily property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDaily() {
        return isDaily;
    }

    /**
     * Sets the value of the isDaily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDaily(Boolean value) {
        this.isDaily = value;
    }

    /**
     * Gets the value of the isPrePaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrePaid() {
        return isPrePaid;
    }

    /**
     * Sets the value of the isPrePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrePaid(Boolean value) {
        this.isPrePaid = value;
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
     * Gets the value of the percentageOfTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentageOfTaxes() {
        return percentageOfTaxes;
    }

    /**
     * Sets the value of the percentageOfTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentageOfTaxes(Double value) {
        this.percentageOfTaxes = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceInDestinationCurrency() {
        return priceInDestinationCurrency;
    }

    /**
     * Sets the value of the priceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceInDestinationCurrency(Double value) {
        this.priceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the priceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceInRequestedCurrency() {
        return priceInRequestedCurrency;
    }

    /**
     * Sets the value of the priceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceInRequestedCurrency(Double value) {
        this.priceInRequestedCurrency = value;
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
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the taxablePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxablePrice() {
        return taxablePrice;
    }

    /**
     * Sets the value of the taxablePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxablePrice(Double value) {
        this.taxablePrice = value;
    }

    /**
     * Gets the value of the taxablePriceInDestinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxablePriceInDestinationCurrency() {
        return taxablePriceInDestinationCurrency;
    }

    /**
     * Sets the value of the taxablePriceInDestinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxablePriceInDestinationCurrency(Double value) {
        this.taxablePriceInDestinationCurrency = value;
    }

    /**
     * Gets the value of the taxablePriceInRequestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxablePriceInRequestedCurrency() {
        return taxablePriceInRequestedCurrency;
    }

    /**
     * Sets the value of the taxablePriceInRequestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxablePriceInRequestedCurrency(Double value) {
        this.taxablePriceInRequestedCurrency = value;
    }

}
