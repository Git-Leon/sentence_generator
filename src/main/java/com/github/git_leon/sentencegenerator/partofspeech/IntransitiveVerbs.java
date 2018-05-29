package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class IntransitiveVerbs extends  PartOfSpeech{
    public static final IntransitiveVerbs BASIC = new IntransitiveVerbs("basic");
    public IntransitiveVerbs(String fileName) {
        super("intransitiveverbs/" + fileName);
    }
}
