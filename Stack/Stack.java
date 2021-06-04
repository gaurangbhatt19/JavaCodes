package Stack;

import java.util.*;

class StackDemo {

    // Main Method
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack s = new Stack();
        Scanner s1 = new Scanner(System.in);
        String scan = s1.nextLine();
        int flag = 0;
        for (int i = 0; i < scan.length(); i++) {
            if (scan.charAt(i) == '(') {
                stack.push(String.valueOf(scan.charAt(i)));
            } else if (scan.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == String.valueOf('(')) {
                    stack.pop();
                } else {
                    System.out.println("Unbalanced Parenthesis");
                    break;
                }
            }
        }
        if (!stack.isEmpty())
            System.out.println("Unbalanced Parenthesis");
        else
            System.out.println("Balanced Parenthesis");

    }
}
