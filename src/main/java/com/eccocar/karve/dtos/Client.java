
package com.eccocar.karve.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedRates" type="{http://rentacarwebpage.karve.com/}clientRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientInformation" type="{http://rentacarwebpage.karve.com/}personInformation" minOccurs="0"/>
 *         &lt;element name="isCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", namespace = "http://rentacarwebpage.karve.com/", propOrder = {
    "assignedRates",
    "clientCode",
    "clientInformation",
    "isCompany"
})
public class Client {

    @XmlElement(nillable = true)
    protected List<ClientRate> assignedRates;
    protected String clientCode;
    protected PersonInformation clientInformation;
    protected Boolean isCompany;

    /**
     * Gets the value of the assignedRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientRate }
     * 
     * 
     */
    public List<ClientRate> getAssignedRates() {
        if (assignedRates == null) {
            assignedRates = new ArrayList<ClientRate>();
        }
        return this.assignedRates;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the clientInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformation }
     *     
     */
    public PersonInformation getClientInformation() {
        return clientInformation;
    }

    /**
     * Sets the value of the clientInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformation }
     *     
     */
    public void setClientInformation(PersonInformation value) {
        this.clientInformation = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompany(Boolean value) {
        this.isCompany = value;
    }

}
