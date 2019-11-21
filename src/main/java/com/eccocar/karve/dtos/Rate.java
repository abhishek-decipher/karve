
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dropOffDateFrom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateFrom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateFrom3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateFrom4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateFrom5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateUntil1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateUntil2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateUntil3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateUntil4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropOffDateUntil5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isUnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="kilometerPrices" type="{http://rentacarwebpage.karve.com/}rateCarTypeKilometerPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateFrom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateFrom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateFrom3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateFrom4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateFrom5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateUntil1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateUntil2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateUntil3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateUntil4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDateUntil5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerDateUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentalPrices" type="{http://rentacarwebpage.karve.com/}rateConceptRentalPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "dropOffDateFrom1",
    "dropOffDateFrom2",
    "dropOffDateFrom3",
    "dropOffDateFrom4",
    "dropOffDateFrom5",
    "dropOffDateUntil1",
    "dropOffDateUntil2",
    "dropOffDateUntil3",
    "dropOffDateUntil4",
    "dropOffDateUntil5",
    "id",
    "isUnlimitedMileage",
    "kilometerPrices",
    "name",
    "pickUpDateFrom1",
    "pickUpDateFrom2",
    "pickUpDateFrom3",
    "pickUpDateFrom4",
    "pickUpDateFrom5",
    "pickUpDateUntil1",
    "pickUpDateUntil2",
    "pickUpDateUntil3",
    "pickUpDateUntil4",
    "pickUpDateUntil5",
    "registerDateFrom",
    "registerDateUntil",
    "rentalPrices"
})
public class Rate {

    protected String dropOffDateFrom1;
    protected String dropOffDateFrom2;
    protected String dropOffDateFrom3;
    protected String dropOffDateFrom4;
    protected String dropOffDateFrom5;
    protected String dropOffDateUntil1;
    protected String dropOffDateUntil2;
    protected String dropOffDateUntil3;
    protected String dropOffDateUntil4;
    protected String dropOffDateUntil5;
    protected String id;
    protected Boolean isUnlimitedMileage;
    @XmlElement(nillable = true)
    protected List<RateCarTypeKilometerPrice> kilometerPrices;
    protected String name;
    protected String pickUpDateFrom1;
    protected String pickUpDateFrom2;
    protected String pickUpDateFrom3;
    protected String pickUpDateFrom4;
    protected String pickUpDateFrom5;
    protected String pickUpDateUntil1;
    protected String pickUpDateUntil2;
    protected String pickUpDateUntil3;
    protected String pickUpDateUntil4;
    protected String pickUpDateUntil5;
    protected String registerDateFrom;
    protected String registerDateUntil;
    @XmlElement(nillable = true)
    protected List<RateConceptRentalPrice> rentalPrices;

