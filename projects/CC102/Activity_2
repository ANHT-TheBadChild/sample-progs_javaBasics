import java.util.Scanner;
public class Activity_2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of Rows: ");
        int rows=scan.nextInt();
        System.out.print("Enter the number of Columns: ");
        int columns=scan.nextInt();
        
        int num[][] = new int[rows][columns];
        
        System.out.println("Please enter the values:");
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                num[r][c]=scan.nextInt();
            }
        }
        
        //printing values
        System.out.println("Index Values: ");
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.println("Value of INDEX["+r+"]["+c+"]: " + num[r][c]);
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        
        //Printing the matrix
        System.out.println("Matrix: ");
        for(int r=0;r<rows;r++){
            int rowSum=0;
            for(int c=0;c<columns;c++){
                System.out.print(num[r][c] + "\t");
                rowSum+=num[r][c];
            }
            
            System.out.println("= \t" + rowSum);
        }
        
        System.out.println("------------------");
        
        for(int c=0;c<columns;c++){
            int sumColumn=0;
            for(int r=0;r<rows;r++){
                sumColumn+=num[r][c];
            }
            
            System.out.print(sumColumn + "\t");
        }
        
      
        System.out.println();
        
        //Search Function
        System.out.print("Search for a Number: \t");
        int search=scan.nextInt();
        
        boolean found=false;
        
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                
                if(search==num[r][c]){
                    System.out.println("Location: Index["+r+"]["+c+"]");
                    found=true;
                }
            }
        }
        
        if(!found){
            System.out.println("Item not found");
        }
        
        
        System.out.println();
        
        //Duplicate searcher
        boolean haveDuplicate=false;
        
        for(int r1=0;r1<rows;r1++){
            
            for(int c1=0;c1<columns;c1++){
                
                for(int r2=0;r2<rows;r2++){
                    int startColumn = (r2==r1) ? c1+1 : 0; 
                    
                    for(int c2=startColumn;c2<columns;c2++){
                    
                        if(num[r1][c1]==num[r2][c2]){
                            System.out.println("Index["+r1+"]["+c1+"] is duplicated in Index["+r2+"]["+c2+"]");
                            haveDuplicate=true;
                        }
                    }
                }
            }
        }
        
        if(!haveDuplicate){
            System.out.println("No duplicates found");
        }
        
    }
}
