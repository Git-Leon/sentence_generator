package com.github.git_leon.sentencegenerator;

import com.github.git_leon.sentencegenerator.partofspeech.*;

/**
 * @author leon on 5/29/18.
 */
public class SentenceGenerator {
    /**
     * subroutine that defines how SimpleSentence is put together, nesting
     * NounPhrase and VerbPhrase subroutines
     */
    public static String getSimpleSentence() {
        String nounPhrase = getNounPhrase();
        String verbPhrase = getVerbPhrase();
        String suffixVerb = IntransitiveVerbs.BASIC.getRandomAsString();
        return String.format("%s %s %s.", nounPhrase, verbPhrase, suffixVerb);
    }

    /**
     * subroutine that defines the nested variable NounPhrase
     */
    public static String getNounPhrase() {
        String result = "%s %s %s %s";
        String val1 = ProperNouns.NAME.getRandomAsString();
        String val2 = Determiners.BASIC.getRandomAsString();
        String val3 = CommonNouns.ANIMAL.getRandomAsString();
        String val4 = Adjectives.SENSATORY.getRandomAsString();
        return String.format(result, val1, val2, val4, val3);
    }

    /**
     * subroutine that defines the nested variable VerbPhrase
     */
    public static String getVerbPhrase() {
        String result = "%s %s %s";
        String val1 = IntransitiveVerbs.BASIC.getRandomAsString();
        String val2 = Conjunctions.BASIC.getRandomAsString();
        return String.format(result, val1, val2, getNounPhrase());
    }

    public static void printSentenceComponents() {
        String nounPhrase = getNounPhrase();
        String verbPhrase = getVerbPhrase();
        String suffixVerb = IntransitiveVerbs.BASIC.getRandomAsString();
        System.out.format("\nNounPhrase = %s", nounPhrase);
        System.out.format("\nVerbPhrase = %s", verbPhrase);
        System.out.format("\nSentence = %s %s %s.", nounPhrase, verbPhrase, suffixVerb);
    }
}
