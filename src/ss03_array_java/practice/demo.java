package ss03_array_java.practice;
public class demo {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print(i - 1);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 2; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print(i - 1);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}






