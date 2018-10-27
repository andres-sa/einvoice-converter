package ee.hedera.converter.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@Data
@Builder
public class LineItem {
    private String description;
    private BigDecimal amount;
    private BigDecimal price;
    private BigDecimal sum;
    private BigDecimal vatRate;
    private BigDecimal vatSum;
    private BigDecimal total;
}
