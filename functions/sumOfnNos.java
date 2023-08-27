package functions;

import java.util.Scanner;

public class sumOfnNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
        // Write a function that returns the sum of first n natural numbers.
     


    }
       static int sum(int n){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            
              

            }
            return sum;
            
        }

}
