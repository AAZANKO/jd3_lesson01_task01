package by.htp.zanko;

public class EnterNumberPhone {

    private String phoneNumber;

    public String getPhoneNumber(int[] enterNumber) {

//        String phoneNumber; // или здесь, многопоточность !?

        phoneNumber = "(";

        for (int i = 0; i < enterNumber.length; i++) {
            if (i == 3) {
                phoneNumber = phoneNumber + ")";
            }
            if (i == 6) {
                phoneNumber = phoneNumber + "-";
            }
            phoneNumber = phoneNumber + enterNumber[i];
        }

        return phoneNumber;
    }

}
