import java.util.Scanner;

public class SwitchSe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruit = sc.next();
        
        switch (fruit) {
            case "apple":
                System.out.println("red");
                break;
            case "mango":
                System.out.println("yellow");
                break;
            case "banana":
                System.out.println("long yellow");
                break;
            case "grapes":
                System.out.println("small green");
                break;
        
            default:
                System.out.println("enter correct fruit");
                break;
        }
        
    }
}
