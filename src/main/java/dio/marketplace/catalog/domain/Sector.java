package dio.marketplace.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Sector {
    private SectorId id;
    private BigDecimal price;
}
