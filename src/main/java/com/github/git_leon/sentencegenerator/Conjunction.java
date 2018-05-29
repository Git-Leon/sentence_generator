package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class Conjunction extends PartOfSpeech {
    public static final Conjunction BASIC = new Conjunction("basic");

    public Conjunction(String fileName) {
        super("conjunctions" + fileName);
    }
}
