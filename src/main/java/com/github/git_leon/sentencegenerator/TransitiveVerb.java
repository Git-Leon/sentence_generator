package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class TransitiveVerb extends PartOfSpeech {
    public static TransitiveVerb HAPPY = new TransitiveVerb("happy");
    public TransitiveVerb(String fileName) {
        super("transitiveverbs/" + fileName);
    }
}
