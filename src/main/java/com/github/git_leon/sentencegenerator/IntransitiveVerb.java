package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class IntransitiveVerb extends  PartOfSpeech{
    public static final IntransitiveVerb BASIC = new IntransitiveVerb("basic");
    public IntransitiveVerb(String fileName) {
        super("intransitiveverbs/" + fileName);
    }
}
