package com.example.test.designMode.strategy;

/**
 * 具体的策略来：满减
 */
public class Fullreduction implements DiscountStrategy {
  @Override
  public double calculateDiscount(double price) {
    if (price >= 100) {
      return price - 20;
    }
    return price;
  }
}
