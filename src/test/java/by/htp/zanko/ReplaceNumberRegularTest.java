package by.htp.zanko;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceNumberRegularTest {

    @Test
    public void checkReplaceNumberRegular(){

        int[] enterNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        EnterNumberPhone enterNumberPhone = new EnterNumberPhone();

        String number = enterNumberPhone.getPhoneNumber(enterNumber);

        System.out.println(number);

    }

}