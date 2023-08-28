package com.example.test.groovy;

import groovy.lang.GroovyClassLoader;

import java.io.File;
import java.lang.reflect.Method;

public class ScriptRunner {
  public static void main(String[] args) throws Exception {
    System.out.println("hello world");
    File file = new File("D:\\workspace\\idea\\test\\src\\main\\java\\com\\example\\test\\groovy\\Script1.java");
    Class clazz = new GroovyClassLoader().parseClass(file);
    Method method = clazz.getMethod("run");
    Object obj = clazz.getDeclaredConstructor().newInstance();
    Object result = method.invoke(obj);
    System.out.println(result);
  }
}
