package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String test = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);
    }

    public static Set<String> duplicateWords(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type some words: ");

        int count = 0;
        double sum = 0;

        while (sc.hasNext()) {

            String userInput = sc.next();

            double charNum = userInput.length();
            sum = charNum + sum;
            count++;

            double average = 0;
            if (count > 0) {
                average = sum / count;
            }
            System.out.println("Average word length = " + average);
        }
    }
}




