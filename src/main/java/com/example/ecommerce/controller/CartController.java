package com.example.ecommerce.controller;

import com.example.ecommerce.model.CartItem;
import com.example.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<CartItem> getCartItems(@RequestParam String userId) {
        return cartService.getCartItems(userId);
    }

    @PostMapping("/add")
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartService.addCartItem(cartItem);
    }

    @DeleteMapping("/remove/{id}")
    public void removeCartItem(@PathVariable Long id) {
        cartService.removeCartItem(id);
    }

    @PutMapping("/update")
    public CartItem updateCartItem(@RequestBody CartItem cartItem) {
        return cartService.updateCartItem(cartItem);
    }

    @GetMapping("/details/{userId}")
    public List<CartItem> getCartDetails(@PathVariable String userId) {
        return cartService.getCartItems(userId);
    }
}
