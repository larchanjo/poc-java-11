package com.example;

import java.util.Arrays;

public class LambdaParameterExample {

  public static void main(String[] args) {
    var list = Arrays.asList(1,2,3,4);
    System.out.println(list.stream().filter((var value1) -> value1 != 0));
  }

}
