
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carTypeFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carTypeFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airConditioning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baggagesNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doorsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fuelTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOutstanding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minimumAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumAgeCDW" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumCardsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumOldLicense" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumOldLicenseCDW" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="occupantsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shiftingGearsType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shiftingGearsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carTypeFeatures", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "airConditioning",
    "baggagesNumber",
    "categoryId",
    "categoryName",
    "doorsNumber",
    "fuelType",
    "fuelTypeName",
    "gps",
    "isGuaranteed",
    "isOutstanding",
    "minimumAge",
    "minimumAgeCDW",
    "minimumCardsNumber",
    "minimumOldLicense",
    "minimumOldLicenseCDW",
    "occupantsNumber",
    "shiftingGearsType",
    "shiftingGearsTypeName"
})
public class CarTypeFeatures {

    protected Boolean airConditioning;
    protected Integer baggagesNumber;
    protected String categoryId;
    protected String categoryName;
    protected Integer doorsNumber;
    protected Integer fuelType;
    protected String fuelTypeName;
    @XmlElement(name = "GPS")
    protected Integer gps;
    protected Boolean isGuaranteed;
    protected Boolean isOutstanding;
    protected Integer minimumAge;
    protected Integer minimumAgeCDW;
    protected Integer minimumCardsNumber;
    protected Integer minimumOldLicense;
    protected Integer minimumOldLicenseCDW;
    protected Integer occupantsNumber;
    protected Integer shiftingGearsType;
    protected String shiftingGearsTypeName;

    /**
     * Gets the value of the airConditioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioning(Boolean value) {
        this.airConditioning = value;
    }

    /**
     * Gets the value of the baggagesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaggagesNumber() {
        return baggagesNumber;
    }

    /**
     * Sets the value of the baggagesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaggagesNumber(Integer value) {
        this.baggagesNumber = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the doorsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    /**
     * Sets the value of the doorsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoorsNumber(Integer value) {
        this.doorsNumber = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuelType(Integer value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the fuelTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelTypeName() {
        return fuelTypeName;
    }

    /**
     * Sets the value of the fuelTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelTypeName(String value) {
        this.fuelTypeName = value;
    }

    /**
     * Gets the value of the gps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGPS() {
        return gps;
    }

    /**
     * Sets the value of the gps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGPS(Integer value) {
        this.gps = value;
    }

    /**
     * Gets the value of the isGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGuaranteed() {
        return isGuaranteed;
    }

    /**
     * Sets the value of the isGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGuaranteed(Boolean value) {
        this.isGuaranteed = value;
    }

    /**
     * Gets the value of the isOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutstanding() {
        return isOutstanding;
    }

    /**
     * Sets the value of the isOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutstanding(Boolean value) {
        this.isOutstanding = value;
    }

    /**
     * Gets the value of the minimumAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumAge() {
        return minimumAge;
    }

    /**
     * Sets the value of the minimumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumAge(Integer value) {
        this.minimumAge = value;
    }

    /**
     * Gets the value of the minimumAgeCDW property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumAgeCDW() {
        return minimumAgeCDW;
    }

    /**
     * Sets the value of the minimumAgeCDW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumAgeCDW(Integer value) {
        this.minimumAgeCDW = value;
    }

    /**
     * Gets the value of the minimumCardsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumCardsNumber() {
        return minimumCardsNumber;
    }

    /**
     * Sets the value of the minimumCardsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumCardsNumber(Integer value) {
        this.minimumCardsNumber = value;
    }

    /**
     * Gets the value of the minimumOldLicense property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumOldLicense() {
        return minimumOldLicense;
    }

    /**
     * Sets the value of the minimumOldLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumOldLicense(Integer value) {
        this.minimumOldLicense = value;
    }

    /**
     * Gets the value of the minimumOldLicenseCDW property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumOldLicenseCDW() {
        return minimumOldLicenseCDW;
    }

    /**
     * Sets the value of the minimumOldLicenseCDW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumOldLicenseCDW(Integer value) {
        this.minimumOldLicenseCDW = value;
    }

    /**
     * Gets the value of the occupantsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccupantsNumber() {
        return occupantsNumber;
    }

    /**
     * Sets the value of the occupantsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccupantsNumber(Integer value) {
        this.occupantsNumber = value;
    }

    /**
     * Gets the value of the shiftingGearsType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShiftingGearsType() {
        return shiftingGearsType;
    }

    /**
     * Sets the value of the shiftingGearsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShiftingGearsType(Integer value) {
        this.shiftingGearsType = value;
    }

    /**
     * Gets the value of the shiftingGearsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiftingGearsTypeName() {
        return shiftingGearsTypeName;
    }

    /**
     * Sets the value of the shiftingGearsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiftingGearsTypeName(String value) {
        this.shiftingGearsTypeName = value;
    }

}
