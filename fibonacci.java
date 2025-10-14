import java.util.*;
import java.io.*;
class Fibonacci{
    static void fib(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
        System.out.print(a+" ");
        b=a+b;
        a=b-a;
    }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        fib(n);
    }
}
