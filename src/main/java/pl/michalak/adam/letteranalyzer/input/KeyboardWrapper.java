package pl.michalak.adam.letteranalyzer.input;

import java.util.Scanner;
import java.util.function.Supplier;

class KeyboardWrapper implements Supplier<String> {

    private final Scanner keyboard;

    private KeyboardWrapper() {
        this.keyboard = new Scanner(System.in);
    }

    @Override
    public String get() {
        return this.keyboard.nextLine();
    }

    void close() {
        this.keyboard.close();
    }

    static KeyboardWrapper newInstance() {
        return new KeyboardWrapper();
    }
}
