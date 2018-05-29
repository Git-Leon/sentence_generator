package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class Conjunctions extends PartOfSpeech {
    public static final Conjunctions BASIC = new Conjunctions("basic");

    public Conjunctions(String fileName) {
        super("conjunctions/" + fileName);
    }
}
