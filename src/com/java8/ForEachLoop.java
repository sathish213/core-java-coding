package com.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEachLoop {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("a",10);
        m.put("b",20);
        m.put("c",30);
        m.put("d",25);
        m.put("e",37);

        m.forEach((k,v) -> {
            System.out.println("key: "+k+" value: "+v);
            if (v % 2 == 0){
                System.out.println("value % 2: "+v);
            }
        });
    }

}
