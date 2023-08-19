import java.util.Scanner;

public class greatestnum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ent 1st num");
        int a = sc.nextInt()
        
        
        ;
        System.out.println("ent 2nd num");
        int b = sc.nextInt();


         System.out.println("ent 3rd num");
        int c = sc.nextInt();

        sc.close();

//         int max =a;
//         if (b>max){
//             max=b;
//         }
//         if (c>max){
//             max=c;
//         }
//         System.out.println("max :"+max);

    // You can also use 
    // Math.max(a,b);

    int max = Math.max(c,Math.max(a,b));
    
    System.out.println("max no. is "+ max);


    }
    
 }


