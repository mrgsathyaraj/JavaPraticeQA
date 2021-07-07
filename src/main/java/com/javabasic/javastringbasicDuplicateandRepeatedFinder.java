package com.javabasic;

import java.util.HashSet;
import java.util.Set;

public class javastringbasicDuplicateandRepeatedFinder {


    public String FindDuplicateWordsWithSet(String dwords)
    {

        String[] result = dwords.split(" ");

        Set<String> Uniqueobj = new HashSet<>();
        Set<String> UniqueobjwihDup = new HashSet<>();


        for (String s : result) {

            if (Uniqueobj.add(s)) {
                Uniqueobj.add(s);
            } else {
                UniqueobjwihDup.add(s);

            }
        }
        StringBuilder UniqueValues = new StringBuilder();
        StringBuilder DuplicateValues = new StringBuilder();

        for(String U : Uniqueobj)
        {

            UniqueValues.append(U);
        }


        for(String D : UniqueobjwihDup)
        {

            DuplicateValues.append(D);
        }

        String Final = UniqueValues+"."+DuplicateValues;

        System.out.println("Final is :"+Final);

        return Final;

    }

    public static void main(String[] args) {

      javastringbasicDuplicateandRepeatedFinder obj = new javastringbasicDuplicateandRepeatedFinder();

      String dwords = "test the test and verify the test";
      String resultdwords= obj.FindDuplicateWordsWithSet(dwords);

      System.out.println("actual words:"+dwords);

      String[] FinalResult = resultdwords.split("\\.");
      System.out.println("result of unique words with Set :"+FinalResult[0]);
      System.out.println("result of Duplicated words with Set :"+FinalResult[1]);

    }
}
