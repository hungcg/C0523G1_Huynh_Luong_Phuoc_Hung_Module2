package ss26_thuat_toan.excercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise4 {
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
}
//            char space = ' ';
//            char word = string.charAt(i);
//            char word2 = string.charAt(i + 1);
//            char upper = string.toUpperCase().charAt(i);
//            char lower = string.toLowerCase().charAt(i);
//            if (word == string.charAt(0)
//                    || word == upper
//                    || word == lower) {
//                word = (char) (space + word);
//                word = lower;
//                newWord.add(String.valueOf(word));
////            } else if (word2 == upper) {
////            }
//            }
//        }
//
//        for (String newString : newWord) {
//            System.out.print(newString);
//        }
//        System.out.println();
//    }
//}





