package blue;
import java.util.Scanner;

public class Method1 {
    
    public static double calcDiscount(double subTotal){
        double discountPerc;
        if(subTotal>=1000){
            discountPerc = 0.10;
        }else if(subTotal>=500){
            discountPerc = 0.05;
        }else{
            discountPerc = 0.00;
        }
        
        return discountPerc;
    }
    
    public static double change(double subTotal, double amountPaid, 
            double discountPerc){
        double discountAmount = subTotal*discountPerc;
        double totalDue = subTotal - discountAmount;
        return amountPaid - totalDue;
    }
    
    public static double totalDue(double subTotal, double discountPerc){
        double discountAmount = subTotal*discountPerc;
        return subTotal - discountAmount;
    }
    
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        //var
        double subTotal = 0;
        double price;
        boolean buying = true;
        
        //loop
        while(buying){
            System.out.println("Enter the product's price: ");
            price=scan.nextDouble();
            
            if(price<=0){
                break;
            }else{
                subTotal += price;
            }
        }
        
        //Payment
        System.out.println("Enter amount paid: ");
        double amountPaid=scan.nextDouble();
        
        //Call
        double discountPercentage= calcDiscount(subTotal);
        double discount = calcDiscount(subTotal);
        double change = change(subTotal, amountPaid, discountPercentage);
        double total = totalDue(subTotal, discountPercentage);
        
        //Display
        System.out.println("-----SALES TRANSACTION RECORD-----");
        System.out.printf("Discount amount: %.2f%n", discount*subTotal);
        System.out.printf("Total Due: %.2f%n", total);
        System.out.printf("Change: %.2f%n", change);
        
        scan.close();
    }
}
