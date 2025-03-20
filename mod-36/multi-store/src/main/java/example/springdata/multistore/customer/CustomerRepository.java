package example.springdata.multistore.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface to manage {@link Customer} instances.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {}