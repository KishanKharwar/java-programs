package com.pepcoding.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

//https://www.youtube.com/watch?v=jhm2pYGFIos
public class LinkedListKReverse {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
    System.out.println(list);

    int k = 3;
    LinkedListKReverse reverse = new LinkedListKReverse();
    reverse.kReverse(list,k);

  }

  private void kReverse(LinkedList<Integer> l,int k) {
    LinkedList prev = null;

    while(l.size() > 0){
      LinkedList curr = new LinkedList();

      for(int i = 0;i<k;i++){
        int val = l.getFirst();
        l.removeFirst();
        curr.addFirst(val);
      }

      if(prev == null){
        prev = curr;
      }else {
        //prev.
      }
    }
  }


}
