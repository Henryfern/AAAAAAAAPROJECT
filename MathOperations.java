public class MathOperations {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide two numbers and an operation (add, subtract, multiply, divide)");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operation = args[2].toLowerCase();

        double result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Use add, subtract, multiply, or divide.");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
