package com.learning.collectionRevisit.hashSet;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateInArray {
    public static void findDuplicate(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> dupList = new ArrayList<>();

        for(int ele: arr)
        {
            if(!set.add(ele))
            {
                dupList.add(ele);
            }
        }

        System.out.println(dupList);
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,6,8,9,5,6,2,3,4,5};
        findDuplicate(a);
    }
}
