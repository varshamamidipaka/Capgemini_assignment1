package Collectionss;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","anusha");
        map.put("7","kavya");
        map.put("3","jyothsna");
        map.put("2","pratyusha");
        map.put("6","vedansh");
        map.put("4","gnanu");
        map.put("9","pragna");
        TreeMap<String,String> treemap=new TreeMap<String, String>();
        treemap.putAll(map);
        for (Map.Entry<String,String> entry:map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());

    }

}
