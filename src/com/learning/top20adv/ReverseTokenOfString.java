package com.learning.top20adv;

public class ReverseTokenOfString {
    public static void reverseWordFromSentence(String s)
    {
        String[] tokens = s.split("\\s+");
        String rev ="";
        String targetRev = "";
        for(String s1: tokens) {
            //System.out.println(s1);
            if(s1.equals("forward"))
            {
                for(int i=s1.length()-1; i>=0; i--)
                {
                    targetRev = targetRev + s1.charAt(i);
                }
                rev = rev + targetRev+" ";
            }
            else {
                rev = rev+s1+" ";
            }
        }
        System.out.print(rev.trim());
    }

    public static void reverseSpecificToken(String s)
    {
        String[] tokens = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String token: tokens)
        {
            if(token.equals("forward"))
            {
                String rev = "";
                for(int i= token.length()-1; i>=0; i--)
                {
                    rev = rev+token.charAt(i);
                }
                res = res.append(rev).append(" ");
            }
            else {
                res = res.append(token).append(" ");
            }
        }
        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        String str = "I am moving forward direction";
        //reverseWordFromSentence(str);
        reverseSpecificToken(str);
    }
}
