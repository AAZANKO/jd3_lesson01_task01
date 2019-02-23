package by.htp.zanko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceNumberRegular {


    public String getNumberPhoneRegular(int[] enterNumber) {

        StringBuffer sb = new StringBuffer();

        String stringResult;  // а чего он подчеркивает !?
        stringResult = "";

        for (int i = 0; i < enterNumber.length; i++) {
            sb.insert(i, enterNumber[i]);
        }

        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{3})(\\d{4})$");
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()) {
            stringResult = "(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3);

        }
        return stringResult;
    }

}
