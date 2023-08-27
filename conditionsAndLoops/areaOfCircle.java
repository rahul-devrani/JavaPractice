import java.util.Scanner;

public class areaOfCircle {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double r = sc.nextDouble();
     System.out.println("Area of circle -> " +  Math.PI * r*r );
     sc.close();

   } 
}
