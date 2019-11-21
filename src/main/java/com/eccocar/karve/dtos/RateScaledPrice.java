
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateScaledPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateScaledPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kilometersIncluded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberDayFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberDayTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxablePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateScaledPrice", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "id",
    "kilometersIncluded",
    "numberDayFrom",
    "numberDayTo",
    "taxablePrice"
})
public class RateScaledPrice {

    protected Integer id;
    protected Integer kilometersIncluded;
    protected Integer numberDayFrom;
    protected Integer numberDayTo;
    protected Double taxablePrice;

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
     * Gets the value of the kilometersIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometersIncluded() {
        return kilometersIncluded;
    }

    /**
     * Sets the value of the kilometersIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometersIncluded(Integer value) {
        this.kilometersIncluded = value;
    }

    /**
     * Gets the value of the numberDayFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDayFrom() {
        return numberDayFrom;
    }

    /**
     * Sets the value of the numberDayFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDayFrom(Integer value) {
        this.numberDayFrom = value;
    }

    /**
     * Gets the value of the numberDayTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDayTo() {
        return numberDayTo;
    }

    /**
     * Sets the value of the numberDayTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDayTo(Integer value) {
        this.numberDayTo = value;
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

}
