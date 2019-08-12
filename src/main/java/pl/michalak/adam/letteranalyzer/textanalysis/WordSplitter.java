package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.HashSet;
import java.util.LinkedHashSet;

class WordSplitter implements Splitter{

    private WordSplitter() { }

    @Override
    public HashSet<String> split(String word) {
        HashSet<String> letterSet = new LinkedHashSet<>();
        for(char character : word.toCharArray()) {
            letterSet.add(Character.toString(character));
        }
        return  letterSet;
    }

    static WordSplitter newInstance() {
        return new WordSplitter();
    }
}
