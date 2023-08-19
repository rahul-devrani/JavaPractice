import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp in cels");
        int cels = sc.nextInt();

        float temp= (cels+9/5)+32;
        System.out.println(cels);



        
    }
    
}
