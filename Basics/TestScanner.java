package Basics;

import data.Input;

public class TestScanner {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        String sentence = Input.nextLine();
        System.out.println("Enter another sentence:");
        String sentence2 = Input.nextLine();
        System.out.println("Enter a word:");
        String word = Input.next();

        System.out.println("Sentence: " + sentence);
        System.out.println("Sentence2: " + sentence2);
        System.out.println("Word: " + word);
    }
}

/*
i love you
hello
*/