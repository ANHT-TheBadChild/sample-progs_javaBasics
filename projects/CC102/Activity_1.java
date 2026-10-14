import java.util.Scanner;
public class Activity_1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int size;
        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();
        int num[] = new int[size];
        
        System.out.print("The size of the array is: " + size + "\n");
        
        //value assignment
        System.out.println("Enter the value of the elements: ");
        for(int x = 0; x<num.length;x++){
            num[x] = scan.nextInt();
        }
        
        //value printing
        for(int y = 0;y<num.length;y++){
            System.out.println("Value of INDEX["+y+"]: " + num[y]);
        }
        
        //Search Function
        System.out.print("Search for a number: \t");
        int search=scan.nextInt();
        
        boolean found =false;
        
        for(int s = 0; s<num.length;s++){
            
            if(search==num[s]){
                System.out.println("Location: INDEX["+s+"]");
                found = true;
            }
        }    
        if(!found){
            System.out.println("Item Not Found");
        }
        
        //Duplicate searcher
        boolean foundDuplicate=false;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j] && i!=j){
                    System.out.println("INDEX["+i+"] is duplicated in INDEX["+j+"]");
                    foundDuplicate=true;
                }
            }
        }
        
        if(!foundDuplicate){
            System.out.println("No duplicates found");
        }
        
        scan.close();
    }
}
