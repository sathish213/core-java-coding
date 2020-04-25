package com.clone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Integer> l= new ArrayList<>();
        l.add(2);
        l.add(5);
        Employee e = new Employee("chinna", 1, l);
        l.add(5);
        System.out.println(e.getValues().size());

        Employee e1 = e.copy();
        //e.setId(2);


        //l.add(6);
        System.out.println(e1.getValues().size()+ " "+e1.getId());


    }

}

class Employee implements Cloneable{
    private String name;
    private int id;
    private List<Integer> values;

    public Employee copy() throws CloneNotSupportedException {
        return (Employee )this.clone();
    }

    public Employee(String name, int id, List<Integer> values) {
        this.name = name;
        this.id = id;
        this.values = new ArrayList<>(values);
        //Collections.copy(this.values,values);
        //this.values = values;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public List<Integer> getValues() {
        return new ArrayList<>(values);
    }

}
