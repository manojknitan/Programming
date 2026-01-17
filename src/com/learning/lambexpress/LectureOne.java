package com.learning.lambexpress;


import java.util.function.Predicate;

public class LectureOne {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i>5);
        System.out.println(p.test(10));
    }
}
