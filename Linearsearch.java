import java.io.*;
import java.util.*;
class Linearsearch{
    public static void linearsearch(int[] A,int K){
        boolean found=false;
        for(int i=0;i<A.length;i++){
          if(A[i]==K){
            found=true;
            System.out.printf("Element found at %d",i);
            break;
          }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        linearsearch(A,K);
    }
}