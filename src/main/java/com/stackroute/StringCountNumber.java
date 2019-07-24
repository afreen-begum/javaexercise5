package com.stackroute;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCountNumber {
        public String checkStringCount(String input) {
            if (input == null)
                return null;
            List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
            Map<String, Integer> map = new HashMap<>();
            for (String each : stringList) {
                if (map.containsKey(each))
                {
                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            return map.toString();
        }


    }
