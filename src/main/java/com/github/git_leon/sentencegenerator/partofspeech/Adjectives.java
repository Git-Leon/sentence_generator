package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class Adjectives extends PartOfSpeech {
    public static final Adjectives COLOR = new Adjectives("color");
    public static final Adjectives SENSATORY = new Adjectives("sensatory");

    public Adjectives(String fileName) {
        super("adjectives/" + fileName);
    }
}
