package com.test;

public class InterfImpl implements Interf1,Interf2{

  @Override
  public void m1() {
    Interf1.super.m1();
    Interf2.super.m1();
  }

  public static void main(String[] args) {
    InterfImpl i = new InterfImpl();
    i.m1();
  }
}
