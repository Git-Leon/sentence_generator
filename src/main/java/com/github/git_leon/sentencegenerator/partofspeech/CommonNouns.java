package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class CommonNouns extends PartOfSpeech {
    public static final CommonNouns ANIMAL = new CommonNouns("animal");
    public static final CommonNouns FOOD = new CommonNouns("food");

    public CommonNouns(String fileName) {
        super("commonnouns/" +  fileName);
    }
}
