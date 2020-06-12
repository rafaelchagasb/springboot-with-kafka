package br.com.rafaelchagasb.producer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
@RequestMapping(value = "/orders")
public class OrderController {
 
    private final OrderProducer orderProducer;
 
    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String order) {
        orderProducer.send(order);
    }
}