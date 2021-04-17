package bookstore.models.repositories;

import bookstore.models.entities.OrderPosition;
import org.springframework.data.repository.CrudRepository;

public interface OrderListRepository extends CrudRepository<OrderPosition, Long> {
}
