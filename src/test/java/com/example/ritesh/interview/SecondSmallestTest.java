package com.example.ritesh.interview;

import org.junit.jupiter.api.Test;

class SecondSmallestTest {

  @Test
  void find2ndSmallest() {
    int[] val={8,5,6,2,9,7,2};
    final int ndSmallest = SecondSmallest.find2ndSmallest(val);
    System.out.println(ndSmallest);
  }
}