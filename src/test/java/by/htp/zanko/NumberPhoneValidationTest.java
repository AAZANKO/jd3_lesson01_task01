package by.htp.zanko;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPhoneValidationTest {

    @Test
    public void checkNumberPhoneValidation(){

        String number = "(123)456-7890";

        NumberPhoneValidation numberPhoneValidation = new NumberPhoneValidation();

        Boolean valid = numberPhoneValidation.getValidValue(number);

        System.out.println(valid);
    }
}