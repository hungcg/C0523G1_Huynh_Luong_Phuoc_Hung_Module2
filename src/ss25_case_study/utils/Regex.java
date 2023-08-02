package ss25_case_study.utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_EID = "^NV-[0-9]{4}$";
    private static final String REGEX_CID = "^KH-[0-9]{4}$";
    private static final String REGEX_NAME = "^([A-Z]{1}[a-z]+\\s)+$";
    private static final String REGEX_IDENTIFY = "^[0-9]{9}$|^[0-9]{12}$";
    private static final String REGEX_PHONE_NUMBER = "^0[0-9]{9}$";

    public static boolean employeeIdCheck(String id) {
        boolean check;
        check = id.matches(REGEX_EID);
        if (!check) {
            System.out.println("Id format iz : NV-YYYY (YYYY = 0-9)");
            System.out.println("Input Id again!");
        }
        return !check;
    }

    public static boolean customerIdCheck(String id) {
        boolean check;
        check = id.matches(REGEX_CID);
        if (!check) {
            System.out.println("Id format iz : KH-YYYY (YYYY = 0-9)");
            System.out.println("Input Id again!");
        }
        return !check;
    }

    public static boolean phoneNumberCheck(String phoneNumber) {
        boolean check;
        check = phoneNumber.matches(REGEX_PHONE_NUMBER);
        if (!check) {
            System.out.println("phone number must be start 0 and 10 number");
            System.out.println("Input Phone number again!");
        }
        return !check;
    }

    public static boolean indentifyCheck(String indentify) {
        boolean check;
        check = indentify.matches(REGEX_IDENTIFY);
        if (!check) {
            System.out.println("Indentify number must be 9-12 number");
            System.out.println("Input Identify number again!");
        }
        return !check;
    }
}

