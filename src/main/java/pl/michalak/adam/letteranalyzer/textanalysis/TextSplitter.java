package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

class TextSplitter implements Splitter{

    private TextSplitter() { }

    @Override
    public HashSet<String> split(String text) {
        HashSet<String> wordSet = new LinkedHashSet<>();
        wordSet.addAll(Arrays.asList(text.split(" ")));
        return wordSet;
    }

    static TextSplitter newInstance() {
        return new TextSplitter();
    }
}
