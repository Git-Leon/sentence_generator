package com.github.git_leon.sentencegenerator.partofspeech;

/**
 * @author leon on 5/29/18.
 */
public class ProperNouns extends PartOfSpeech {
    public static final ProperNouns NAME = new ProperNouns("name");

    public ProperNouns(String fileName) {
        super("propernouns/" + fileName);
    }
}
