package pl.michalak.adam.letteranalyzer.input;

/**
 * Gathers and validates user input.
 * @author Adam Michalak
 */
public interface InputAPI {

    /**
     * Enables user to provide String answer for an inquiry.
     * @return user input as a String.
     */
    String collectStringInputFromUser();

    /**
     * Closes Scanner to prevent Resource Leak
     */
    void closeScanner();
}
