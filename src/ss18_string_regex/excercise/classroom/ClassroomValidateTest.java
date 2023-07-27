package ss18_string_regex.excercise.classroom;

import ss18_string_regex.excercise.classroom.ClassroomValidate;

public class ClassroomValidateTest {

    private static ClassroomValidate validate;

    public static final String[] validClassName = new String[]{"C0318G", "C10G121"};
    public static final String[] inValidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        validate = new ClassroomValidate();
        for (String className : validClassName) {
            boolean isValid = validate.validate(className);
            System.out.println("Class Name Is: " + isValid);
        }
        for (String className1 : validClassName) {
            boolean notValid = validate.validate(className1);
            System.out.println("Class Name1 Is: " + notValid);
        }
    }
}


