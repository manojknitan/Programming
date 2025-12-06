package com.learning.recursion.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    public static ArrayList<String> combination(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        String[] codes = {".;", "abc", "def",
                "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = combination(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch-'0'];
        for(int i=0; i<codeforch.length(); i++)
        {
            char chcode = codeforch.charAt(i);
            for(String s: rres)
            {
                mres.add(chcode + s);
            }
        }
        return mres;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        ArrayList<String> res = combination(st);
        System.out.println(res);
    }
}
