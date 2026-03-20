package com.learning.collectionRevisit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WaytToIterateMap
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1);
        map.put("A", 1);
        map.put("N", 1);
        map.put("O", 1);
        map.put("J", 1);

        //using for-each+entryset
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  ----> " + entry.getValue());
        }

        //using keyset
        for(String key: map.keySet())
        {
            System.out.println(key+"----"+map.get(key));
        }

        //using values+for each
        for(Integer val: map.values())
        {
            System.out.println(val);
        }

        //iterator+entryset
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        //using lambda
        map.forEach((key, value) ->
                System.out.println(key+"----"+value)
        );

        //using lambda+method reference
        //map.forEach(System.out::println);

        //using stream
        map.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey()+"=="+entry.getValue())
                );
    }
}
