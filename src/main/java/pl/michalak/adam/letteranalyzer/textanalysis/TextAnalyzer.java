package pl.michalak.adam.letteranalyzer.textanalysis;

/**
 * Implementation of API providing methods for text analysis.
 * @author Adam Michalak
 */
public class TextAnalyzer implements TextAnalysisAPI {

    private final LettersWordsMatcher lettersWordsMatcher;

    private TextAnalyzer(LettersWordsMatcher lettersWordsMatcher){
        this.lettersWordsMatcher = lettersWordsMatcher;
    }

    @Override
    public String analyzeText(String text) {
        return this.lettersWordsMatcher.matchWordsToLetters(text);
    }

    /**
     * Factory method instantiating new immutable TextAnalyzer object.
     * @return TextAnalyzer
     */
    public static TextAnalyzer newInstance() {
        return new TextAnalyzer(LettersWordsMatcher.newInstance());
    }

}
