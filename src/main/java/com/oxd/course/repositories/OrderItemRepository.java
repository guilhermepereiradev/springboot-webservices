package com.oxd.course.repositories;

import com.oxd.course.entities.Order;
import com.oxd.course.entities.OrderItem;
import com.oxd.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
