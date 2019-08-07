package pl.michalak.adam.letteranalyzer.textanalysis;

/**
 * Implementation of API providing methods for text analysis.
 */
public class TextAnalyzer implements TextAnalysisAPI {

    private TextAnalyzer(){}


    /**
     * Factory method instantiating new immutable TextAnalyzer object.
     * @return TextAnalyzer
     */
    public static TextAnalyzer newInstance() {
        return new TextAnalyzer();
    }
}
