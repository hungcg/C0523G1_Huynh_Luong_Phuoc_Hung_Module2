package ss11_dsa_stack_queue.excercise.reverse_element;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Stack<Integer> listStack = new Stack<>();
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        Stack<Integer> newListStack = new Stack<>();
        while (!listStack.isEmpty()) {
            newListStack.push(listStack.pop());
        }
        System.out.println(newListStack);
    }
}
