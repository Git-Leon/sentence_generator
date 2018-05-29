package com.github.git_leon.sentencegenerator;

import com.github.git_leon.RandomUtils;
import com.github.git_leon.ioutils.fileutils.SimpleFileReader;

import java.util.List;

/**
 * @author leon on 5/29/18.
 */
public abstract class PartOfSpeech {
    private final List<String> fileLines;

    public PartOfSpeech(String fileName) {
        String adjectiveFolder = System.getProperty("user.dir") + "/src/main/resources/";
        String filePath = adjectiveFolder + fileName;
        SimpleFileReader sfr = new SimpleFileReader(filePath);
        this.fileLines = sfr.readLines();
    }

    public String getRandom() {
        return RandomUtils.selectElement(fileLines.stream().toArray(String[]::new));
    }

    public List<String> listAllLines() {
        return fileLines;
    }
}
