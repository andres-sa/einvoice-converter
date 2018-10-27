//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 01:36:50 PM EEST 
//


package ee.hedera.gen.einvoice_1_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceItemTotalDescription" type="{}NormalTextType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}ExtensionRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accounting" type="{}AccountingRecord" minOccurs="0"/>
 *         &lt;element name=" InvoiceItemTotalAmount " type="{}Decimal4FractionDigitsType" minOccurs="0"/>
 *         &lt;element name="InvoiceItemTotalSum" type="{}Decimal4FractionDigitsType" minOccurs="0"/>
 *         &lt;element name="Addition" type="{}AdditionRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VAT" type="{}VATRecord" minOccurs="0"/>
 *         &lt;element name="InvoiceItemTotal" type="{}Decimal4FractionDigitsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceItemTotalDescription",
    "extension",
    "accounting",
    "_0020InvoiceItemTotalAmount0020",
    "invoiceItemTotalSum",
    "addition",
    "vat",
    "invoiceItemTotal"
})
@XmlRootElement(name = "InvoiceItemTotalGroup")
public class InvoiceItemTotalGroup {

    @XmlElement(name = "InvoiceItemTotalDescription")
    protected String invoiceItemTotalDescription;
    @XmlElement(name = "Extension")
    protected List<ExtensionRecord> extension;
    @XmlElement(name = "Accounting")
    protected AccountingRecord accounting;
    @XmlElement(name = " InvoiceItemTotalAmount ")
    protected BigDecimal _0020InvoiceItemTotalAmount0020;
    @XmlElement(name = "InvoiceItemTotalSum")
    protected BigDecimal invoiceItemTotalSum;
    @XmlElement(name = "Addition")
    protected List<AdditionRecord> addition;
    @XmlElement(name = "VAT")
    protected VATRecord vat;
    @XmlElement(name = "InvoiceItemTotal")
    protected BigDecimal invoiceItemTotal;

    /**
     * Gets the value of the invoiceItemTotalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceItemTotalDescription() {
        return invoiceItemTotalDescription;
    }

    /**
     * Sets the value of the invoiceItemTotalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceItemTotalDescription(String value) {
        this.invoiceItemTotalDescription = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionRecord }
     * 
     * 
     */
    public List<ExtensionRecord> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionRecord>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the accounting property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingRecord }
     *     
     */
    public AccountingRecord getAccounting() {
        return accounting;
    }

    /**
     * Sets the value of the accounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingRecord }
     *     
     */
    public void setAccounting(AccountingRecord value) {
        this.accounting = value;
    }

    /**
     * Gets the value of the 0020InvoiceItemTotalAmount0020 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal get_0020InvoiceItemTotalAmount_0020() {
        return _0020InvoiceItemTotalAmount0020;
    }

    /**
     * Sets the value of the 0020InvoiceItemTotalAmount0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void set_0020InvoiceItemTotalAmount_0020(BigDecimal value) {
        this._0020InvoiceItemTotalAmount0020 = value;
    }

    /**
     * Gets the value of the invoiceItemTotalSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceItemTotalSum() {
        return invoiceItemTotalSum;
    }

    /**
     * Sets the value of the invoiceItemTotalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceItemTotalSum(BigDecimal value) {
        this.invoiceItemTotalSum = value;
    }

    /**
     * Gets the value of the addition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionRecord }
     * 
     * 
     */
    public List<AdditionRecord> getAddition() {
        if (addition == null) {
            addition = new ArrayList<AdditionRecord>();
        }
        return this.addition;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link VATRecord }
     *     
     */
    public VATRecord getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATRecord }
     *     
     */
    public void setVAT(VATRecord value) {
        this.vat = value;
    }

    /**
     * Gets the value of the invoiceItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceItemTotal() {
        return invoiceItemTotal;
    }

    /**
     * Sets the value of the invoiceItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceItemTotal(BigDecimal value) {
        this.invoiceItemTotal = value;
    }

}
