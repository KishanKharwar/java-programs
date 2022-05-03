package com.test.bikram.test;

import java.util.ArrayList;
import java.util.HashSet;

public class BikramTest {

  public static void main(String[] args) {
    //fixed in length
    int[] arr = new int[4];

    // growable in nature
    ArrayList<Integer> list = new ArrayList<>(4);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    list.add(3);
    //System.out.println(list);

    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(3);
    set.add(4);
    set.add(3);

    System.out.println(set);

  }
}
