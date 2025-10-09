import java.io.*;
import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int N=s.nextInt();
        int ori=N;
        int rev=0;
        while(N>0){
            int rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        if(ori==rev){
            System.out.println("N is a palindrome");
        }
        else{
            System.out.println("N is not a palindrome");
        }
    }
}