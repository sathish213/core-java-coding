package com.java8;

public class Devlopers {
    private String name;
    private int sal;
    private String desg;

    public Devlopers(String name, int sal, String desg) {
        this.name = name;
        this.sal = sal;
        this.desg = desg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }
}
