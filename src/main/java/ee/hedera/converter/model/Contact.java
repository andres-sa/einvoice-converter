package ee.hedera.converter.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by <a href="andres.saaremots@nortal.com">Andres Saaremõts</a> on 27.10.2018.
 */
@Data
@Builder
public class Contact {
    private String PostalAddress1;
    private String city;
    private String postalCode;
    private String country;
}
