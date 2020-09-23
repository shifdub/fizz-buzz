package edu.cnm.deepdive.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static FizzBuzz[] expectedValues =
      {FizzBuzz.NEITHER, FizzBuzz.FIZZ, FizzBuzz.BUZZ, FizzBuzz.FIZZ_BUZZ};

  static int[] inputValues  = { 1, 9, 10, 15};

  @Test
  void fromInt() {
    for (int i = 0; i < expectedValues.length; i++) {
      FizzBuzz expected = expectedValues[i];
      int input = inputValues [i];
      FizzBuzz actual = FizzBuzz.fromInt(input);
      assertEquals(expected, actual);
    }
  }
}