import java.util.Stack;

class InfixToPostfixConverter {

    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(currentChar)) {
                postfix.append(currentChar).append(" ");
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else if (isOperator(currentChar)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(currentChar)) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
                return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infix1 = "A + B * C";
        String postfix1 = infixToPostfix(infix1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + infix1);
        System.out.println("Output: " + postfix1);
        System.out.println();

        String infix2 = "A * B + C / D";
        String postfix2 = infixToPostfix(infix2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + infix2);
        System.out.println("Output: " + postfix2);
    }
}
