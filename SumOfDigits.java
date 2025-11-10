import java.io.*;
import java.util.*;
class SumOfDigits{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0,temp=N;
        while(N>0){
            int digit=N%10;
            sum=sum+digit;
            N=N/10;
        }
        System.out.println("Sum of Digits of a number:"+sum);
    }
}