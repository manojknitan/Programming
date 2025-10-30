package com.test.learning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        /*Stream<Integer> stream1 = Stream.of(1, 2, 3, 4 ,5 ,6);
        stream1.filter(e -> e % 2 == 0)
                .forEach(System.out::println);*/

        //----------------------------------------------------------------------
        IntStream s= IntStream.range(1,5);
        //s.forEach(System.out::println);

//        -----------------------------------------------------------------------
        int[] a= {2,3,4,5,6,7,8};
        IntStream intStream = Arrays.stream(a);
        //intStream.forEach(System.out::println);

//        ---------------------------------------------------------------------
        List<Integer> list= List.of(2,3,4,5,6,7,8);
        //list.add(10);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);

//        --------------------------------------------------------------------
        /*BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("abc.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("Pls check, if file exist or the file name shot be 'abc.txt'");
        }
        if(br!=null) {
            Stream<String> s1 = br.lines();
            s1.forEach(System.out::println);*/
        }
    }


