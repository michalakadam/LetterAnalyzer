package pl.michalak.adam.letteranalyzer.input;

/**
 * Implementation of API providing methods for gathering input from the user.
 * @author Adam Michalak
 */
public class InputProvider implements InputAPI {

    private final KeyboardWrapper keyboardWrapper;
    private final InputValidator inputValidator;

    private InputProvider(KeyboardWrapper keyboardWrapper, InputValidator inputValidator){
        this.keyboardWrapper = keyboardWrapper;
        this.inputValidator = inputValidator;
    }

    @Override
    public String collectStringInputFromUser() throws IllegalArgumentException {
        String userInput = this.keyboardWrapper.get();
        this.inputValidator.validate(userInput);
        return userInput;
    }

    @Override
    public void closeScanner() {
        this.keyboardWrapper.close();
    }

    /**
     * Factory method instantiating new immutable InputProvider object.
     * @return InputProvider
     */
     public static InputProvider newInstance() {
        return new InputProvider(KeyboardWrapper.newInstance(), InputValidator.newInstance());
     }

}
