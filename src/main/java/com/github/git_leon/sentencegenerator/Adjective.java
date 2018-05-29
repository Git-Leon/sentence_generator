package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class Adjective extends PartOfSpeech {
    public static final Adjective COLOR = new Adjective("color");
    public static final Adjective SENSATORY = new Adjective("sensatory");

    public Adjective(String fileName) {
        super("adjectives/" + fileName);
    }
}
