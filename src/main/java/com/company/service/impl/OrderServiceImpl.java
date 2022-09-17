package com.company.service.impl;

import com.company.data.entity.Orders;
import com.company.data.entity.Status;
import com.company.data.repository.OrderRep;
import com.company.service.OrderItemService;
import com.company.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("orderService")
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRep ordersRep;
    private final OrderItemService orderItemService;

    @Override
    public List<Orders> findAll() {
        List<Orders> orders = ordersRep.findAll();
        if (orders == null) {
            throw new RuntimeException("FindAll - Orders is not exist...");
        } else {
            return orders;
        }
    }

    @Override
    public Orders findById(Long id) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Orders create(Orders orders) {
        orders.setStatus(rnd(3));
        return ordersRep.create(orders);
    }

    private Status rnd(Integer max) {
        switch (max) {
            case 1:
                return Status.OUT_OF_STOCK;
            case 2:
                return Status.RUNNING_LOW;
            default:
                return Status.IN_STOCK;
        }
    }

    @Override
    public Orders update(Orders d) {
        return null;
    }
}
