package string.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestWord {
    public static void main(String[] args) {
        new LongestWord();

    }

        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String str = "Human brain is a biological learning machine";
        String stringArray[] = str.split( "\\s");

        public String compare(String st1, String st2) {
            if (st1.length() > st2.length()){
                return st1;
            } else {
                return st2;
            }
        }
        LongestWord() {
            String word = "";
            for (int i = 0; i < stringArray.length; i++) {
                if (i == 0) {
                    word = stringArray [0];
                }
            word = compare(word, stringArray [i]);
            }
           System.out.println("Longest word = " + word);
            System.out.println("Length is : " + word.length());
        }



}
