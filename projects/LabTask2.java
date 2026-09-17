import java.util.Scanner;


public class LabTask2 {
    public static int totalScore(int prelim, int midterm, int finals){
        return  prelim + midterm + finals;
    }
    
    public static double average(int prelim, int midterm, int finals){
        return  (prelim + midterm + finals)/3.0;
    }
    
    
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Enter Prelim Score: ");
        int prelim=scan.nextInt();
        
        System.out.printf("Enter Midterm Score: ");
        int midterm=scan.nextInt();
        
        System.out.printf("Enter Finals Score: ");
        int finals=scan.nextInt();
        
        System.out.println("-----Student Grade Result-----");
        //results
        System.out.println("---Test Scores---");
        System.out.println( "Prelim: " + prelim + "\n "
                + "Midterm: " + midterm + "\n Finals: " + finals);
        
        //calc
        int total = totalScore(prelim, midterm, finals);
        double ave = average(prelim, midterm, finals);
        
        System.out.println(" ");
        System.out.println("Total Score: " + total);
        System.out.printf("Overall Average : %.2f%n", ave);
        
        scan.close();
    }
}
