package com.java8;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterCollect {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("chinna","raju","chandu","ramky");
        List<Devlopers> d = new ArrayList<>();

        Devlopers d1 = new Devlopers("chinna", 10, "sa");
        Devlopers d2 = new Devlopers("raju", 10, "sa");
        Devlopers d3 = new Devlopers("kanna", 10, "sa");
        d.add(d1);
        d.add(d2);
        d.add(d3);

        //List<String> name = d.stream().filter(data -> data.getName()).collect(Collectors.toList());

        Function<Object, String> f = o -> ((Devlopers) o).getName();
        List<String > n = d.stream().map(f).collect(Collectors.toList());
        System.out.println("0000"+n);

        List<String> l1 = l.stream().filter(line-> !"raju".equals(line)).collect(Collectors.toList());

        l1.forEach(data-> System.out.println(data));

        //predicate example
        Predicate<Integer> p = integer -> false;
        System.out.println(p.test(19));


    }
}
