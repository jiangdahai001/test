package com.example.test.groovy;

public class ScriptImpl implements Script {
  @Override
  public String move() {
    System.out.println("move");
    return null;
  }

  @Override
  public String line() {
    System.out.println("line");
    return null;
  }
}
