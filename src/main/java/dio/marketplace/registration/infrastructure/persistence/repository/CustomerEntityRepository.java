package dio.marketplace.registration.infrastructure.persistence.repository;

import dio.marketplace.registration.domain.CustomerId;
import dio.marketplace.registration.infrastructure.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerEntityRepository extends CrudRepository<Customer, CustomerId> {
}
