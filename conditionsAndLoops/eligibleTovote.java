//Java Program to demonstate the use of if statement.  

import java.util.Scanner;

public class eligibleTovote {  
public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in); 
    System.out.println("Enter Age");
    //defining an 'age' variable  
    //entering age
    int age=sc.nextInt();
    //checking the age  
    if(age>18){  
        System.out.print("Eligible To Vote");  
    }  
    else{ System.out.println("Not Eligible to Vote");}
}  
}  
