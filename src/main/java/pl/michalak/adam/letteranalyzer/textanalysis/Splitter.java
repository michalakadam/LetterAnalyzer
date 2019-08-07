package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.HashSet;

public interface Splitter {

    public HashSet<String> split(String charSequence);
}
