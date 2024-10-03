import java.util.Stack;

class PostfixExpresssion {
    
    public static int evaluatePostfix(String expression) {
        
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
          
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
               
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Invalid operator: " + token);
                        return -1;
                }
            }
        }

        
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String args[]){
        String expression1 = "5 3 + 2 *";
        int result1 = evaluatePostfix(expression1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + expression1);
        System.out.println("Output: " + result1);
        System.out.println();

        String expression2 = "4 5 * 6 /";
        int result2 = evaluatePostfix(expression2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + expression2);
        System.out.println("Output: " + result2);
    }
}
