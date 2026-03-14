package com.learning.collectionRevisit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsageOfIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i< 10; i++)
        {
            list.add(i);
        }

        System.out.println("List is: "+list);

        //Iterator
        System.out.println("Using Iterator: ------------------");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext())
        {
            int i = itr.next();
            System.out.print(i+" ");

            if(i%2!=0)
                itr.remove();
        }

        System.out.println();
        System.out.println("List has been modified: "+list);

        //ListIterator
        ListIterator<Integer> litr = list.listIterator();

        System.out.println("List Iterator------------------------------------------");
        while(litr.hasNext())
        {
            System.out.print(litr.next());
        }

        while(litr.hasPrevious())
        {
            System.out.print(litr.previous()+" ");
        }
    }
}
