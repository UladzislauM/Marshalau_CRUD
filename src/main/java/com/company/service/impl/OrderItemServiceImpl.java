package com.company.service.impl;

import com.company.data.entity.Order_item;
import com.company.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("orderItemService")
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemService orderItemService;
    @Override
    public List<Order_item> findAll() {
        return null;
    }

    @Override
    public Order_item findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Order_item create(Order_item order_item) {
        orderItemService.create(order_item);
        return order_item;
    }

    @Override
    public Order_item update(Order_item d) {
        return null;
    }
}
