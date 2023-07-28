package ss19_string_regex.excercise.phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static final String REGEX = "^\\([0-9]{2}\\)\\-\\([0-9]{10}\\)$";

    public boolean validate(String regrex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regrex);
        return matcher.matches();
    }
}

