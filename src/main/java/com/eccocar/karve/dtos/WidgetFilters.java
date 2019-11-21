
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for widgetFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="widgetFilters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categories" type="{http://rentacarwebpage.karve.com/}categories" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doorsNumbers" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fuels" type="{http://rentacarwebpage.karve.com/}fuel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occupantsNumbers" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shiftingGearCodes" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "widgetFilters", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "categories",
    "doorsNumbers",
    "fuels",
    "occupantsNumbers",
    "shiftingGearCodes"
})
public class WidgetFilters {

    @XmlElement(nillable = true)
    protected List<Category> categories;
    @XmlElement(nillable = true)
    protected List<Integer> doorsNumbers;
    @XmlElement(nillable = true)
    protected List<Fuel> fuels;
    @XmlElement(nillable = true)
    protected List<Integer> occupantsNumbers;
    @XmlElement(nillable = true)
    protected List<Integer> shiftingGearCodes;

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getCategories() {
        if (categories == null) {
            categories = new ArrayList<Category>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the doorsNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doorsNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoorsNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDoorsNumbers() {
        if (doorsNumbers == null) {
            doorsNumbers = new ArrayList<Integer>();
        }
        return this.doorsNumbers;
    }

    /**
     * Gets the value of the fuels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fuel }
     * 
     * 
     */
    public List<Fuel> getFuels() {
        if (fuels == null) {
            fuels = new ArrayList<Fuel>();
        }
        return this.fuels;
    }

    /**
     * Gets the value of the occupantsNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupantsNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupantsNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOccupantsNumbers() {
        if (occupantsNumbers == null) {
            occupantsNumbers = new ArrayList<Integer>();
        }
        return this.occupantsNumbers;
    }

    /**
     * Gets the value of the shiftingGearCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftingGearCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftingGearCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getShiftingGearCodes() {
        if (shiftingGearCodes == null) {
            shiftingGearCodes = new ArrayList<Integer>();
        }
        return this.shiftingGearCodes;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setDoorsNumbers(List<Integer> doorsNumbers) {
        this.doorsNumbers = doorsNumbers;
    }

    public void setFuels(List<Fuel> fuels) {
        this.fuels = fuels;
    }

    public void setOccupantsNumbers(List<Integer> occupantsNumbers) {
        this.occupantsNumbers = occupantsNumbers;
    }

    public void setShiftingGearCodes(List<Integer> shiftingGearCodes) {
        this.shiftingGearCodes = shiftingGearCodes;
    }
}
