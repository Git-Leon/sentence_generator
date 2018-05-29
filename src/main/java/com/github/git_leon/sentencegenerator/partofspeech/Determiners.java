package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class Determiners extends PartOfSpeech {
    public static final Determiners BASIC = new Determiners("basic");
    public Determiners(String fileName) {
        super("determiners/" + fileName);
    }
}