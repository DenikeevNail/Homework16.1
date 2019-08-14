package com.company;

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dict = new HashMap<>();

        dict.put("дерево", new String[]{"бумага", "растение"});
        dict.put("животное", new String[]{"кот", "собака"});
        dict.put("машина", new String[]{"спортивная", "средство передвижения", "автомобиль"});
        dict.put("дом", new String[]{"дача"});

        Set<Map.Entry<String, String[]>> r = dict.entrySet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scanner.nextLine();

        for (Map.Entry<String, String[]> rd : r) {
            for (String st : rd.getValue()) {
                if (word.equals(st)) {
                    System.out.println(rd.getKey());
                    for (String s : rd.getValue()) {
                        System.out.println(s);
                    }
                }
            }
        }
        for (Map.Entry<String, String[]> rd : r) {
            if (word.equals(rd.getKey())) {
                for (String s : rd.getValue()) {
                    System.out.println(s);
                }
            }
        }

        Map<String, String[]> dictionaryMap = new HashMap<>();

        for (Map.Entry<String, String[]> retournKeyValue : r) {
            String key = retournKeyValue.getKey();
            String[] value = retournKeyValue.getValue();
            for (int i = 0; i < value.length; i++) {
                String synonym = value[i];
                String[] values = new String[value.length];
                for (int a = 0; a < values.length; a++){
                    String value2 = value[a];
                    if(value2.equals(synonym)){
                        values[a] = key;
                    }else{
                        values[a]=value2;
                    }
                }
                dictionaryMap.put(synonym,values);
            }

        }
    }
}
