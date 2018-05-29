package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class Determiner extends PartOfSpeech {
    public static final Determiner BASIC = new Determiner("basic");
    public Determiner(String fileName) {
        super("determiners/" + fileName);
    }
}
