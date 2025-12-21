import java.util.*;
import java.io.*;
class StrongNumber{
    public static int fact(int N){
        if(N==0||N==1){
            return 1;
        }
        return N*fact(N-1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int original=N;
        int sum=0;
        while(N>0){
            int digit= N%10;
            sum+=fact(digit);
            N=N/10;
        }
        if(sum==original){
            System.out.println("Is a Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}