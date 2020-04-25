package com.practice.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExceptionCatchBlock {
    public static void main(String[] args) {
        BufferedReader rd = null;
        try{
                // Open the file for reading.
                rd = new BufferedReader(new FileReader(new File("chinna.txt")));

                // Read all contents of the file.
                String inputLine = null;
                while((inputLine = rd.readLine()) != null)
                    System.out.println(inputLine);

        } catch (Exception e){
            System.out.println("exception");
        } catch (Throwable t){
            System.out.println("throwable");
        }finally {
            System.out.println("finnaly");
        }

    }
}
