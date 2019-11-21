
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for openingDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="openingDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closingHourAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closingHourPM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="openingHourAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingHourPM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "openingDay", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "closingHourAM",
    "closingHourPM",
    "dayName",
    "dayNumber",
    "openingHourAM",
    "openingHourPM"
})
public class OpeningDay {

    protected String closingHourAM;
    protected String closingHourPM;
    protected String dayName;
    protected Integer dayNumber;
    protected String openingHourAM;
    protected String openingHourPM;

    /**
     * Gets the value of the closingHourAM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingHourAM() {
        return closingHourAM;
    }

    /**
     * Sets the value of the closingHourAM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingHourAM(String value) {
        this.closingHourAM = value;
    }

    /**
     * Gets the value of the closingHourPM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingHourPM() {
        return closingHourPM;
    }

    /**
     * Sets the value of the closingHourPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingHourPM(String value) {
        this.closingHourPM = value;
    }

    /**
     * Gets the value of the dayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * Sets the value of the dayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayName(String value) {
        this.dayName = value;
    }

    /**
     * Gets the value of the dayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayNumber() {
        return dayNumber;
    }

    /**
     * Sets the value of the dayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayNumber(Integer value) {
        this.dayNumber = value;
    }

    /**
     * Gets the value of the openingHourAM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHourAM() {
        return openingHourAM;
    }

    /**
     * Sets the value of the openingHourAM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHourAM(String value) {
        this.openingHourAM = value;
    }

    /**
     * Gets the value of the openingHourPM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHourPM() {
        return openingHourPM;
    }

    /**
     * Sets the value of the openingHourPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHourPM(String value) {
        this.openingHourPM = value;
    }

}
