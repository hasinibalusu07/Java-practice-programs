import java.io.*;
import java.util.*;
class Factorial{
    public static int Fact(int N){
        if(N==0||N==1){
            return 1;
        }
        return Fact(N-1)*N;
        
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int fact=Fact(N);
        System.out.println(fact);
    }
}