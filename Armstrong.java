import java.util.*;
import java.io.*;
class Armstrong{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0,temp=N;
        while(N>0){
            int digit=N%10;
            sum=sum+(digit*digit*digit);
            N=N/10;
        }
        if(sum==temp){
        System.out.println("IsArmstrong");
    }
    else{
        System.out.println("NotArmstrong");
    }
    }
}