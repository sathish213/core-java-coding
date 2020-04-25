package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaWithComparator {
    static Comparator<Devlopers> bys = (Devlopers d1, Devlopers d2)->{
        if(d1.getSal()>d2.getSal())
            return -1;
        else if (d1.getSal()<d2.getSal())
            return 1;
        else return 0;
    };
    public static void main(String[] args) {
        List<Devlopers> d = new ArrayList<>();

        d.add(new Devlopers("chinna1",20,"ita"));
        d.add(new Devlopers("chinna9",10,"ita"));
        d.add(new Devlopers("chinna3",50,"ita"));
        d.add(new Devlopers("chinna2",30,"ita"));
        d.add(new Devlopers("chinna5",40,"ita"));

        /*Collections.sort(d,bys);
        for (Devlopers dev : d){
            System.out.println(dev.getDesg() + " "+ dev.getSal()+" "+dev.getName());
        }*/

        d.sort((Devlopers d1, Devlopers d2)->d1.getSal() - d2.getSal());
        d.forEach(dev -> System.out.println(dev.getDesg() + " "+ dev.getSal()+" "+dev.getName()));

        //byname
        d.sort((Devlopers d1, Devlopers d2)->d1.getName().compareTo(d2.getName()));
        d.forEach(dev -> System.out.println(dev.getDesg() + " "+ dev.getSal()+" "+dev.getName()));
    }
}
