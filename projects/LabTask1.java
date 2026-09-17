import java.util.Scanner;

public class LabTask1 {
    
    public static int sum(int a, int b){
        return a + b;
    }
    
    public static int difference(int a, int b){
        return a - b;
    }
    
    public static int product(int a, int b){
        return a * b;
    }
    
    public static double quotient(int a, int b){
        return a / b;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //A
        System.out.printf("Please enter the first number: ");
        int a=scan.nextInt();
        
        //B
        System.out.printf("Please enter the second number: ");
        int b=scan.nextInt();
        
        int sums = sum(a, b);
        int diff = difference(a, b);
        int prod = product(a, b);
        double quo = quotient(a, b);
        
        System.out.println(" ");
        System.out.println("-----THE RESULTS-----");
        
        System.out.println("Sum: " + sums);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quo);
        
        scan.close();
    }    
}
