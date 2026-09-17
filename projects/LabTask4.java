import java.util.Scanner;

public class LabTask4 {
    public static double speedCalc(double time, double distance){
        return distance/time;
    }
    
    public static void main (String []args){
    
        Scanner scan = new Scanner(System.in);
        //vars
        System.out.printf("Enter your travel time: ");
        double time = scan.nextDouble();
        
        System.out.printf("Enter your travel distance (Kilometers): ");
        double distance = scan.nextDouble();
        
        //calc
        double speed = speedCalc(time, distance);
        
        //display
        System.out.println("===== TRAVEL INFORMATION =====");
        System.out.printf(" Travel Distance: " 
                + distance + " Km" +"\n Travel Time: " + time + " hours" + 
                        "\n Speed: %.1f km/h %n", speed
            );
        
        scan.close();
    }
}
