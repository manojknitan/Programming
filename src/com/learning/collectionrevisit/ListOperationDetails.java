package com.learning.collectionRevisit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperationDetails {
    //ArrayList to Array conversion


    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        //methods 1. Object[] toArray
        Object[] obj = al.toArray();
        for(Object o: obj)
        {
            System.out.println(o);
        }

        //2. T[] toArray(T[] arr)
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);

        for(Integer x: arr)
        {
            System.out.println(x);
        }

        //3. Manual way
        Integer[] ar = new Integer[al.size()];
        for(int i=0; i<al.size(); i++)
        {
            ar[i] = al.get(i);
        }

        for(Integer y: ar)
        {
            System.out.println(y);
        }

        //4. stream api
        System.out.println("Stream-----------------------");
        int[] a = al.stream().mapToInt(i->i).toArray();
        for(int x: a)
        {
            System.out.println(x);
        }

        //Array to ArrayList conversion
        Integer[]  intArr = {10,20,30,40,50,60};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(intArr));
        System.out.println("Array to List: "+list);

        //using stream
        int[] priArr = {10,20,30,40,50};
        ArrayList<Integer> list1 = Arrays.stream(priArr).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1);

    }
}
