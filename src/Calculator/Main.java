package Calculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Введите арифметическое выражение (например , '1 + 2'): ");

String input = scanner.nextLine();
String result = calc(input);
System.out.println("Output: " + result);

scanner.close();
    }
    public static String calc(String input){

        String[] tokens = input.split(" ");

        if (tokens.length != 3){
            throw new  RuntimeException("invalid input format");

        }

        String firstOperandStr = tokens[0];
        String operator = tokens[1];
        String secondOperandStr = tokens[2];

        int a = Integer.parseInt(firstOperandStr);
        int b = Integer.parseInt(secondOperandStr);

        if ( (a < 1 || a > 10) || (b < 1 || b > 10)){

            throw new  RuntimeException("Number mast be between 1 and 10");
        }

        int result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
                case "-":
                    result = a - b;
                    break;
            case "*":
                result = a * b;
                break;
            case "/":

                result = a / b;
                break;
            default:
                throw new  RuntimeException("Unsupported operation: " + operator);


        }
        return String.valueOf(result);
    }
}
