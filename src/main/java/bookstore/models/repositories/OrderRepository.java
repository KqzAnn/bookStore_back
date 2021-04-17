package bookstore.models.repositories;

import bookstore.models.entities.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long> {
}
