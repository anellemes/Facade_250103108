package com.ecommerce;

public class FakeOrderDetection {
    private CheckoutFacade checkoutFacade;
    private String productId, customerId, address;
    private double amount;

    public FakeOrderDetection(CheckoutFacade checkoutFacade) {
        this.checkoutFacade = checkoutFacade;
    }

    public boolean isSuspicious() {
        boolean placed = checkoutFacade.placeOrder(productId, customerId, address, amount);
        return !placed;
    }
}