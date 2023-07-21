package ss14_thuat_toan_sap_xep.exercise;

import java.util.Scanner;

public class IllustrationInsertionSort {
    public IllustrationInsertionSort() {
    }

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; ++i) {
            int x = list[i];
            int pos;
            for (pos = i; pos > 0 && x < list[pos - 1]; --pos) {
                list[pos] = list[pos - 1];
            }
            list[pos] = x;
        }
        System.out.print("The list element sort: ");
        int[] var7 = list;
        int var4 = list.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            int arrs = var7[var5];
            System.out.print(arrs + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        int i;
        for (i = 0; i < list.length; ++i) {
            System.out.println("The element " + i);
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");

        for (i = 0; i < list.length; ++i) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSort(list);
    }
}


