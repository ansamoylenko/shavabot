package com.example.demo.order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class Order {
    private int id;
    private int buyerId;
    private int sellerId;
    private int operatorId;
    private long orderTime;
    private long receiptTime;
    private List<Product> basket;
    private String number;
    private String message;

    private OrderStatus status;

    public Order() {
        this.id = id;
        this.orderTime = new Date().getTime();
        this.number = number;
    }

    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public Order setBuyerId(int buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    public Order setSellerId(int sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public Order setOperatorId(int operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public Order setReceiptTime(int receiptTime) {
        this.receiptTime = receiptTime;
        return this;
    }

    public Order addProduct(Product product) {
        if (this.basket == null) {
            this.basket = new ArrayList<>();
        }
        basket.add(product);
        return this;
    }
}
