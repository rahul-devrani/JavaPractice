import java.util.Scanner;

public class largestOfAllNos {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner sc = new Scanner(System.in);
        
      int largestNumber = Integer.MIN_VALUE;

        while(true) {
            int n = sc.nextInt();
            if( n == 0 ) break;
            if(n > largestNumber) largestNumber = n;
        }

        System.out.println(largestNumber);


    }
}