    /**
     * Gets the value of the dropOffDateFrom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateFrom1() {
        return dropOffDateFrom1;
    }

    /**
     * Sets the value of the dropOffDateFrom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateFrom1(String value) {
        this.dropOffDateFrom1 = value;
    }

    /**
     * Gets the value of the dropOffDateFrom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateFrom2() {
        return dropOffDateFrom2;
    }

    /**
     * Sets the value of the dropOffDateFrom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateFrom2(String value) {
        this.dropOffDateFrom2 = value;
    }

    /**
     * Gets the value of the dropOffDateFrom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateFrom3() {
        return dropOffDateFrom3;
    }

    /**
     * Sets the value of the dropOffDateFrom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateFrom3(String value) {
        this.dropOffDateFrom3 = value;
    }

    /**
     * Gets the value of the dropOffDateFrom4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateFrom4() {
        return dropOffDateFrom4;
    }

    /**
     * Sets the value of the dropOffDateFrom4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateFrom4(String value) {
        this.dropOffDateFrom4 = value;
    }

    /**
     * Gets the value of the dropOffDateFrom5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateFrom5() {
        return dropOffDateFrom5;
    }

    /**
     * Sets the value of the dropOffDateFrom5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateFrom5(String value) {
        this.dropOffDateFrom5 = value;
    }

    /**
     * Gets the value of the dropOffDateUntil1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateUntil1() {
        return dropOffDateUntil1;
    }

    /**
     * Sets the value of the dropOffDateUntil1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateUntil1(String value) {
        this.dropOffDateUntil1 = value;
    }

    /**
     * Gets the value of the dropOffDateUntil2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateUntil2() {
        return dropOffDateUntil2;
    }

    /**
     * Sets the value of the dropOffDateUntil2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateUntil2(String value) {
        this.dropOffDateUntil2 = value;
    }

    /**
     * Gets the value of the dropOffDateUntil3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateUntil3() {
        return dropOffDateUntil3;
    }

    /**
     * Sets the value of the dropOffDateUntil3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateUntil3(String value) {
        this.dropOffDateUntil3 = value;
    }

    /**
     * Gets the value of the dropOffDateUntil4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateUntil4() {
        return dropOffDateUntil4;
    }

    /**
     * Sets the value of the dropOffDateUntil4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateUntil4(String value) {
        this.dropOffDateUntil4 = value;
    }

    /**
     * Gets the value of the dropOffDateUntil5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDateUntil5() {
        return dropOffDateUntil5;
    }

    /**
     * Sets the value of the dropOffDateUntil5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDateUntil5(String value) {
        this.dropOffDateUntil5 = value;
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
     * Gets the value of the isUnlimitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnlimitedMileage() {
        return isUnlimitedMileage;
    }

    /**
     * Sets the value of the isUnlimitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnlimitedMileage(Boolean value) {
        this.isUnlimitedMileage = value;
    }

    /**
     * Gets the value of the kilometerPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kilometerPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKilometerPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateCarTypeKilometerPrice }
     * 
     * 
     */
    public List<RateCarTypeKilometerPrice> getKilometerPrices() {
        if (kilometerPrices == null) {
            kilometerPrices = new ArrayList<RateCarTypeKilometerPrice>();
        }
        return this.kilometerPrices;
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
     * Gets the value of the pickUpDateFrom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateFrom1() {
        return pickUpDateFrom1;
    }

    /**
     * Sets the value of the pickUpDateFrom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateFrom1(String value) {
        this.pickUpDateFrom1 = value;
    }

    /**
     * Gets the value of the pickUpDateFrom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateFrom2() {
        return pickUpDateFrom2;
    }

    /**
     * Sets the value of the pickUpDateFrom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateFrom2(String value) {
        this.pickUpDateFrom2 = value;
    }

    /**
     * Gets the value of the pickUpDateFrom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateFrom3() {
        return pickUpDateFrom3;
    }

    /**
     * Sets the value of the pickUpDateFrom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateFrom3(String value) {
        this.pickUpDateFrom3 = value;
    }

    /**
     * Gets the value of the pickUpDateFrom4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateFrom4() {
        return pickUpDateFrom4;
    }

    /**
     * Sets the value of the pickUpDateFrom4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateFrom4(String value) {
        this.pickUpDateFrom4 = value;
    }

    /**
     * Gets the value of the pickUpDateFrom5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateFrom5() {
        return pickUpDateFrom5;
    }

    /**
     * Sets the value of the pickUpDateFrom5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateFrom5(String value) {
        this.pickUpDateFrom5 = value;
    }

    /**
     * Gets the value of the pickUpDateUntil1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateUntil1() {
        return pickUpDateUntil1;
    }

    /**
     * Sets the value of the pickUpDateUntil1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateUntil1(String value) {
        this.pickUpDateUntil1 = value;
    }

    /**
     * Gets the value of the pickUpDateUntil2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateUntil2() {
        return pickUpDateUntil2;
    }

    /**
     * Sets the value of the pickUpDateUntil2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateUntil2(String value) {
        this.pickUpDateUntil2 = value;
    }

    /**
     * Gets the value of the pickUpDateUntil3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateUntil3() {
        return pickUpDateUntil3;
    }

    /**
     * Sets the value of the pickUpDateUntil3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateUntil3(String value) {
        this.pickUpDateUntil3 = value;
    }

    /**
     * Gets the value of the pickUpDateUntil4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateUntil4() {
        return pickUpDateUntil4;
    }

    /**
     * Sets the value of the pickUpDateUntil4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateUntil4(String value) {
        this.pickUpDateUntil4 = value;
    }

    /**
     * Gets the value of the pickUpDateUntil5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDateUntil5() {
        return pickUpDateUntil5;
    }

    /**
     * Sets the value of the pickUpDateUntil5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDateUntil5(String value) {
        this.pickUpDateUntil5 = value;
    }

    /**
     * Gets the value of the registerDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDateFrom() {
        return registerDateFrom;
    }

    /**
     * Sets the value of the registerDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDateFrom(String value) {
        this.registerDateFrom = value;
    }

    /**
     * Gets the value of the registerDateUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDateUntil() {
        return registerDateUntil;
    }

    /**
     * Sets the value of the registerDateUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDateUntil(String value) {
        this.registerDateUntil = value;
    }

    /**
     * Gets the value of the rentalPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateConceptRentalPrice }
     * 
     * 
     */
    public List<RateConceptRentalPrice> getRentalPrices() {
        if (rentalPrices == null) {
            rentalPrices = new ArrayList<RateConceptRentalPrice>();
        }
        return this.rentalPrices;
    }

}
