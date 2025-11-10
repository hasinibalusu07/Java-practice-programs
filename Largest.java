import java.io.*;
import java.util.*;
class Largest{
    public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          int N=s.nextInt();
          int Largest1=Integer.MIN_VALUE;
          int Largest2=Integer.MIN_VALUE;
          int[] A=new int[N];
          for(int i=0;i<N;i++){
            A[i]=s.nextInt();
          }
          for(int i=0;i<N;i++){
            if(A[i]>Largest1){
                Largest2=Largest1;
                Largest1=A[i];
            }
            else if(A[i]!=Largest1&&A[i]>Largest2){
                      Largest2=A[i];
            }
          }
         System.out.println("First Largest is"+Largest1);
         System.out.println("Second Largest is"+Largest2);
    }
}