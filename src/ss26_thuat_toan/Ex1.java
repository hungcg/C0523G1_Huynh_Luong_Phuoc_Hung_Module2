package ss26_thuat_toan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {
    public static boolean checkEqualFrequency(int[] arr) {
        List<Integer> newArray = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (!newArray.contains(arr[i])) {
                newArray.add(arr[i]);
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (newArray.get(i) == arr[j]) {
                    count++;
                }
            }
            countList.add(count);

        }
        for (int i = 0; i < countList.size()-1; i++) {
            if (countList.get(i) != countList.get(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }



    private static ArrayList<Character> myTransfer(String s) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result;
    }

    public static int string(String string, String string2) {
        List<Character> newString = myTransfer(string);
        List<Character> newString2 = myTransfer(string2);
        List<Character> newString3 = new ArrayList<>();


        for (int i = 0; i < newString.size(); i++) {
            for (int j = 0; j < newString2.size(); j++) {
                if (newString.get(i) == newString2.get(j)) {
                    newString3.add(newString.get(i));
                    newString2.remove(newString2.get(j));
                    break;
                }
            }
        }

        int result = newString3.size();
        return result;
    }






    public static boolean beautifulArray(int[] array) {
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; ++i) {
            sum2 += array[i];
            if ((sum - array[i]) / 2 == sum2 - array[i]) {
                return true;
            }
        }
        return false;
    }





    public static String amendTheSentence(String string) {
        List<String> newWord = new ArrayList<>();
        String[] str1 = string.split("");
        String str2 = string.toUpperCase();
        String[] str3 = str2.split("");
        String box = "";

        for (int i = 0; i < string.length(); i++) {
            if (str1[i].equals(str3[i])) {
                str1[i] = " " + str1[i];
            }
            newWord.add(str1[i]);
        }
        for (String string1 : newWord) {
            box += string1;
        }
        box = box.replaceAll("[ ]+", " ");
        box = box.toLowerCase();
        System.out.println(box);
        return box;
    }





    public static int[] sortByHeight(int[] array) {
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                newArray.add(array[i]);
                array[i] = 0;
            }
        }
        newArray.sort(Comparator.naturalOrder());
        for (int i = 0; i < newArray.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != -1) {
                    array[j] = newArray.get(i);
                    newArray.remove(newArray.get(i));
                }
            }
        }
        return array;
    }




    public static String findChar(String string) {
        List<Character> newCharacter = new ArrayList<>();
        List<Character> newString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            newString.add(string.charAt(i));
        }
        for (int i = 0; i < newString.size() - 1; i++) {
            for (int j = i + 1; j < newString.size(); j++) {
                if (newString.get(i) == newString.get(j)) {
                    newCharacter.add(newString.get(i));
                    newString.remove(newString.get(i));
                    i--;
                    break;
                }
            }
        }
        Collections.sort(newCharacter);
        return newCharacter.toString();
    }









    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> arary(int[][] array) {
        List<Integer> primeArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray.add(array[i][j]);
            }
        }
        for (int i = 0; i < newArray.size(); i++) {
            if (isPrime(newArray.get(i))) {
                primeArray.add(newArray.get(i));
            }
        }
        for (int i = 0; i < primeArray.size() - 1; i++) {
            for (int j = i + 1; j < primeArray.size(); j++) {
                if (primeArray.get(i).equals(primeArray.get(j))) {
                    primeArray.remove(primeArray.get(i));
                    i--;
                }
            }
        }
        Collections.sort(primeArray);
        return primeArray;
    }
}






