package pl.michalak.adam.letteranalyzer.textanalysis;

/**
 * Provides methods for text analysis which is the main goal of this program.
 */
public interface TextAnalysisAPI {

    /**
     * Looks for words and letters in text and assigns words to letters that compose them.
     * @param text - input provided by user
     * @return result of analysis in form letter - [words]\n
     */
    public String analyzeText(String text);
}
