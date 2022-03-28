package com.pepcoding.recursion;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str,"");
    }

    private static void printPermutations(String ques,String asf) {

        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<ques.length();i++){
            char c = ques.charAt(i);
            String ls = ques.substring(0,i);
            String rs = ques.substring(i+1);
            printPermutations(ls+rs,asf + c);
        }


    }
}
