package com.example.ritesh.interview;

import org.junit.jupiter.api.Test;

class SecondHighestTest {

  @Test
  void find2ndSmallest() {
    int[] val={8,5,6,2,9,7,2};
    final int ndHighest = SecondHighest.find2ndHighest(val);
    System.out.println(ndHighest);

  }
}