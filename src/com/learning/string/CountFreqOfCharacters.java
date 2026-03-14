package com.learning.string;

public class CountFreqOfCharacters {
    public static void countFrequency(String s)
    {
        int[] freq = new int[256];
        boolean[] print = new boolean[256];
        for(char curr: s.toCharArray())
        {
            freq[curr]++;
        }

        //System.out.println(freq['a']);
        for(char curr: s.toCharArray())
        {
            if(!print[curr])
            {
                System.out.print(curr + "" + freq[curr]);
            }
            print[curr] = true;
        }
    }

    public static void main(String[] args) {
        String str = "abbcccd";
        countFrequency(str);
    }
}
