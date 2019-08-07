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

    /**
     * Method that ensures that program is executed in correct order.
     * Prompts user for input, collects it (with validation) and passes it to analyzer.
     * Finally informs user about result.
     */
    public void runLetterAnalyzer() {
       promptUserForInput();
       String userInput = collectUserInput();
       String result = analyzeUserInput(userInput);
       this.consoleOutput.println(result);
    }

    private void promptUserForInput() {
        this.consoleOutput.println("Welcome to the LetterAnalyzer!");
        this.consoleOutput.println("This program assembles words from user's text according to letters that build them.");
    }

    private String collectUserInput() {
        this.consoleOutput.print("Provide LetterAnalyzer with text: ");
        try {
            return inputProvider.collectStringInputFromUser();
        }
        catch (IllegalArgumentException exception) {
            this.consoleOutput.printErr(exception.getMessage());
            return collectUserInput();
        }
    }

    private String analyzeUserInput(String userInput) {
        return this.textAnalyzer.analyzeText(userInput);
    }

    /**
     * Factory method instantiating new immutable ProgramFlowController object.
     * @return ProgramFlowController
     */
    public static ProgramFlowController newInstance() {
        return new ProgramFlowController();
    }
}
