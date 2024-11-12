// Input: str = “2 3 1 * + 9 -“
// Output: -4
// Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.


// Input: str = “100 200 + 2 / 5 * 7 +”
// Output: 757
import java.util.*;

public class Main2 {
    public static void main(String args[]) {
        String str = "2 3 1 * + 9 -";
        String[] tokens = str.split(" ");  // Split the string into tokens
        Stack<Integer> st = new Stack<>();  // Stack to store operands
        
        // Loop through each token
        for (String token : tokens) {
            if (isNumber(token)) {  // Check if the token is a number
                st.push(Integer.parseInt(token));  // Push the number onto the stack
            } else {  // If the token is an operator
                int number2 = st.pop();  // Pop the second operand
                int number1 = st.pop();  // Pop the first operand
                
                int result = 0;
                switch (token) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }
                st.push(result);  // Push the result back onto the stack
            }
        }
        
        // The final result should be the only element left in the stack
        System.out.println(st.pop());
    }

    // Helper method to check if a string is a number
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);  // Try to parse the string as an integer
            return true;
        } catch (NumberFormatException e) {
            return false;  // Return false if it can't be parsed
        }
    }
}
