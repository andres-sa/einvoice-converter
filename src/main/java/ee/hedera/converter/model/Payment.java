package ee.hedera.converter.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@Data
@Builder
public class Payment {
    private String currency;
    private String description;
    private String payable;
    private BigDecimal totalSum;
    private String payerName;
    private String paymentId;
    private String payToAccount;
    private String payToName;
}
