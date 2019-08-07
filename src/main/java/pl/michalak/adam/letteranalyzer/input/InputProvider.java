package pl.michalak.adam.letteranalyzer.input;

/**
 * Implementation of API providing methods for gathering input from the user.
 */
public class InputProvider implements InputAPI {

    private InputProvider(){}


    /**
     * Factory method instantiating new immutable InputProvider object.
     * @return InputProvider
     */
     public static InputProvider newInstance() {
        return new InputProvider();
     }
}
