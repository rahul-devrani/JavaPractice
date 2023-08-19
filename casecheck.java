import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING");
        char ch = sc.next().trim().charAt(0);
        // sc.next is adding
        // .trim() is trimmimg string into words
        // .charAt(0) is giving 0th char of 1st word 
        if(ch>'a' && ch<'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
        

    }
}