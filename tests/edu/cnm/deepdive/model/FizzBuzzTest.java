package edu.cnm.deepdive.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void fromInt() {
    assertEquals(FizzBuzz.NEITHER, FizzBuzz.fromInt(1));
    assertEquals(FizzBuzz.FIZZ, FizzBuzz.fromInt(9));
    assertEquals(FizzBuzz.BUZZ , FizzBuzz.fromInt(10));
    assertEquals(FizzBuzz.FIZZ_BUZZ, FizzBuzz.fromInt(15));
  }
}