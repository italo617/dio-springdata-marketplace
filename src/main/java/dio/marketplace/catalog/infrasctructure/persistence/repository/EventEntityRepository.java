package dio.marketplace.catalog.infrasctructure.persistence.repository;

import dio.marketplace.catalog.infrasctructure.persistence.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface EventEntityRepository extends CrudRepository<Event, UUID> {
}
