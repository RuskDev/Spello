package com.rdev.spello.Utils;

import java.io.Serializable;

public class WordResponse implements Serializable {
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
