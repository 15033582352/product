package com.example.demo.conf;

public interface test {
    static int a(){
      return 1;
    }
    default  int b(){
        return  2;
    }

}
