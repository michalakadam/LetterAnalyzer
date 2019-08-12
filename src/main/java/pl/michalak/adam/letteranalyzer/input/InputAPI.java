package pl.michalak.adam.letteranalyzer.input;

/**
 * Provides methods for gathering and validation of user's input.
 */
public interface InputAPI {

    /**
     * Enables user to provide String answer for an inquiry.
     * @return user input as a String.
     */
    public String collectStringInputFromUser();

    /**
     * Closes Scanner to prevent Resource Leak
     */
    public void closeScanner();
}
