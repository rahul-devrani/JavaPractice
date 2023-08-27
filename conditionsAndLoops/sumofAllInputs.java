import java.util.Scanner;

public class sumofAllInputs {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            sum += n;
            
        }

        System.out.println(sum);

    }
}
