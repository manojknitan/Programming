package com.learning.general;

import java.util.*;

public class FindDuplicateElementInList {

    //
    public static Set<Integer> getDuplicates(List<Integer> lst)
    {
        Set<Integer> duplicates = new HashSet<>();

        for(int i=0;i<lst.size();i++)
        {
            for(int j=i+1;j<lst.size();j++)
            {
                if(lst.get(i) == lst.get(j))
                {
                    duplicates.add(lst.get(i));
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> original = Arrays.asList(4,2,2,7,6,6,8);
        Set<Integer> dupl = getDuplicates(original);
        System.out.println("Duplicates elements are: " +dupl);
    }

}
