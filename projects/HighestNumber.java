import java.util.Scanner;

public class examPrac {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int arrayLength=0;
        System.out.print("How many numbers do you want to enter? ");
        arrayLength=scan.nextInt();
        int[] numbers = new int[arrayLength];
        int highest=0;
        
        for(int i =0;i<numbers.length;i++){
            System.out.println("Please enter a number: ");
            numbers[i]=scan.nextInt();
            if(numbers[i]>highest){
                highest = numbers[i];
            }
        }
        System.out.println("The highest number is: " + highest);
    }
}


