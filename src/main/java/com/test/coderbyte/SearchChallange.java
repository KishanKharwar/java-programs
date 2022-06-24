package com.test.coderbyte;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SearchChallange {

  public static void main(String[] args) {
    String[] arr = {"B:-1","A:1","B:3","A:5"};
    String s = searchinChallange(arr);
    System.out.println(s);
  }

  private static String searchinChallange(String[] arr) {

    Map<String,Integer> map = new LinkedHashMap<>();
    for(String s : arr){
      String[] split = s.split(":");

      if(map.containsKey(split[0])){
        map.put(split[0],map.get(split[0]) + Integer.valueOf(split[1]));
      }else{
        map.put(split[0],Integer.valueOf(split[1]));
      }
      if(map.get(split[0]) == 0){
        map.remove(split[0]);
      }
    }

    String str = "";
    for(Map.Entry<String,Integer> en : map.entrySet()){
      if(str == ""){
        str = en.getKey() + ":" +en.getValue();
        continue;
      }
      str += "," +en.getKey() + ":" +en.getValue();
    }
    return str;
  }


}
