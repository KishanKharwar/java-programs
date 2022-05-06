package com.ds.ashokit.recursion;

public class TowerOfHanoi {

  public static void main(String[] args) {
    int noOfDisks = 3;
    char srcT = 'A';
    char helpingT = 'B';
    char destT = 'C';
    towerOfHanoi(noOfDisks, srcT, destT, helpingT);
  }

  private static void towerOfHanoi(int noOfDisks, char srcT, char destT, char helpingT) {
    if (noOfDisks == 0) {
      return;
    }

    towerOfHanoi(noOfDisks - 1, srcT, helpingT, destT);
    System.out.println("Moved " + noOfDisks + " : [" + srcT + " -> " + destT + "]");
    towerOfHanoi(noOfDisks - 1, helpingT, destT, srcT);

  }
}
