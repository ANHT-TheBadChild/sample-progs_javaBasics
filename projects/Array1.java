package Blue;
import java.util.Scanner;

public class Array1{
    public static int findHighest(int[] numList){
        int max=numList[0];
        for(int i=0;i<numList.length;i++){
            if(numList[i]>max){
            max = numList[i];
            }
        }
        return max;
    }
    
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];
        
        for(int i=0; i<numbers.length;i++){
            System.out.println("Enter a number please");
            numbers[i]=scan.nextInt();
        }
        
        int biggest = findHighest(numbers);
        System.out.println(biggest);
        
    }
}