
import java.util.Scanner;

public class CalculatorMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans=0;
        while(true){
            System.out.println("Enter Operator");
            char op=sc.next().trim().charAt(0);
                System.out.println(op);
            if (op=='+' || op=='-'|| op=='*' || op=='/'|| op=='%'){
                System.out.println("Enter 1st Number");
                int num1=sc.nextInt();
                System.out.println("Enter 2nd Number");
                int num2=sc.nextInt();

                if(op=='+'){
                    ans=num1+num2;
;                }
                else if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='*'){
                    ans=num1*num2;
                }
                else if(op=='/'){
                    if (num2 != 0){
                    ans=num1/num2;
                    }
                }
                else if(op=='%'){
                    ans=num1%num2;
                }

                System.out.println("Answer --> " + ans);
            }
            else if (op=='x'|| op=='X'){
                break;
            }          
            else {
                System.out.println("Invalid Operator");
            }
        }
    }

    
}
