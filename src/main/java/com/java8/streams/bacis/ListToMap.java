package com.java8.streams.bacis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

  public static void main(String[] args) {
    List<Notes> noteLst = createList();

    Map<String,Long> map = noteLst.stream().collect(Collectors.toMap(Notes::getTagName,Notes::getTagId,(oldV,newV) -> oldV));
    //System.out.println(map);

    countEachDataInList();
  }

  //Q: How to count each element/word from the String ArrayList in Java8?
  private static void countEachDataInList(){
    List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
    Map<String,Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(map);
  }

  private static List<Notes> createList(){
    List<Notes> noteLst = new ArrayList<>();

    noteLst.add(new Notes(1, "note1", 11));
    noteLst.add(new Notes(2, "note2", 22));
    noteLst.add(new Notes(3, "note3", 33));
    noteLst.add(new Notes(4, "note4", 44));
    noteLst.add(new Notes(5, "note5", 55));

    noteLst.add(new Notes(6, "note4", 66));

    return noteLst;
  }

  static class Notes {
    private int id;
    private String tagName;
    private long tagId;

    public Notes(int id, String tagName, long tagId) {
      this.id = id;
      this.tagName = tagName;
      this.tagId = tagId;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTagName() {
      return tagName;
    }

    public void setTagName(String tagName) {
      this.tagName = tagName;
    }

    public long getTagId() {
      return tagId;
    }

    public void setTagId(long tagId) {
      this.tagId = tagId;
    }
  }
}
