package ss11_dsa_stack_queue.excercise.reverse_element;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String mWord = "Good Morning";
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.println(wStack);
        String newWord = "";
        for (int i = 0; i < mWord.length(); i++) {
            newWord += wStack.pop();
        }
        System.out.println(newWord);
    }
}