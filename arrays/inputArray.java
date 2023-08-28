import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter Element"+ " " +i+ "-->");
            arr[i]=scan.nextInt();
        }
            System.out.println("Your Array");
          for(int i =0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
    
        scan.close();
    }
    
}
