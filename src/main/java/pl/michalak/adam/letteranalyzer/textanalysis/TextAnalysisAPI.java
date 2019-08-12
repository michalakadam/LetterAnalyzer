package pl.michalak.adam.letteranalyzer.textanalysis;

/**
 * Analyzes text provided by user which is the main goal of this program.
 * @author Adam Michalak
 */
public interface TextAnalysisAPI {

    /**
     * Looks for words and letters in text and assigns words to letters that compose them.
     * @param text - input provided by user
     * @return result of analysis in form letter - [words]\n
     */
    String analyzeText(String text);
}
