package com.test.bikram.test;

public class Rectangle {

  private int length;
  private int breadth;

  public int getLength() {
    return length;
  }

  public void setLength(int x) {
    this.length = x;
  }

  public int getBreadth() {
    return breadth;
  }

  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }


  public int area() {
    return length * breadth;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "length=" + length +
        ", breadth=" + breadth +
        '}';
  }
}
