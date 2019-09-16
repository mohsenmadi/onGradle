package com.vena;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyRetObj {
  Long id;
  String name;
  String email;
  List<Integer> data;

  public MyRetObj(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void prepData() {
    this.id = System.nanoTime();
    this.data = IntStream
      .range(0, this.name.length())
      .map(i -> i * i)
      .boxed()
      .collect(Collectors.toList());
  }
}
