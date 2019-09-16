package com.vena;

public class MyService {

  public String[] getInfo(String str, int r) {
    return new String[]{str.repeat(r), "two", "three"};
  }

  public MyRetObj postInfo(String name, String email) {
    MyRetObj myRetObj = new MyRetObj(name, email);
    return myRetObj;
  }
}
