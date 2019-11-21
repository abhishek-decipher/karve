
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDriverConcept" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="destinationCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCurrencyValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dropOffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotationNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotationOptions" type="{http://rentacarwebpage.karve.com/}quotationOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedCurrencyValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quotation", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "additionalDriverConcept",
    "billingDays",
    "destinationCurrencyCode",
    "destinationCurrencyValue",
    "dropOffDate",
    "dropOffOfficeId",
    "dropOffOfficeName",
    "dropOffTime",
    "pickUpDate",
    "pickUpOfficeId",
    "pickUpOfficeName",
    "pickUpTime",
    "quotationNote",
    "quotationOptions",
    "requestedCurrencyCode",
    "requestedCurrencyValue"
})
public class Quotation {

    protected Integer additionalDriverConcept;
    protected Integer billingDays;
    protected String destinationCurrencyCode;
    protected Double destinationCurrencyValue;
    protected String dropOffDate;
    protected String dropOffOfficeId;
    protected String dropOffOfficeName;
    protected String dropOffTime;
    protected String pickUpDate;
    protected String pickUpOfficeId;
    protected String pickUpOfficeName;
    protected String pickUpTime;
    protected String quotationNote;
    @XmlElement(nillable = true)
    protected List<QuotationOption> quotationOptions;
    protected String requestedCurrencyCode;
    protected Double requestedCurrencyValue;

    /**
     * Gets the value of the additionalDriverConcept property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalDriverConcept() {
        return additionalDriverConcept;
    }

    /**
     * Sets the value of the additionalDriverConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalDriverConcept(Integer value) {
        this.additionalDriverConcept = value;
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
     * Gets the value of the quotationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationNote() {
        return quotationNote;
    }

    /**
     * Sets the value of the quotationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationNote(String value) {
        this.quotationNote = value;
    }

    /**
     * Gets the value of the quotationOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotationOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotationOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotationOption }
     * 
     * 
     */
    public List<QuotationOption> getQuotationOptions() {
        if (quotationOptions == null) {
            quotationOptions = new ArrayList<QuotationOption>();
        }
        return this.quotationOptions;
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

}
