package com.example.demo.order;

import lombok.Getter;

@Getter
public class Topping {
    private int id;
    private String name;
    private int price;
    private boolean with;
    private boolean without;
    private boolean available;

    public Topping() {
        this.id = id;
    }

    public Topping setName(String name) {
        this.name = name;
        return this;
    }

    public Topping setPrice(int price) {
        this.price = price;
        return this;
    }

    public Topping setWith(boolean with) {
        this.with = with;
        return this;
    }

    public Topping setWithout(boolean without) {
        this.without = without;
        return this;
    }

    public Topping setAvailable(boolean available) {
        this.available = available;
        return this;
    }
}
