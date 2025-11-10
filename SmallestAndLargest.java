import java.io.*;
import java.util.*;
class SmallestAndLargest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
           A[i]=s.nextInt();
        }
        int smallest=A[0];
        int largest=A[0];
        for(int i=1;i<N;i++){
            if(A[i]>largest){
                largest=A[i];
            }
            if(A[i]<smallest){
                smallest=A[i];
            }
        }
        System.out.println("Largest:"+largest);
        System.out.println("Smallest:"+smallest);
    }
}