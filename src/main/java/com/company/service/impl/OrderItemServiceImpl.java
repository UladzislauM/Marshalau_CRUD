package com.company.service.impl;

import com.company.data.entity.Order_item;
import com.company.service.OrderItemService;

import java.util.List;

public class OrderItemServiceImpl implements OrderItemService {
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
        order_item.setProduct();
        return null;
    }

    @Override
    public Order_item update(Order_item d) {
        return null;
    }
}
