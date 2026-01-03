import java.io.*;
import java.util.*;
class AverageOfArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A=new int[N];
        int Sum=0;
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
            Sum+=A[i];
        }
        double Average=(double)(Sum/N);
        System.out.printf("%.2f",Average);
    }
}