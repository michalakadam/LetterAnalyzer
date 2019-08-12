package pl.michalak.adam.letteranalyzer.output;

import java.io.PrintStream;

class ErrorPrinter {

    private final PrintStream printStream;

    private ErrorPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    void print(String errorMessage) {
        printStream.println(errorMessage);
    }

    static ErrorPrinter newInstance() {
        return new ErrorPrinter(new PrintStream(System.err));
    }
}
