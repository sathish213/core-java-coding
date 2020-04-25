package com.practice.collection;

public class comparableDemo implements Comparable<comparableDemo>{
    int id;
    String name;
    String disgnation;
    int sal;

    public comparableDemo(int id, String name, String disgnation, int sal) {
        this.id = id;
        this.name = name;
        this.disgnation = disgnation;
        this.sal = sal;
    }

    public comparableDemo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisgnation() {
        return disgnation;
    }

    public void setDisgnation(String disgnation) {
        this.disgnation = disgnation;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public int compareTo(comparableDemo o) {
        return this.sal - o.getSal();
    }

    @Override
    public String toString() {
        return "comparableDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", disgnation='" + disgnation + '\'' +
                ", sal=" + sal +
                '}';
    }
}
