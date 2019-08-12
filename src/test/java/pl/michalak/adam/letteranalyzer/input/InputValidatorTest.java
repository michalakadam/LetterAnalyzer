package pl.michalak.adam.letteranalyzer.input;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InputValidatorTest {

    private InputValidator inputValidator;

    @BeforeMethod
    public void setUp() {
        this.inputValidator = InputValidator.newInstance();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenInputIsEmptyString() {
        //arrange
        boolean expected;
        String ofLengthZero = "";
        //act
        this.inputValidator.validate(ofLengthZero);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenTextLengthIsBiggerThanThousand() {
        //arrange
        boolean expected;
        String ofLengthBiggerThanThousand =
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.\n" +
                "This sentence is above 100th word";
        //act
        this.inputValidator.validate(ofLengthBiggerThanThousand);
    }

    @DataProvider(name = "textProvider")
    public Object[] textProviderFeed() {
        return new Object[] {
                "ala ma kota, kot koduje w Javie kota",
                "a",
                "zażółć gęślą jaźń",
                "1!2@3#4$5%6^7&8*9(0)-_=+[{]}|:;',.?",
                "\"",
                "\\",
        };
    }

    @Test(dataProvider = "textProvider")
    public void shouldReturnTrueWhenTextLengthIsBiggerThanZeroAndSmallerThanThousand(String text) {
        //arrange
        boolean expected, actual;
        //act
        expected = true;
        actual = this.inputValidator.validate(text);
        //assert
        assertEquals(actual, expected);
    }

}
