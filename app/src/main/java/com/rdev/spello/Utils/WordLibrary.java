package com.rdev.spello.Utils;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordLibrary {
    Context context;

    public WordLibrary(Context context) {
        this.context = context;
        getWords();
    }

    /**
     * A static variable to store all words in memory
     * The key contains a UPPERCASE {@link String} of the word and the value is a {@link WordResponse} for that word.
     */
    private static final Map<String, WordResponse> words = new HashMap<>();

    /**
     * Process the words file when the class is loaded, and fill a static Map
     */
    private void getWords() {
        try {
            InputStream resourceStream = context.getAssets().open("collins_scrabble_words_2019.txt");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(resourceStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] splitLine = line.split("\t");
                    if (splitLine.length == 2 & splitLine[0].length() == 5) {
                        words.put(splitLine[0], new WordResponse(splitLine[0], splitLine[1]));
                    }
                }
            }
        } catch (IOException exception) {
            System.out.println("Could not load scrabble words: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public WordResponse getRandomWord() {
        String[] keys = words.keySet().toArray(new String[0]);
        int ran = (int) (Math.random() * ( keys.length - 1 ) + 1);
        return  words.get(keys[ran]);
    }

    public boolean isWord(String word){
        return words.containsKey(word.toUpperCase(Locale.ROOT));
    }
}
