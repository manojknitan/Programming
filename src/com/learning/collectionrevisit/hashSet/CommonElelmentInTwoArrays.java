package com.learning.collectionRevisit.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElelmentInTwoArrays {
    public static void commonEleInArrays(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> commList = new ArrayList<>();

        for(int x: arr1)
        {
            set.add(x);
        }

        for(int y: arr2)
        {
            if(set.contains(y))
            {
                commList.add(y);
            }
        }

        System.out.println(commList);
    }

    public static void main(String[] args) {
        int[] a1 = {1,5,6,8,9,5,4,6,12,42};
        int[] a2 = {1,5,6,8,9,7,4,5,12,22};

        commonEleInArrays(a1, a2);
    }
}
