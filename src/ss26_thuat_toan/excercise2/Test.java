package ss26_thuat_toan.excercise2;

public class Test {
    public static void main(String[] args) {
        String str = "aabcc";
        String str2 = "adcaa";
        System.out.println("Output 1 = " + Excercise2.string(str, str2));
        String str3 = "Abcdef";
        String str4 = "Adghjklbc";
        System.out.println("Output 2 = " + Excercise2.string(str3, str4));
        String str5 = "Abcdef1234";
        String str6 = "Uykhldg1";
        System.out.println("Output 3 = " + Excercise2.string(str5, str6));
        String str7 = "A";
        String str8 = "BCd";
        System.out.println("Output 4 = " + Excercise2.string(str7, str8));

    }
}
