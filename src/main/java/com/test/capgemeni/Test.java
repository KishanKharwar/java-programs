package com.test.capgemeni;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

  public static void main(String[] args) {

    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(6, "Tushar");
    hm.put(12, "Ashu");
    hm.put(5, "Zoya");
    hm.put(78, "Yash");
    hm.put(10, "Praveen");
    hm.put(67, "Boby");
    hm.put(1, "Ritesh");

    List list = new LinkedList(hm.entrySet());
    /* Custom Comparator */
    Collections.sort(list, new Comparator<Object>()
    {
      public int compare(Object o1, Object o2)
      {
//        ((Comparable)((Map.Entry) (o1)).getValue()).compareTo()
        return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
//        return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
      }
    });
    Map map = new LinkedHashMap();
    for(Iterator irt = list.iterator(); irt.hasNext();){
      Map.Entry entry = (Map.Entry) irt.next();
      map.put(entry.getKey(),entry.getValue());
    }

    System.out.println(map);


//    HashMap<Integer, String> hm=new HashMap<>();
////addding keys and values to HashMap
//    hm.put(23, "Yash");
//    hm.put(17, "Arun");
//    hm.put(15, "Swarit");
//    hm.put(9, "Neelesh");
//
//    System.out.println(hm);
//
//    TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);
//    System.out.println(tm);


//    I1 i = () -> {
//      System.out.println("Testing");
//    };
//
//    i.m1();

//    String s = "aabbbbddceefff";
//    int leng = s.length();
//    String temp = "";
//    for(int i = 0;i<leng;i++){
//      for(int j= i + 1;i<leng;j++){
//        // call method for all thesubstring
//        String subStr = findSubStr(s.substring(i,leng),s.substring(j,leng));
//        if(subStr.length() > temp.length()){
//          temp = subStr;
//        }
//      }
    }
  }

//  private static String findSubStr(String s1, String s2) {
//
//    for(int i = 0;i< s1.length();i++){
//      if(s1.charAt(i) != s2.charAt(i)){
////        String
//      }
//    }
//    return null;
//  }
//}
