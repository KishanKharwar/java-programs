package com.brillio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
//    Employee e1= new Employee(1,"jay",8933);
//    Employee e2= new Employee(2,"jay",7845);
//    Employee e3= new Employee(3,"sham",9673);
//
//    Set<Employee> empList= new HashSet<>();
//    empList.add(e1);
//    empList.add(e2);
//    empList.add(e3);
//
////    Comparator comparator = Comparator.comparing(Employee::getName);
////
//    List<Employee> emp = empList.stream().distinct().collect(Collectors.toList());


    //delete last third node
    //create
    //size - 2



  }



  private static Node deleteAt(Node h){
    Node slow =  h;
    Node fast = h.next.next;

    while(slow.next != null && fast.next!= null){
      fast = fast.next;
      slow = slow.next;
    }

    slow.next= slow.next.next;

    return slow;
  }

  private static int size(Node h){
    int count = 0;
    while(h != null){
      count++;
      h = h.next;
    }
    return count;
  }


  static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
    }
  }


}
