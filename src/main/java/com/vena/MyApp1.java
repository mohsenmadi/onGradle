package com.vena;

import com.google.gson.Gson;

import static spark.Spark.*;

public class MyApp1 {
  public static void main(String[] args) {

    MyService myService = new MyService();

    get("/gep", (req, res) -> {
        String str = req.queryParams("str");
        Integer num = Integer.valueOf(req.queryParams("num"));
        res.type("application/json");

        return myService.getInfo(str, num);
      },
      new Gson()::toJson);

    post("/pep", (req, res) -> {
        res.type("application/json");
        MyRetObj obj = new Gson().fromJson(req.body(), MyRetObj.class);
        obj.prepData();
        return obj;
      },
      new Gson()::toJson);
  }

  public static String justRepeatIt(String str, int n) {
    return str.repeat(n);
  }
}
