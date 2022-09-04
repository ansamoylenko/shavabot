package com.example.demo.order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Product {
    private int id;
    private int price;
    private String image;
    private List<Topping> toppings;
    private boolean available;

    public Product setType(String type) {
        this.type = type;
        return this;
    }

    private String type;

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public Product setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public Product addTopping(Topping topping) {
        if (this.toppings == null) {
            this.toppings = new ArrayList<>();
        }
        toppings.add(topping);
        return this;
    }


}
