package ee.hedera.converter.outbound;

import ee.hedera.converter.model.Invoice;
import ee.hedera.converter.model.SumGroup;
import ee.hedera.gen.einvoice_1_11.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;
import java.util.UUID;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.RequiredArgsConstructor;

import static java.util.Optional.of;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@RequiredArgsConstructor
public class EInvoice_1_11Converter implements OutboundConverter<EInvoice> {
    private final Invoice invoice;

    private ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EInvoice convert(Invoice invoice) {
        return eInvoice();
    }

    private EInvoice eInvoice() {
        EInvoice eInvoice = objectFactory.createEInvoice();
        eInvoice.setHeader(header());
        footer().ifPresent(eInvoice::setFooter);
        invoice().ifPresent(eInvoice.getInvoice()::add);
        return eInvoice;
    }

    private Header header() {
        Header header = objectFactory.createHeader();
        header.setAppId("EInvoiceConverter");
        header.setDate(date(new Date()));
        header.setFileId(UUID.randomUUID().toString());
        header.setVersion("1.1");
        return header;
    }

    private Optional<Footer> footer() {
        return of(invoice)
                .map(Invoice::getSumGroup)
                .map(this::footer);
    }

    private Footer footer(SumGroup sumGroup) {
        Footer footer = objectFactory.createFooter();
        footer.setTotalNumberInvoices(BigInteger.ONE);
        footer.setTotalAmount(sumGroup.getTotalSum());
        return footer;
    }

    private Optional<ee.hedera.gen.einvoice_1_11.Invoice> invoice() {
        return of(invoice)
                .map(this::invoice);
    }

    private ee.hedera.gen.einvoice_1_11.Invoice invoice(Invoice invoice) {
        ee.hedera.gen.einvoice_1_11.Invoice inv = objectFactory.createInvoice();
        inv.setInvoiceId(invoice.getInvoiceId());
        inv.setRegNumber(invoice.getRegNumber());
        inv.setSellerRegnumber(invoice.getSellerRegNumber());
        inv.setInvoiceInformation(invoiceInformation());
        sumGroup().ifPresent(inv.getInvoiceSumGroup()::add);
        inv.setPaymentInfo(paymentInfo());
        return inv;
    }

    private InvoiceInformation invoiceInformation() {
        InvoiceInformation invoiceInformation = objectFactory.createInvoiceInformation();
        invoiceInformation.setType(invoiceType());
        invoiceInformation.setDocumentName(invoice.getDocumentName());
        invoiceInformation.setInvoiceNumber(invoice.getInvoiceNumber());
        invoiceInformation.setInvoiceDate(date(invoice.getInvoiceDate()));
        invoiceInformation.setDueDate(date(invoice.getDueDate()));
        return invoiceInformation;
    }

    private InvoiceInformation.Type invoiceType() {
        InvoiceInformation.Type invoiceInformationType = objectFactory.createInvoiceInformationType();
        invoiceInformationType.setType(invoice.getType());
        return invoiceInformationType;
    }

    private Optional<InvoiceSumGroup> sumGroup() {
        return of(invoice)
                .map(Invoice::getSumGroup)
                .map(this::sumGroup);
    }

    private InvoiceSumGroup sumGroup(SumGroup sumGroup) {
        InvoiceSumGroup invoiceSumGroup = objectFactory.createInvoiceSumGroup();
        invoiceSumGroup.setInvoiceSum(sumGroup.getSum());
        invoiceSumGroup.setTotalVATSum(sumGroup.getTotalSum());
        invoiceSumGroup.setTotalSum(sumGroup.getTotalSum());
        return invoiceSumGroup;
    }

    private PaymentInfo paymentInfo() {
        PaymentInfo paymentInfo = objectFactory.createPaymentInfo();
        return paymentInfo;
    }

    private XMLGregorianCalendar date(Date date) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Could not convert date", e);
        }
    }
}
