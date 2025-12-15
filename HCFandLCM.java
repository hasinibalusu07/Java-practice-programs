import java.io.*;
import java.util.*;
class HCFandLCM{
    public static int  hcf(int N,int M){
             while(M!=0){
                int temp=M;
                M=N % M;
                N=temp;
             }
             return N;
    }
    public static int lcm(int N,int M){
       
        return (N*M)/hcf(N,M);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int ResultHCF=hcf(N,M);
        System.out.println("HCF:"+ResultHCF);
        int ResultLCM=lcm(N,M);
        System.out.println("LCM:"+ResultLCM);
    }
}