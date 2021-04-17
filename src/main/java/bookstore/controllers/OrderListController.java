package bookstore.controllers;

import bookstore.models.entities.OrderPosition;
import bookstore.models.entities.Orders;
import bookstore.models.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrderListController {

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/orderList")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders create(@RequestBody List<OrderPosition> orderPositions) {
        Orders orders = new Orders();
        orderPositions.forEach(orderPosition -> orderPosition.setOrder(orders));
        orders.setUser(1L);
        orders.setOrderPositions(orderPositions);

        return orderRepository.save(orders);
    }


}
