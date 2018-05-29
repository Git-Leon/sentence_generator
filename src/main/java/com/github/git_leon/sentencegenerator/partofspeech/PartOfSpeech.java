package com.github.git_leon.sentencegenerator.partofspeech;

import com.github.git_leon.ioutils.fileutils.SimpleFileReader;

import java.util.List;

/**
 * @author leon on 5/29/18.
 */
abstract public class PartOfSpeech {
    private final SimpleFileReader sfr;

    public PartOfSpeech(String fileName) {
        String resourceFolder = System.getProperty("user.dir") + "/src/main/resources/";
        String filePath = resourceFolder + fileName;
        this.sfr = new SimpleFileReader(filePath);
    }

    public String getRandomAsString() {
        return sfr.readRandomLineNumber();
    }

    public List<String> listAllLines() {
        return sfr.readLines();
    }
}
