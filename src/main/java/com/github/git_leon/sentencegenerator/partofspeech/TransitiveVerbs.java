package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class TransitiveVerbs extends PartOfSpeech {
    public static TransitiveVerbs HAPPY = new TransitiveVerbs("happy");
    public TransitiveVerbs(String fileName) {
        super("transitiveverbs/" + fileName);
    }
}
