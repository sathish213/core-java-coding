package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordCount {
    public static void main(String[] args) {
        String s = "bread butter and bread";

        String[] words = s.split(" ");

        Map<String, Integer> m = new HashMap<>();

        for (String word : words){
            if (m.containsKey(word)){
                m.put(word, m.get(word)+1);
            }
            else {
                m.put(word, 1);
            }
        }

        Set<String> wordsInString = m.keySet();

        for (String word : wordsInString)
        {
            System.out.println(word +" "+m.get(word));
        }
    }
}
