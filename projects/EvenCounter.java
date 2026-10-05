package pracs;
import java.util.Scanner;

public class EvenCounter{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int evenCount = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Please enter a number: ");
            int num = scan.nextInt();

            if(num % 2 == 0){
                evenCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
    }
}
