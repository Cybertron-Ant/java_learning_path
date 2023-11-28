package com.test;

import vowel.testVowel.WordVowelTracker;

// class showing the use of static methods, without instanciating its class
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        // define variable 'word'
        String word = "Antonio";

        // not necessary to create instance of class 'WordVowelTracker' because its access modifier is 'static'
        //WordVowelTracker TrackerVowels = new WordVowelTracker();

        //accessing 'trackerVowels' method in a static way, taking 'word' as an argument
        WordVowelTracker.trackVowels(word);

    }
}
