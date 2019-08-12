package pl.michalak.adam.letteranalyzer.output;

import java.io.PrintStream;

/**
 * Implementation of API providing methods for displaying output to the user in console.
 * @author Adam Michalak
 */
public class ConsoleOutput implements OutputAPI {

    private final ConsolePrinter consolePrinter;
    private final ConsolePrinter errorPrinter;

    private ConsoleOutput(ConsolePrinter consolePrinter, ConsolePrinter errorPrinter){
        this.consolePrinter = consolePrinter;
        this.errorPrinter = errorPrinter;
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
        this.errorPrinter.println(errorMessage);
    }

    /**
     * Factory method instantiating new immutable ConsoleOutput object.
     * @return ConsoleOutput
     */
    public static ConsoleOutput newInstance() {
        return new ConsoleOutput(
                ConsolePrinter.newInstance(new PrintStream(System.out)),
                ConsolePrinter.newInstance(new PrintStream(System.err)));
    }
}
