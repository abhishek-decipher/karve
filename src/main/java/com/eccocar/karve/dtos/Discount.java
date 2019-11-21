
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for discount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carTypeIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="durationDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pickUpPeriods" type="{http://rentacarwebpage.karve.com/}periodDateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registerPeriod" type="{http://rentacarwebpage.karve.com/}periodDateTime" minOccurs="0"/>
 *         &lt;element name="weekDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "carTypeIds",
    "code",
    "durationDays",
    "name",
    "officeIds",
    "percentage",
    "pickUpPeriods",
    "registerPeriod",
    "weekDays"
})
public class Discount {

    @XmlElement(nillable = true)
    protected List<String> carTypeIds;
    protected Integer code;
    protected String durationDays;
    protected String name;
    @XmlElement(nillable = true)
    protected List<String> officeIds;
    protected Double percentage;
    @XmlElement(nillable = true)
    protected List<PeriodDateTime> pickUpPeriods;
    protected PeriodDateTime registerPeriod;
    protected String weekDays;

    /**
     * Gets the value of the carTypeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carTypeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarTypeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarTypeIds() {
        if (carTypeIds == null) {
            carTypeIds = new ArrayList<String>();
        }
        return this.carTypeIds;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCode(Integer value) {
        this.code = value;
    }

    /**
     * Gets the value of the durationDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDays() {
        return durationDays;
    }

    /**
     * Sets the value of the durationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDays(String value) {
        this.durationDays = value;
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
     * Gets the value of the officeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfficeIds() {
        if (officeIds == null) {
            officeIds = new ArrayList<String>();
        }
        return this.officeIds;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentage(Double value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the pickUpPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodDateTime }
     * 
     * 
     */
    public List<PeriodDateTime> getPickUpPeriods() {
        if (pickUpPeriods == null) {
            pickUpPeriods = new ArrayList<PeriodDateTime>();
        }
        return this.pickUpPeriods;
    }

    /**
     * Gets the value of the registerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDateTime }
     *     
     */
    public PeriodDateTime getRegisterPeriod() {
        return registerPeriod;
    }

    /**
     * Sets the value of the registerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDateTime }
     *     
     */
    public void setRegisterPeriod(PeriodDateTime value) {
        this.registerPeriod = value;
    }

    /**
     * Gets the value of the weekDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekDays() {
        return weekDays;
    }

    /**
     * Sets the value of the weekDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekDays(String value) {
        this.weekDays = value;
    }

}
