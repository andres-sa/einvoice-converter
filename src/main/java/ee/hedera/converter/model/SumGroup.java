package ee.hedera.converter.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@Data
@Builder
public class SumGroup {
    private BigDecimal sum;
    private BigDecimal totalVatSum;
    private BigDecimal totalSum;
}
