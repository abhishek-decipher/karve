
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateCarTypeRentalPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateCarTypeRentalPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isScaledPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noScaledPrice" type="{http://rentacarwebpage.karve.com/}rateNoScaledPrice" minOccurs="0"/>
 *         &lt;element name="scaledPrices" type="{http://rentacarwebpage.karve.com/}rateScaledPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateCarTypeRentalPrice", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "carTypeId",
    "isScaledPrice",
    "noScaledPrice",
    "scaledPrices"
})
public class RateCarTypeRentalPrice {

    protected String carTypeId;
    protected Boolean isScaledPrice;
    protected RateNoScaledPrice noScaledPrice;
    @XmlElement(nillable = true)
    protected List<RateScaledPrice> scaledPrices;

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
     * Gets the value of the isScaledPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsScaledPrice() {
        return isScaledPrice;
    }

    /**
     * Sets the value of the isScaledPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsScaledPrice(Boolean value) {
        this.isScaledPrice = value;
    }

    /**
     * Gets the value of the noScaledPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RateNoScaledPrice }
     *     
     */
    public RateNoScaledPrice getNoScaledPrice() {
        return noScaledPrice;
    }

    /**
     * Sets the value of the noScaledPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateNoScaledPrice }
     *     
     */
    public void setNoScaledPrice(RateNoScaledPrice value) {
        this.noScaledPrice = value;
    }

    /**
     * Gets the value of the scaledPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaledPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaledPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateScaledPrice }
     * 
     * 
     */
    public List<RateScaledPrice> getScaledPrices() {
        if (scaledPrices == null) {
            scaledPrices = new ArrayList<RateScaledPrice>();
        }
        return this.scaledPrices;
    }

}
