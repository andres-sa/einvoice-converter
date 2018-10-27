package ee.hedera.converter.model;

import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@Data
@Builder
public class Invoice {
    private String invoiceId;
    private String regNumber;
    private String sellerRegNumber;
    private String type;
    private String documentName;
    private String invoiceNumber;
    private Date invoiceDate;
    private Date dueDate;

    private Party buyer;
    private Party seller;

    private Payment payment;

    private SumGroup sumGroup;
    private List<LineItem> items;
}
