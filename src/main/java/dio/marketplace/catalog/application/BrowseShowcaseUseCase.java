package dio.marketplace.catalog.application;

import dio.marketplace.catalog.domain.Event;
import dio.marketplace.catalog.domain.EventMetadataRepository;
import dio.marketplace.catalog.domain.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrowseShowcaseUseCase {
    private static Logger logger = LoggerFactory.getLogger(BrowseShowcaseUseCase.class);

    private final EventRepository eventRepository;
    private final EventMetadataRepository eventMetadataRepository;

    public BrowseShowcaseUseCase(EventRepository eventRepository, EventMetadataRepository eventMetadataRepository) {
        this.eventRepository = eventRepository;
        this.eventMetadataRepository = eventMetadataRepository;
    }

    public List<Event> execute() {
        return eventRepository.findAll().stream().peek(event -> {
            logger.info("Enriching event: {}", event);

            var metadata = eventMetadataRepository.findByEventId(event.getId());
            event.setMetadata(metadata);

        }).toList();
    }
}
