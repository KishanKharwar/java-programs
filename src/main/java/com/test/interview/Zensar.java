package com.test.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zensar {


  public static void main(String[] args) {
    Map<String, List<Integer>> map = new HashMap<>();

    Stock s1 = new Stock(1, "a", 1, 1);
    Stock s2 = new Stock(2, "b", 1, 1);
    Stock s3 = new Stock(3, "c", 1, 1);
    Stock s4 = new Stock(4, "d", 1, 1);

    List<Integer> list = new ArrayList<>();
    list.add(s1.getTransactions());
    list.add(s2.getTransactions());
    list.add(s3.getTransactions());
    list.add(s4.getTransactions());

    map.put("TCS", list);




  }


  static class Stock {

    int sharePrice;
    String shareName;
    int dividend;
    int transactions;

    public Stock(int sharePrice, String shareName, int dividend, int transactions) {
      this.sharePrice = sharePrice;
      this.shareName = shareName;
      this.dividend = dividend;
      this.transactions = transactions;
    }

    public int getSharePrice() {
      return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
      this.sharePrice = sharePrice;
    }

    public String getShareName() {
      return shareName;
    }

    public void setShareName(String shareName) {
      this.shareName = shareName;
    }

    public int getDividend() {
      return dividend;
    }

    public void setDividend(int dividend) {
      this.dividend = dividend;
    }

    public int getTransactions() {
      return transactions;
    }

    public void setTransactions(int transactions) {
      this.transactions = transactions;
    }
  }
}
