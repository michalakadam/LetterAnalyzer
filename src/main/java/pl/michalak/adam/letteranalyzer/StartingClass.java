package pl.michalak.adam.letteranalyzer;
/**
 * Starting class of LetterAnalyzer application.<br/>
 * Responsible for initialization of {@link ProgramFlowController}.
 *
 * @author Adam Michalak
 */
class StartingClass {
public static void main(String[] args) {
        ProgramFlowController.newInstance().runLetterAnalyzer();
    }
}
