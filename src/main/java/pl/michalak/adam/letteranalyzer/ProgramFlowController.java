package pl.michalak.adam.letteranalyzer;

import pl.michalak.adam.letteranalyzer.input.InputAPI;
import pl.michalak.adam.letteranalyzer.input.InputProvider;
import pl.michalak.adam.letteranalyzer.output.ConsoleOutput;
import pl.michalak.adam.letteranalyzer.output.OutputAPI;
import pl.michalak.adam.letteranalyzer.textanalysis.TextAnalysisAPI;
import pl.michalak.adam.letteranalyzer.textanalysis.TextAnalyzer;

/**
 * Responsible for ensuring the right flow of the program.<br/>
 * Makes calls in predefined order to objects responsible for prompting user for input,
 * displaying error messages and the final result ({@link pl.michalak.adam.letteranalyzer.output.ConsoleOutput}),
 * gathering and validating information from the user ({@link pl.michalak.adam.letteranalyzer.input.InputProvider})
 * and analysis of the provided text ({@link pl.michalak.adam.letteranalyzer.textanalysis.TextAnalyzer}).
 */

public class ProgramFlowController {
    private final OutputAPI consoleOutput;
    private final InputAPI inputProvider;
    private final TextAnalysisAPI textAnalyzer;

    private ProgramFlowController() {
        this.consoleOutput = ConsoleOutput.newInstance();
        this.inputProvider = InputProvider.newInstance();
        this.textAnalyzer = TextAnalyzer.newInstance();
    }

    public void runLetterAnalyzer() {
       this.promptUserForInput();
    }

    private void promptUserForInput() {
        this.consoleOutput.println("Welcome to the LetterAnalyzer!");
        this.consoleOutput.println("This program assembles words from user's text according to letters that build them.");
        this.consoleOutput.print("Provide LetterAnalyzer with text: ");
    }

    /**
     * Factory method instantiating new immutable ProgramFlowController object.
     * @return ProgramFlowController
     */
    public static ProgramFlowController newInstance() {
        return new ProgramFlowController();
    }
}
