package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
