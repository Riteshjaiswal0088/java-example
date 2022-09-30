package com.example.ritesh.interview.number;

import org.junit.jupiter.api.Test;

class BinaryToDecimalTest {

  @Test
  void decimalToBinary() {
    final int binary = BinaryToDecimal.decimalToBinary(27);
    System.out.println(binary);
  }

  @Test
  void binaryToDecimal(){
    final int decimal = BinaryToDecimal.binaryToDecimal(11011);
    System.out.println(decimal);
  }
}