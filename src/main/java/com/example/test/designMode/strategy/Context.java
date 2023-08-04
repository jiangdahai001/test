package com.example.test.designMode.strategy;

/**
 * 上下文类
 */
public class Context {
  private DiscountStrategy discountStrategy;
  public void setDiscountStrategy(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }
  public double calculatePrice(double price) {
    return discountStrategy.calculateDiscount(price);
  }
}
