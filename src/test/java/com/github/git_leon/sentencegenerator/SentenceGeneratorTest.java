package com.github.git_leon.sentencegenerator;

import org.junit.Test;

import static com.github.git_leon.sentencegenerator.SentenceGenerator.getSimpleSentence;

/**
 * @author leon on 5/29/18.
 */
public class SentenceGeneratorTest {
    @Test
    public void getSimpleSentenceTest() {
        for (Integer i = 0; i < 100; i++) {
            System.out.format("\nSentence:\n\t>> %s", getSimpleSentence());
        }
    }
}
