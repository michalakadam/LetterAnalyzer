package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.HashSet;

public interface Splitter {

    HashSet<String> split(String charSequence);
}
