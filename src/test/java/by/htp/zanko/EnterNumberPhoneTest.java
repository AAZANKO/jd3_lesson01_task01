package by.htp.zanko;

import org.junit.Test;

public class EnterNumberPhoneTest {

    @Test
    public void checkEnterNumberPhone(){

        int[] enterNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        ReplaceNumberRegular replaceNumberRegular = new ReplaceNumberRegular();

        String numberPhoneRegular = replaceNumberRegular.getNumberPhoneRegular(enterNumber);

        System.out.println("numberPhoneRegular= " + numberPhoneRegular);
    }
}