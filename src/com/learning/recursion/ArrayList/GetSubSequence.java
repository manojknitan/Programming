package com.learning.recursion.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    public static ArrayList<String> SubSequence(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = SubSequence(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String s: rres)
            mres.add(""+s);

        for(String s:rres)
            mres.add(ch+s);

        return mres;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> res = SubSequence(s);
        System.out.println(res);
    }
}
