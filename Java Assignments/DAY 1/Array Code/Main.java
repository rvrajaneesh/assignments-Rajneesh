import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int count, num, i;
        int[] inputArray = new int[500];   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements");
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
        System.out.println("Enter element to search");
        num = in.nextInt();
        for (i = 0; i < count ; i++) {
            if(num == inputArray[i]){
               System.out.println(num+" is present at index "+i);}
               
            else
            {
               System.out.println(num+ " is not present in the array");
               
               
            
               
            }
        }
        
        
    }
}