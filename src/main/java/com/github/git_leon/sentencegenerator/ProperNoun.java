package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class ProperNoun extends PartOfSpeech {
    public static final ProperNoun NAME = new ProperNoun("name");

    public ProperNoun(String fileName) {
        super("propernouns/" + fileName);
    }
}
