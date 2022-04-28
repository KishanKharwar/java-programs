package com.ds.ashokit.programs;

public class StackImplementation {
  public static void main(String[] args) {
    Stack s = new Stack();
    Stack maxVal = new Stack();
    s.push(3);

    s.push(1);
    s.push(5);
    s.getData();
    s.pop();
    s.getData();
    s.push(10);
    s.getData();
    System.out.println(s.size());

  }

   static class Stack{
    int top;
    int[] arr;

    Stack() {
      top = -1;
      arr = new int[10];
    }

    public  void push(int data){
      if(top<arr.length){
        arr[++top] = data;
        return;
      }
    }

    public  void pop(){
      top--;
    }

    public  int size(){
      return top+1;
    }

    public void getData(){
      for(int i=0;i<=top;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
}
