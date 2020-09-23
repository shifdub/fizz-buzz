package edu.cnm.deepdive.controller;

import edu.cnm.deepdive.model.Converter;
import edu.cnm.deepdive.view.FizzBuzzString;

public class Main {

  private static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
    for (int i = 1; i <= upperLimit; i++) {
      System.out.printf("%d : %s%n", i, FizzBuzzString.format(Converter.convert(i)));
    }

  }

}
