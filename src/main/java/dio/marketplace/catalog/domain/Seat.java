package dio.marketplace.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Seat {
    private SeatId id;
    private SectorId sectorId;
}
