
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateConceptRentalPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateConceptRentalPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carTypePrices" type="{http://rentacarwebpage.karve.com/}rateCarTypeRentalPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conceptId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dependOnCarType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="price" type="{http://rentacarwebpage.karve.com/}rateNoScaledPrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateConceptRentalPrice", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "carTypePrices",
    "conceptId",
    "dependOnCarType",
    "price"
})
public class RateConceptRentalPrice {

    @XmlElement(nillable = true)
    protected List<RateCarTypeRentalPrice> carTypePrices;
    protected Integer conceptId;
    protected Boolean dependOnCarType;
    protected RateNoScaledPrice price;

    /**
     * Gets the value of the carTypePrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carTypePrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarTypePrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateCarTypeRentalPrice }
     * 
     * 
     */
    public List<RateCarTypeRentalPrice> getCarTypePrices() {
        if (carTypePrices == null) {
            carTypePrices = new ArrayList<RateCarTypeRentalPrice>();
        }
        return this.carTypePrices;
    }

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConceptId(Integer value) {
        this.conceptId = value;
    }

    /**
     * Gets the value of the dependOnCarType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependOnCarType() {
        return dependOnCarType;
    }

    /**
     * Sets the value of the dependOnCarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependOnCarType(Boolean value) {
        this.dependOnCarType = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link RateNoScaledPrice }
     *     
     */
    public RateNoScaledPrice getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateNoScaledPrice }
     *     
     */
    public void setPrice(RateNoScaledPrice value) {
        this.price = value;
    }

}
