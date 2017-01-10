package pl.sda.calculator;

import java.util.Scanner;
import java.util.Stack;

public class RPNUtil {
	
	public static void main(String[] args){
		System.out.println(convertCalculationToRPN("( 2 + 3 * 2 )"));
	}

	public static String convertCalculationToRPN(String calculation) {
		String rpmCalculation = "";
        Stack<String> stack = new Stack<>();

        Scanner tokenizer = new Scanner(calculation);

        String token;
        int tokenPriority;
        while (tokenizer.hasNext()) {
            token = tokenizer.next();
            tokenPriority = getOperatorPriority(token);
            if (token.equals("(")) {
                stack.push(token);
                continue;
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    rpmCalculation = rpmCalculation + stack.pop() + " ";
                }
                stack.pop(); //removes ( from stack
                continue;
            } else if (isOperator(token)) {
                while (!stack.empty()) {
                    if (tokenPriority == 3 || (tokenPriority > getOperatorPriority(stack.peek()))) {
                        stack.push(token);
                        break;
                    } else {
                        rpmCalculation = rpmCalculation + stack.pop() + " ";
                    }
                }
            } else {
                rpmCalculation = rpmCalculation + token + " ";
            }

        }
        return rpmCalculation;

	}
	
	private static boolean isOperator(String token){
		return "()+-*/^".contains(token);
	}

	private static int getOperatorPriority(String operator) {
		switch (operator) {
		case "(":
			return 0;
		case "+":
			return 1;
		case "-":
			return 1;
		case "*":
			return 2;
		case "/":
			return 2;
		case "^":
			return 3;
		default:
			return -1;
		}
	}

}
