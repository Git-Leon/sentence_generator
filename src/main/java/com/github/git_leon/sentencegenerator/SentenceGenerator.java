package com.github.git_leon.sentencegenerator;

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
        String suffixVerb = IntransitiveVerb.BASIC.getRandom();
        return String.format("%s %s %s.", nounPhrase, verbPhrase, suffixVerb);
    }

    /**
     * subroutine that defines the nested variable NounPhrase
     */
    public static String getNounPhrase() {
        String result = "%s %s %s %s";
        String val1 = ProperNoun.NAME.getRandom();
        String val2 = Determiner.BASIC.getRandom();
        String val3 = CommonNoun.ANIMAL.getRandom();
        String val4 = Adjective.SENSATORY.getRandom();
        return String.format(result, val1, val2, val4, val3);
    }

    /**
     * subroutine that defines the nested variable VerbPhrase
     */
    public static String getVerbPhrase() {
        String result = "%s %s %s";
        String val1 = IntransitiveVerb.BASIC.getRandom();
        String val2 = Conjunction.BASIC.getRandom();
        return String.format(result, val1, val2, getNounPhrase());
    }

    public static void printSentenceComponents() {
        String nounPhrase = getNounPhrase();
        String verbPhrase = getVerbPhrase();
        String suffixVerb = IntransitiveVerb.BASIC.getRandom();
        System.out.format("\nNounPhrase = %s", nounPhrase);
        System.out.format("\nVerbPhrase = %s", verbPhrase);
        System.out.format("\nSentence = %s %s %s.", nounPhrase, verbPhrase, suffixVerb);
    }
}
