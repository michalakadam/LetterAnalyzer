package pl.michalak.adam.letteranalyzer.input;

class InputValidator {

    private final int MAX_LENGTH = 1000;

    private InputValidator() {}

    boolean validate(String userInput) throws IllegalArgumentException {
        // TODO: 07.08.2019 add regex validating only English and Polish letters, number, standard special characters
        if(userInput.length() == 0)
            throw new IllegalArgumentException("Empty String cannot be processed");
        if(userInput.length() > MAX_LENGTH)
            throw new IllegalArgumentException("Text longer than " + MAX_LENGTH + " words cannot be processed");
        return true;
    }

    static InputValidator newInstance() {
        return new InputValidator();
    }
}
