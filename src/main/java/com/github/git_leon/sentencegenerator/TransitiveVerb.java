package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class TransitiveVerb extends PartOfSpeech {
    public static TransitiveVerb BASIC = new TransitiveVerb("basic");
    public TransitiveVerb(String fileName) {
        super("transitiveverbs/" + fileName);
    }
}
