/**
 * @author: Manoj Kumar
 * @created date: 17-03-2026
 * @description: TODO
 */

package com.learning.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Regular Expression: Sequence of characters that forms a search pattern.
* Uses: To perform all types of text search and text replace operations.
*
* Package: java.util.regex;
* Imp Classes:
*   Pattern - compiled representation of a regular expression, provides no public constructors.
*   Matcher - engine that interprets the pattern and performs match against input string, provides no public constructors.
*   PatternSyntaxException - Unchecked Exception, indicate syntax error.
*
* Metacharacters: characters have special meaning, supported by this API "<([{\^-=$!|]})?*+.>"
* - @ and #, carry no special meaning.
* - two ways to force a metacharacter to be treated as ordinary characters:
*   1: precede the metacharacter with a backslash '\'
*   2: enclose it within \Q (start) and \E (end)
*
* Character class: In the context of regular expressions, a character class is a set of characters enclosed within
* square brackets. It specifies the characters that will successfully match a single character from a given input
* string.
* [abc] - find one characters from bracket.
* [^abc] - NOT between the bracket.
* [0-9] - find one character from the range 0 to 9.
* [0-4[6-8]] - unions: values one from 0,1,2,3,4,6,7,8
* Intersection - [0-5 && [3-9]] - 3,4,5
* */
public class RegularExpression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("visit w3schools !");
        boolean b = m.find();
        if(b)
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
