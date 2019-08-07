package pl.michalak.adam.letteranalyzer.output;

/**
 * Implementation of API providing methods for displaying output to the user.
 */
public class ConsoleOutput implements OutputAPI {

    private ConsoleOutput(){}


    /**
     * Factory method instantiating new immutable ConsoleOutput object.
     * @return ConsoleOutput
     */
    public static ConsoleOutput newInstance() {
        return new ConsoleOutput();
    }
}
