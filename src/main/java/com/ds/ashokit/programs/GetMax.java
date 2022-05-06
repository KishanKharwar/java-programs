package com.ds.ashokit.programs;

import java.util.Scanner;
import java.util.Stack;

public class GetMax {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1 for push, 2 for pop, 3 for getMax and -1 for exit");
    int n = sc.nextInt(); //operation
    Stack s1 = new Stack();
    Stack maxStack = new Stack();
    while (n != -1) {
      n = sc.nextInt();

      if (n == 1) {
        //push
        int num = sc.nextInt();
        s1.push(num);
        if (s1.size() == 1) {
          maxStack.push(num);
        } else if (num > (int) maxStack.peek()) {
          maxStack.push(num);
        } else {
          maxStack.push(maxStack.peek());
        }
      } else if (n == 2 && !s1.isEmpty()) {
        s1.pop();
        maxStack.pop();
      } else if (n == 3 && !s1.isEmpty()) {
        System.out.println(maxStack.peek());
      } else {
        break;
      }
    }
  }
}
