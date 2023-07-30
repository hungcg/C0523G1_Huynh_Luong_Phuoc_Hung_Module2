package ss19_string_regex.excercise.classRoom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomValidate {
    private static final String REGEX = "[CAP][0-9]{4}[GHIKLM]";


    public boolean validate(String regrex) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regrex);
        return matcher.matches();
    }
}