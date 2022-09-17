package com.company.web;

import com.company.data.entity.Order_item;
import com.company.data.entity.Orders;
import com.company.data.entity.Product;
import com.company.service.OrderItemService;
import com.company.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Order;
import java.util.Random;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderItemService ordersItemsService;

    @GetMapping("/find_order_by_id/{id}")
    public String findOrder(@PathVariable Long id, Model model) {
        model.addAttribute("order", orderService.findById(id));
        model.addAttribute("order_item", ordersItemsService.findById(id));
        return "order";
    }

    @GetMapping("/orders_find")
    public String findOrders(Model model) {
        model.addAttribute("orders", orderService.findAll());
        return "orders";
    }

    @PostMapping("/add_order")
    public String addOrder(@ModelAttribute("order") Orders orders, @ModelAttribute("order")Product product){
        Order_item order_item = new Order_item();
        order_item.setProduct(product);
        order_item.setQuantity(12);
        order_item.setOrders(orders);
        ordersItemsService.create(order_item);
        return "redirect: /index";
    }
}
