package bookstore.controllers;

import bookstore.models.entities.Orders;
import bookstore.models.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class OrdersController {

    @Autowired
    OrderRepository ThisOrd;

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders create(@RequestBody Orders ord) {
        return ThisOrd.save(ord);
    }


}
