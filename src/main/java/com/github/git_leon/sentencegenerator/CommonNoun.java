package com.github.git_leon.sentencegenerator;

/**
 * @author leon on 5/29/18.
 */
public class CommonNoun extends PartOfSpeech {
    public static final CommonNoun ANIMAL = new CommonNoun("animal");
    public static final CommonNoun FOOD = new CommonNoun("food");

    public CommonNoun(String fileName) {
        super("commonnouns/" +  fileName);
    }
}
