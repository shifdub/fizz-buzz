package edu.cnm.deepdive.model;

public enum FizzBuzz {
  FIZZ,
  BUZZ,
  FIZZ_BUZZ,
  NEITHER;

  @Override
  public String toString() {

    return super.toString().toLowerCase().replace('_', '_');
  }

  public static FizzBuzz fromInt(int value) {
    FizzBuzz result;
    if (value % 3 == 0 && value % 5 == 0) {
      result = FizzBuzz.FIZZ_BUZZ;
    } else if (value % 3 == 0) {
      result = FizzBuzz.FIZZ;
    } else if (value % 5 == 0) {
      result = FizzBuzz.BUZZ;
    } else {
      result = FizzBuzz.NEITHER;
    }
    return result;

  }

}
