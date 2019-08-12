package pl.michalak.adam.letteranalyzer.output;

import java.io.PrintStream;

class ConsolePrinter {

    private final PrintStream printStream;

    private ConsolePrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    void print(String message) {
        this.printStream.print(message);
    }

    void println(String message) {
        this.printStream.println(message);
    }

    static ConsolePrinter newInstance() {
        return new ConsolePrinter(new PrintStream(System.out));
    }
}
