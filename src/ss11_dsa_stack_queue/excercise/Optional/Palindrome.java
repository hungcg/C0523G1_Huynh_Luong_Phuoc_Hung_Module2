package ss11_dsa_stack_queue.excercise.Optional;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stackString = new Stack<>();
        Queue<Character> queueString = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string you wanna check Palindrome");
        String string = scanner.nextLine();
        boolean flag = true;

        for (int i = 0; i < string.length(); ++i) {
            stackString.push(string.charAt(i));
            queueString.add(string.charAt(i));
        }
        for (int i = 0; i < string.length(); ++i) {
            if (stackString.pop() != queueString.poll()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("this String iz Palindrome");
        } else {
            System.out.println("this String iz not Palindrome");
        }
    }
}

