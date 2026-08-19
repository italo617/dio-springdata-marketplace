package dio.marketplace.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class Event {
    private EventId id;
    private String title;
    private Instant date;
    private Optional<EventMetadata> metadata;
}
