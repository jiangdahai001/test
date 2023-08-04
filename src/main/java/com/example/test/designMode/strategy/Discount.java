package com.example.test.designMode.strategy;

/**
 * 具体策略类：打折
 */
public class Discount implements DiscountStrategy {
  @Override
  public double calculateDiscount(double price) {
    return price * 0.8;
  }
}
