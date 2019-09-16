package com.vena;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyApp1Test {

  @Test
  public void justRepeatIt() {
    String expected = "oneTwo!oneTwo!";
    String actual = MyApp1.justRepeatIt("oneTwo!", 2);

    assertEquals(expected, actual);
  }
}