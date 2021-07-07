package com.javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class javastringbasicWithReverse {

    /*
    String is an Classname and contains many methods like below ,so it should always start with Capital letters

    Primitive date types are String,int,float,boolean ,char (all data types are starts with small except String)
    Following are some interesting facts about String and StringBuilder classes :
    1. Objects of String are immutable.
    2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
    3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.

       String la append and reverse illa direct ah

         */


    //reverse with functions

    public static String Reverse(String word){
        String temp = "";
        char[] arr = word.toCharArray();
        for(int i = arr.length-1;i>=0;i--){
            temp = temp+arr[i];
        }
        return temp;
    }

    public static <Char> void main(String[] args) {
        String text = " tEst \"try\" thIs \nWword"  ;

        String upperCaseConversion = text.toUpperCase();

        String lowerCaseConversion = upperCaseConversion.toLowerCase();

        String concateString = text.concat("added");
        String substringselect = text.substring(1,2);
        boolean contains = text.contains("try");
        String replace = text.replace("try","tryme");
        String replacealll = text.replaceAll("all","done");
        String trimbothside= text.trim();
        int lengthOfString = text.length();
        char[] StringtoChar = text.toCharArray();

        System.out.println("upper case letters :" + upperCaseConversion);
        System.out.println("upper case letters :" + lowerCaseConversion);
        System.out.println("concate string :" + concateString);
        System.out.println("contains :" + contains);
        System.out.println("replace :" + replace);
        System.out.println("replaceall :" + replacealll);
        System.out.println("trim both side :" + trimbothside);
        System.out.println("length of the sring :" + lengthOfString);
        System.out.println("charArray lentgh :" + StringtoChar.length);

        String textwithspaceandwords = "test this space";
        char[] StringtoCharforspacewords = textwithspaceandwords.toCharArray();
        System.out.println("StringtoCharforspacewords lentgh :" + StringtoCharforspacewords.length);



        for(int i=StringtoCharforspacewords.length-1;i>=0;i--)
        {
            //char getDataByPositionforAppend = StringtoCharforspacewords[i];
            System.out.print(StringtoCharforspacewords[i]);


        }


        //String reverse using arraylist

        String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();  //character is the wrapper class for char to be mentioned here

        for (char c : hello)
            trial1.add(c); // adding the character array to arraylist

        Collections.reverse(trial1);

        for(Character finals:trial1)
        {
            System.out.print(finals);
        }

        StringBuilder objtextrev = new StringBuilder(input);
        System.out.print(objtextrev.reverse());

        String reversefunctionreturn= Reverse("test it");
        System.out.println("reverse using fucntion :"+reversefunctionreturn);

        String wordsswaporigin =  "tes me";
        String[] splitword = wordsswaporigin.split("");
        for(int i=splitword.length-1;i>=0;i--)
        {
            System.out.print(splitword[i]);
        }

        /*
        String builder used to insert ,delete and replace the string, reverse and append
        access with charcAt and substring
         */

        String inputString =  "This is an This String";
        StringBuilder namy= new StringBuilder(inputString);

        System.out.println("mm is :"+namy.insert(5,"test"));

        System.out.println(namy.charAt(0));

        System.out.println(namy.replace(0,1,"Ok"));

        System.out.println(namy.append(1));

        System.out.println(namy.append("checkappend"));

        double inputStrings =  1.00;
        StringBuilder namys= new StringBuilder((int) inputStrings);
        namy.append(2);



    }

}
