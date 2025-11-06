import math.add.Addition;
import math.multiply.Multiplication;

public class TestCalculator {

    public static void main(String[] args) {
        
        // 1. Create an object from the 'Addition' class
        Addition adder = new Addition();
        
        // 2. Create an object from the 'Multiplication' class
        Multiplication multiplier = new Multiplication();
        
        // 3. Use the functions from the imported packages
        int num1 = 10;
        int num2 = 5;
        
        int sumResult = adder.sum(num1, num2);
        int multiplyResult = multiplier.multiply(num1, num2);
        
        System.out.println("Starting the calculator...");
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sumResult);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multiplyResult);
        System.out.println("Calculation complete.");
    }
}