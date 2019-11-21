
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for holidayDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="holidayDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closingHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holidayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "holidayDay", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "closingHour",
    "holidayDate",
    "openingHour"
})
public class HolidayDay {

    protected String closingHour;
    protected String holidayDate;
    protected String openingHour;

    /**
     * Gets the value of the closingHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingHour() {
        return closingHour;
    }

    /**
     * Sets the value of the closingHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingHour(String value) {
        this.closingHour = value;
    }

    /**
     * Gets the value of the holidayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayDate() {
        return holidayDate;
    }

    /**
     * Sets the value of the holidayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayDate(String value) {
        this.holidayDate = value;
    }

    /**
     * Gets the value of the openingHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHour() {
        return openingHour;
    }

    /**
     * Sets the value of the openingHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHour(String value) {
        this.openingHour = value;
    }

}
