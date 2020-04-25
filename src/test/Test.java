package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(1, "chinna", 20));
        e.add(new Employee(2, "sathish", 30));
        e.add(new Employee(3, "raju", 10));
        e.add(new Employee(4, "raj", 15));
        e.add(new Employee(5, "satya", 21));

        List<Employee> sal = e.stream().filter(obj -> obj.getSalary() >= 20).collect(Collectors.toList());
        for (Employee l : sal) {
            System.out.println(l.getId() + " " + l.getSalary() + " " + l.getName());
        }


        List<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(3);
        i.add(1);
        i.add(5);

        Optional<Integer> val = i.stream().reduce((x, y) -> (x*2) + y);
        System.out.println(val.get());

        List<String> s = i.stream().map(x-> ""+x).collect(Collectors.toList());
        for (String s1 : s) {
            System.out.println(s1);
        }

        int y = i.stream().filter(a -> a>2).mapToInt(x -> x).sum();
        System.out.println(y);
    }
}
