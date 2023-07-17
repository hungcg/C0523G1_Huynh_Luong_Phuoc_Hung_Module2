package ss11_dsa_stack_queue.excercise.Optional;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        char sym;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the string with character");
        String character = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < character.length(); i++) {
            sym = character.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.empty()) {
                    flag = false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("bracket check Status : Well");
        } else {
            System.out.println("bracket check Status : ???");
        }
    }
}
