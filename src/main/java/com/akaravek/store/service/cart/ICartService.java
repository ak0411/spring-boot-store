package com.akaravek.store.service.cart;

import com.akaravek.store.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal  getTotalPrice(Long id);
}
