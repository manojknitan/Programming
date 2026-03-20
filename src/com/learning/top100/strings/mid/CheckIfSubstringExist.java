/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class CheckIfSubstringExist {
    //Brute-force approach
    public static boolean ifExistSubstring(String s, String tar)
    {
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                String sub = s.substring(i, j);

                if(sub.equals(tar))
                    return true;
            }
        }
        return false;
    }

    public static boolean ifExist(String s, String tar)
    {
        /*if(s.indexOf(tar) != -1)
        {
            return true;
        }*/
        //return false;
        return s.contains(tar);
    }

    public static boolean ifSubstringExist(String s, String tar)
    {
        int n = s.length(), m = tar.length();
        if(m>n)
        {
            return false;
        }
        for(int i=0; i<n-m; i++)
        {
            int j=0;
            while (j < m && s.charAt(i+j) == tar.charAt(j))
            {
                j++;;
            }

            if(j == m)
            {
                int start = i;
                int end = i+m-1;
                System.out.println(start+"----"+end);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Hello";
        String target = "ell";
        //System.out.println(ifExist(str, target));
        System.out.println(ifSubstringExist(str, target));
        //System.out.println(ifExistSubstring(str, target));
    }
}
