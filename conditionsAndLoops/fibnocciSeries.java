import java.util.Scanner;

public class fibnocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        int temp = n;
        
        while(temp > 0){
            int c = a+b;
            System.out.print(c + " ");
             a = b;
             b = c;
             temp--;
        }



    }
}
