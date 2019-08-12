package pl.michalak.adam.letteranalyzer.output;

/**
 * Implementation of API providing methods for displaying output to the user in console.
 * @author Adam Michalak
 */
public class ConsoleOutput implements OutputAPI {

    private final ConsolePrinter consolePrinter;
    private final ErrorPrinter errorPrinter;

    private ConsoleOutput(){
        this.consolePrinter = ConsolePrinter.newInstance();
        this.errorPrinter = ErrorPrinter.newInstance();
    }

    @Override
    public void print(String message) {
        this.consolePrinter.print(message);
    }

    @Override
    public void println(String message) {
        this.consolePrinter.println(message);
    }

    @Override
    public void printErr(String errorMessage) {
        this.errorPrinter.print(errorMessage);
    }

    /**
     * Factory method instantiating new immutable ConsoleOutput object.
     * @return ConsoleOutput
     */
    public static ConsoleOutput newInstance() {
        return new ConsoleOutput();
    }
}
