
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyReserveConceptsByCodeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyReserveConceptsByCodeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddConceptsIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeleteConceptsIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChargedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyReserveConceptsByCodeRequest", propOrder = {
    "reserveCode",
    "addConceptsIds",
    "deleteConceptsIds",
    "chargedAmount",
    "countryCode",
    "languageCode"
})
@XmlRootElement(name = "ModifyReserveConceptsByCodeRequest")
public class ModifyReserveConceptsByCodeRequest {

    @XmlElement(name = "ReserveCode")
    protected String reserveCode;
    @XmlElement(name = "AddConceptsIds", type = Integer.class)
    protected List<Integer> addConceptsIds;
    @XmlElement(name = "DeleteConceptsIds", type = Integer.class)
    protected List<Integer> deleteConceptsIds;
    @XmlElement(name = "ChargedAmount")
    protected Double chargedAmount;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;

    /**
     * Gets the value of the reserveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveCode() {
        return reserveCode;
    }

    /**
     * Sets the value of the reserveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveCode(String value) {
        this.reserveCode = value;
    }

    /**
     * Gets the value of the addConceptsIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addConceptsIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddConceptsIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAddConceptsIds() {
        if (addConceptsIds == null) {
            addConceptsIds = new ArrayList<Integer>();
        }
        return this.addConceptsIds;
    }

    /**
     * Gets the value of the deleteConceptsIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteConceptsIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteConceptsIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDeleteConceptsIds() {
        if (deleteConceptsIds == null) {
            deleteConceptsIds = new ArrayList<Integer>();
        }
        return this.deleteConceptsIds;
    }

    /**
     * Gets the value of the chargedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Sets the value of the chargedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChargedAmount(Double value) {
        this.chargedAmount = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
