package com.bridgelabz;
/**
 * Java program  to print reverse of words in a string.
 * takes three names as input and
 * prints out a proper sentence with the names in the reverse of the order given, so
 * that for example, "java PrintThreeNames Alice Bob Carol" gives
 *
 *
 * @Date -02/06/2021
 * @author Deepak Jaiswal
 */


public class PrintThreeNames {
    public static String wordReverse(String str)
    {
        int i = str.length() -1;
        int start, end = i + 1;
        String result = "";

        while(i >= 0)
        {
            if(str.charAt(i) == ' ')
            {
                start = i + 1;
                while(start != end)
                    result += str.charAt(start++);

                result += ' ';

                end = i;
            }
            i--;
        }

        start = 0;
        while(start != end)
            result += str.charAt(start++);
        return result;

    }
    /** Reverse The Name */

    public static void main(String[] args)
    {
        String str = "Alice BoB Carol";

        System.out.print(wordReverse(str));
    }

}
