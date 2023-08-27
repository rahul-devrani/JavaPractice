import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 integers");
        int[] arr = new int[5];
        
        // arr[0]=23;
        // arr[1]=45;
        // arr[2]=45;
        // arr[3]=45;
        // arr[4]=45;
        
        // System.out.println(arr[2]);

        //input using loops

        for (int i=1;i<=arr.length;i++){
            arr[i]=sc.nextInt();    
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
        


        
        // System.out.println(Arrays.toString(arr));





        }
    }
    

