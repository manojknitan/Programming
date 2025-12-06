package com.learning.general;

public class StringPattern {


    public static void main(String[] args) {
        String s = "I Love My Country";
        String result = "";

        String[] tokens = s.split(" ");
        for (int i = 0; i < tokens.length; i++)
        {
            if (i == 0)
            {
                result = tokens[i];
            }
            else
            {
                result = result + " " + tokens[i];
            }
            System.out.println(result);

        }
    }

}
