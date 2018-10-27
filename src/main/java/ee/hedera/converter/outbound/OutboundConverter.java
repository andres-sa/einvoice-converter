package ee.hedera.converter.outbound;

import ee.hedera.converter.model.Invoice;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
public interface OutboundConverter<T> {

    T convert(Invoice invoice);
}
