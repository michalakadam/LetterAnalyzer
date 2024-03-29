package pl.michalak.adam.letteranalyzer.output;

/**
 * Provides methods for displaying information to the user.
 * @author Adam Michalak
 */
public interface OutputAPI {

    /**
    * Prints provided message in the console with no new line following.
    * @param message printed on the screen
    */
    void print(String message);

    /**
    * Prints provided message in the console and jumps to the next line.
    * @param message printed on the screen
    */
    void println(String message);

    /**
    * Prints provided error message in the console in red color.
    * @param errorMessage printed on the screen
    */
    void printErr(String errorMessage);
}
