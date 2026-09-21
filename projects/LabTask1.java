import java.util.Scanner;

public class LabTask1 {
    
    public static int addition(int a, int b){
        return a + b;
    }
    
    public static int subtraction(int a, int b){
        return a - b;
    }
    
    public static int multiplication(int a, int b){
        return a * b;
    }
    
    public static double division(int a, int b){
        return (double)a / b;
    }
    
    public static int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //A
        System.out.printf("Please enter the first number: ");
        int a=scan.nextInt();
        
        //B
        System.out.printf("Please enter the second number: ");
        int b=scan.nextInt();
        
        int sum = addition(a, b);
        int difference = subtraction(a, b);
        int product = multiplication(a, b);
        double quotient = division(a, b);
        int remainder = modulo(a, b);
        
        System.out.println(" ");
        System.out.println("-----THE RESULTS-----");
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.printf("Quotient: %.2f%n", quotient);
        System.out.println("Remainder: " + remainder);
        scan.close();
    }    
}
