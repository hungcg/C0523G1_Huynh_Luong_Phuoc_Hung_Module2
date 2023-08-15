package mvc_practice.car.util;

public class Regex {
    private final static String REGEX_ID = "^[0-9]{3}$";

    public static boolean idRegex(String id) {
        boolean check;
        check = id.matches(REGEX_ID);
        if (!check) {
            System.out.println("wrong format,try again with 3 number");
        }
        return check;
    }
}
