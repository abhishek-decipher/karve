
package com.eccocar.karve.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmPreReserveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmPreReserveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseRunTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResponseServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseData" type="{http://rentacarwebpage.karve.com/}reserve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmPreReserveResponse", namespace = "http://response.rentacarwebpage.karve.com/", propOrder = {
    "responseVersion",
    "responseCode",
    "responseMessage",
    "responseRunTime",
    "responseServerName",
    "responseDatetime",
    "responseData"
})
public class ConfirmPreReserveResponse {

    @XmlElement(name = "ResponseVersion")
    protected Integer responseVersion;
    @XmlElement(name = "ResponseCode")
    protected Integer responseCode;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "ResponseRunTime")
    protected Long responseRunTime;
    @XmlElement(name = "ResponseServerName")
    protected String responseServerName;
    @XmlElement(name = "ResponseDatetime")
    protected String responseDatetime;
    @XmlElement(name = "ResponseData")
    protected Reserve responseData;

    /**
     * Gets the value of the responseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseVersion() {
        return responseVersion;
    }

    /**
     * Sets the value of the responseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseVersion(Integer value) {
        this.responseVersion = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseRunTime() {
        return responseRunTime;
    }

    /**
     * Sets the value of the responseRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseRunTime(Long value) {
        this.responseRunTime = value;
    }

    /**
     * Gets the value of the responseServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseServerName() {
        return responseServerName;
    }

    /**
     * Sets the value of the responseServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseServerName(String value) {
        this.responseServerName = value;
    }

    /**
     * Gets the value of the responseDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDatetime() {
        return responseDatetime;
    }

    /**
     * Sets the value of the responseDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDatetime(String value) {
        this.responseDatetime = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link Reserve }
     *     
     */
    public Reserve getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserve }
     *     
     */
    public void setResponseData(Reserve value) {
        this.responseData = value;
    }

}
