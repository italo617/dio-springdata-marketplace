package dio.marketplace.ticketing.domain;

import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
public class Seat {
    private UUID id;
    private SeatId correlationId;

    public Seat(String correlationId) {
        this.correlationId = new SeatId(correlationId);
    }
}
