package ss18_string_regex.excercise.phonenumber;

import ss18_string_regex.excercise.phonenumber.PhoneNumberValidate;

public class PhoneNumberValidateTest {
    public static final String[] validClassName = new String[]{"(84)-(978489648)"};
    public static final String[] inValidClassName = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumberValidate validateNumber = new PhoneNumberValidate();
        for (String className : validClassName) {
            boolean isValid = validateNumber.validate(className);
            System.out.println("Class Number Is: " + isValid);
        }
        for (String className1 : inValidClassName) {
            boolean isValid = validateNumber.validate(className1);
            System.out.println("Class Number1 Is: " + isValid);
        }
    }
}

