import java.util.Scanner;

public class fibonumber {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of term");
        int n= sc.nextInt();

        int count=2;

        while( count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }

        System.out.println(b);       
    }
}