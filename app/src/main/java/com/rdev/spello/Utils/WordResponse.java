package com.rdev.spello.Utils;

public class WordResponse {
    private String word;
    private String definition;

    public WordResponse(String s, String s1) {
        word = s;
        definition = s1;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}
