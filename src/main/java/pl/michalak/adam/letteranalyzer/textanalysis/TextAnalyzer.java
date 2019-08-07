package pl.michalak.adam.letteranalyzer.textanalysis;

/**
 * Implementation of API providing methods for text analysis.
 */
public class TextAnalyzer implements TextAnalysisAPI {

    private final LettersWordsMatcher lettersWordsMatcher;

    private TextAnalyzer(){
        this.lettersWordsMatcher = LettersWordsMatcher.newInstance();
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
        return new TextAnalyzer();
    }

}
