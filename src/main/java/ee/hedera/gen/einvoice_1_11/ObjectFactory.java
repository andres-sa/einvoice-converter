//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 01:36:50 PM EEST 
//


package ee.hedera.gen.einvoice_1_11;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.hedera.gen.einvoice_1_11 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdditionalInformation_QNAME = new QName("", "AdditionalInformation");
    private final static QName _PaymentInfoPaymentTotalSum_QNAME = new QName("", "PaymentTotalSum");
    private final static QName _PaymentInfoDirectDebitPayeeContractNumber_QNAME = new QName("", "DirectDebitPayeeContractNumber");
    private final static QName _PaymentInfoPaymentRefId_QNAME = new QName("", "PaymentRefId");
    private final static QName _PaymentInfoPaymentId_QNAME = new QName("", "PaymentId");
    private final static QName _PaymentInfoPaymentDescription_QNAME = new QName("", "PaymentDescription");
    private final static QName _PaymentInfoPayerName_QNAME = new QName("", "PayerName");
    private final static QName _PaymentInfoPayable_QNAME = new QName("", "Payable");
    private final static QName _PaymentInfoPayToAccount_QNAME = new QName("", "PayToAccount");
    private final static QName _PaymentInfoPayToName_QNAME = new QName("", "PayToName");
    private final static QName _PaymentInfoPayToBIC_QNAME = new QName("", "PayToBIC");
    private final static QName _PaymentInfoPayDueDate_QNAME = new QName("", "PayDueDate");
    private final static QName _PaymentInfoCurrency_QNAME = new QName("", "Currency");
    private final static QName _PaymentInfoDirectDebitPayerNumber_QNAME = new QName("", "DirectDebitPayerNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.hedera.gen.einvoice_1_11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemEntry }
     * 
     */
    public ItemEntry createItemEntry() {
        return new ItemEntry();
    }

    /**
     * Create an instance of {@link InvoiceInformation }
     * 
     */
    public InvoiceInformation createInvoiceInformation() {
        return new InvoiceInformation();
    }

    /**
     * Create an instance of {@link InvoiceSumGroup }
     * 
     */
    public InvoiceSumGroup createInvoiceSumGroup() {
        return new InvoiceSumGroup();
    }

    /**
     * Create an instance of {@link AccountingRecord }
     * 
     */
    public AccountingRecord createAccountingRecord() {
        return new AccountingRecord();
    }

    /**
     * Create an instance of {@link ExtensionRecord }
     * 
     */
    public ExtensionRecord createExtensionRecord() {
        return new ExtensionRecord();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link InvoiceTotalGroup }
     * 
     */
    public InvoiceTotalGroup createInvoiceTotalGroup() {
        return new InvoiceTotalGroup();
    }

    /**
     * Create an instance of {@link ItemEntry.ItemDetailInfo }
     * 
     */
    public ItemEntry.ItemDetailInfo createItemEntryItemDetailInfo() {
        return new ItemEntry.ItemDetailInfo();
    }

    /**
     * Create an instance of {@link AdditionRecord }
     * 
     */
    public AdditionRecord createAdditionRecord() {
        return new AdditionRecord();
    }

    /**
     * Create an instance of {@link VATRecord }
     * 
     */
    public VATRecord createVATRecord() {
        return new VATRecord();
    }

    /**
     * Create an instance of {@link GroupEntry }
     * 
     */
    public GroupEntry createGroupEntry() {
        return new GroupEntry();
    }

    /**
     * Create an instance of {@link EInvoice }
     * 
     */
    public EInvoice createEInvoice() {
        return new EInvoice();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link InvoiceParties }
     * 
     */
    public InvoiceParties createInvoiceParties() {
        return new InvoiceParties();
    }

    /**
     * Create an instance of {@link BillPartyRecord }
     * 
     */
    public BillPartyRecord createBillPartyRecord() {
        return new BillPartyRecord();
    }

    /**
     * Create an instance of {@link InvoiceInformation.Type }
     * 
     */
    public InvoiceInformation.Type createInvoiceInformationType() {
        return new InvoiceInformation.Type();
    }

    /**
     * Create an instance of {@link InvoiceInformation.Period }
     * 
     */
    public InvoiceInformation.Period createInvoiceInformationPeriod() {
        return new InvoiceInformation.Period();
    }

    /**
     * Create an instance of {@link ContactDataRecord }
     * 
     */
    public ContactDataRecord createContactDataRecord() {
        return new ContactDataRecord();
    }

    /**
     * Create an instance of {@link InvoiceSumGroup.Balance }
     * 
     */
    public InvoiceSumGroup.Balance createInvoiceSumGroupBalance() {
        return new InvoiceSumGroup.Balance();
    }

    /**
     * Create an instance of {@link InvoiceItem }
     * 
     */
    public InvoiceItem createInvoiceItem() {
        return new InvoiceItem();
    }

    /**
     * Create an instance of {@link InvoiceItemGroup }
     * 
     */
    public InvoiceItemGroup createInvoiceItemGroup() {
        return new InvoiceItemGroup();
    }

    /**
     * Create an instance of {@link InvoiceItemTotalGroup }
     * 
     */
    public InvoiceItemTotalGroup createInvoiceItemTotalGroup() {
        return new InvoiceItemTotalGroup();
    }

    /**
     * Create an instance of {@link Footer }
     * 
     */
    public Footer createFooter() {
        return new Footer();
    }

    /**
     * Create an instance of {@link AccountDataRecord }
     * 
     */
    public AccountDataRecord createAccountDataRecord() {
        return new AccountDataRecord();
    }

    /**
     * Create an instance of {@link AddressRecord }
     * 
     */
    public AddressRecord createAddressRecord() {
        return new AddressRecord();
    }

    /**
     * Create an instance of {@link AccountingRecord.JournalEntry }
     * 
     */
    public AccountingRecord.JournalEntry createAccountingRecordJournalEntry() {
        return new AccountingRecord.JournalEntry();
    }

    /**
     * Create an instance of {@link ExtensionRecord.CustomContent }
     * 
     */
    public ExtensionRecord.CustomContent createExtensionRecordCustomContent() {
        return new ExtensionRecord.CustomContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdditionalInformation")
    public JAXBElement<ExtensionRecord> createAdditionalInformation(ExtensionRecord value) {
        return new JAXBElement<ExtensionRecord>(_AdditionalInformation_QNAME, ExtensionRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentTotalSum", scope = PaymentInfo.class)
    public JAXBElement<BigDecimal> createPaymentInfoPaymentTotalSum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PaymentInfoPaymentTotalSum_QNAME, BigDecimal.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DirectDebitPayeeContractNumber", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoDirectDebitPayeeContractNumber(String value) {
        return new JAXBElement<String>(_PaymentInfoDirectDebitPayeeContractNumber_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentRefId", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPaymentRefId(String value) {
        return new JAXBElement<String>(_PaymentInfoPaymentRefId_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentId", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPaymentId(String value) {
        return new JAXBElement<String>(_PaymentInfoPaymentId_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentDescription", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPaymentDescription(String value) {
        return new JAXBElement<String>(_PaymentInfoPaymentDescription_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PayerName", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPayerName(String value) {
        return new JAXBElement<String>(_PaymentInfoPayerName_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Payable", scope = PaymentInfo.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentInfoPayable(String value) {
        return new JAXBElement<String>(_PaymentInfoPayable_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PayToAccount", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPayToAccount(String value) {
        return new JAXBElement<String>(_PaymentInfoPayToAccount_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PayToName", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPayToName(String value) {
        return new JAXBElement<String>(_PaymentInfoPayToName_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PayToBIC", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoPayToBIC(String value) {
        return new JAXBElement<String>(_PaymentInfoPayToBIC_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PayDueDate", scope = PaymentInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentInfoPayDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentInfoPayDueDate_QNAME, XMLGregorianCalendar.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Currency", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoCurrency(String value) {
        return new JAXBElement<String>(_PaymentInfoCurrency_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DirectDebitPayerNumber", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoDirectDebitPayerNumber(String value) {
        return new JAXBElement<String>(_PaymentInfoDirectDebitPayerNumber_QNAME, String.class, PaymentInfo.class, value);
    }

}
