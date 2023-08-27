package functions;

import java.util.Scanner;

//Given a range of numbers. Print all the prime palindrome between that range?
//example 1: 
    // 10 - 1000
    // 11, 101, 131


public class primeAndPalindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lower bound: ");
    int m = sc.nextInt();
    System.out.println("Enter upper bound: ");
    int n = sc.nextInt();

    for(int i = m ; i<=n ;i++ ){
        if(isPrime(i) && isPalindrome(i)){
            System.out.print(i + " ");
        }
    }
    
    sc.close();
    }

    public static boolean isPrime(int n) {
        
        for(int i=2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }


        return true;
    }


    public static boolean isPalindrome(int n) {
        int reverseNumber = 0;
        int temp = n;
        while(temp > 0){
            int lastDigit = temp %10;
            reverseNumber = reverseNumber*10 + lastDigit;
            temp /= 10;
        }

        return reverseNumber == n;

    }



}
