package pl.michalak.adam.letteranalyzer.output;

import java.io.PrintStream;

class ErrorPrinter {

    private final PrintStream printStream;

    private ErrorPrinter() {
        this.printStream = new PrintStream(System.err);
    }

    void print(String errorMessage) {
        printStream.println(errorMessage);
    }

    static ErrorPrinter newInstance() {
        return new ErrorPrinter();
    }
}
