package pl.michalak.adam.letteranalyzer.input;

/**
 * Implementation of API providing methods for gathering input from the user.
 */
public class InputProvider implements InputAPI {

    private final KeyboardWrapper keyboardWrapper;
    private final InputValidator inputValidator;

    private InputProvider(){
        this.keyboardWrapper = KeyboardWrapper.newInstance();
        this.inputValidator = InputValidator.newInstance();
    }

    @Override
    public String collectStringInputFromUser() throws IllegalArgumentException {
        String userInput = this.keyboardWrapper.get();
        this.inputValidator.validate(userInput);
        return userInput;
    }

    /**
     * Factory method instantiating new immutable InputProvider object.
     * @return InputProvider
     */
     public static InputProvider newInstance() {
        return new InputProvider();
     }

}
