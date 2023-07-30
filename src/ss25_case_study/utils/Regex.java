package ss25_case_study.utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME = "^([A-Z]{1}[a-z]+\\s)+$";
    private static final String REGEX_IDENTIFY = "^[0-9]{9}$|^[0-9]{12}$";
    private static final String REGEX_PHONE_NUMBER = "^0[0-9]{9}$";

    public static String idCheck() {
        boolean check;
        String id;
        do {
            id = scanner.nextLine();
            check = id.matches(REGEX_ID);
            if (!check) {
                System.out.println("Id format iz : NV-YYYY (YYYY = 0-9)");
                System.out.println("Input Id again!");
            }
        } while (!check);
        return id;
    }
    public static String phoneNumberCheck() {
        boolean check;
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
            check = phoneNumber.matches(REGEX_PHONE_NUMBER);
            if (!check) {
                System.out.println("phone number must be start 0 and 10 number");
                System.out.println("Input Phone number again!");
            }
        } while (!check);
        return phoneNumber;
    }

    public static String indentifyCheck() {
        boolean check;
        String identify;
        do {
            identify = scanner.nextLine();
            check = identify.matches(REGEX_IDENTIFY);
            if (!check) {
                System.out.println("Indentify number must be 9-12 number");
                System.out.println("Input Identify number again!");
            }
        } while (!check);
        return identify;
    }
}

