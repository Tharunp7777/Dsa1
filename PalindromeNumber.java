package Dsa1;

import java.util.Scanner;


public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");

        int num= sc.nextInt();

        int org_number=num;

        int rev=0;

        while(num!=0){
            rev=rev*10+ num%10;
            num=num/10;
        }

    if(org_number==rev)
    {
        System.out.println(org_number+"Palindrome Number");
    }
    else
    {
        System.out.println(org_number+" not palindromw Number");

    }
    
    }
}