package com.akaravek.store.service.cart;

import com.akaravek.store.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCartById(Long id);
    void clearCartById(Long id);
    BigDecimal  getTotalPrice(Long id);
}
