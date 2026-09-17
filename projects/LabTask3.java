import java.util.Scanner;

public class LabTask3 {
    
    public static String productName(String name){
        return name;
    }

    public static double subTotal(double price,int quantity){
        return price*quantity;
    }
    
    public static double change(double price,int quantity, double paid){
        return paid - (price*quantity);
    }
    

    
    public static void main (String []args){
    
        Scanner scan = new Scanner(System.in);
        
        //var
        System.out.printf("Enter Prodcut Name: ");
        String productName=scan.nextLine();
        
        System.out.printf("Enter Prodcut Price: ");
        double price=scan.nextDouble();
        
        System.out.printf("Enter Quantity: ");
        int quantity=scan.nextInt();
        
        System.out.printf("Enter Amount Paid: ");
        double paid=scan.nextDouble();
        
        //calc
        double subTotal = subTotal(price, quantity);
        double change = change(price, quantity, paid);
        
        
        //Display
        System.out.println(" ");
        
        System.out.println("-----SALES TRANSACTION-----");
        System.out.printf("Product: " + productName + "\nPrice: " + price + 
                "\nQuantity: "+ quantity + "\nSubTotal: " + subTotal + "\n"
                        + "Amount Paid: " + paid + "\nChange: %.2f%n", change);
        
        scan.close();
    }
}