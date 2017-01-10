package pl.sda.calculator;

import java.util.Scanner;
import java.util.Stack;

public class RPNUtil {
	
	public static void main(String[] args){
		String calculation = "( ( 2 + 3 ) * 2 )";
		System.out.println(convertCalculationToRPN(calculation));
		String rpnCalculation = convertCalculationToRPN(calculation);
		System.out.println(calculateRPN(rpnCalculation));
	}
	
	public static Double calculateRPN(String rpnCalculation){
		Scanner scanner = new Scanner(rpnCalculation);
		Stack<Double> stack = new Stack<>();
		
		String token;
		Double v1,v2;
		
		while(scanner.hasNext()){
			token = scanner.next();
			if(!isOperator(token)){
				stack.push(Double.valueOf(token));
			} else {
				v2 = stack.pop();
				v1 = stack.pop();
				stack.push(calculate(v1, v2, token));
				
			}
		}
		
		
		return stack.pop(); //TODO
		
	}
	
	private static Double calculate(Double v1, Double v2, String operator){
		switch(operator){
			case "+" : return v1 + v2;
			case "-" : return v1 - v2;
			case "/" : return v1 / v2;
			case "*" : return v1 * v2;
			case "^" : return Math.pow(v1, v2);
		}
		return null;
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
