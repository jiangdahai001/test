package com.example.test.designMode.strategy;

public class StrategyDemo {
  public static void main(String[] args) {
    Context context = new Context();
    double original = 120;
    // 使用满减策略
    context.setDiscountStrategy(new Fullreduction());
    System.out.println("使用满减策略：" + context.calculatePrice(original));
    // 使用打折策略
    context.setDiscountStrategy(new Discount());
    System.out.println("使用打折策略：" + context.calculatePrice(original));
  }
}
