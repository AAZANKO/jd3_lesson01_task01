package by.htp.zanko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneValidation {

    public boolean getValidValue(String string){

        Pattern pattern = Pattern.compile("^\\(\\d{3}\\)\\d{3}\\-\\d{4}$");
        Matcher matcher = pattern.matcher(string);

        return matcher.matches();
    }

}
