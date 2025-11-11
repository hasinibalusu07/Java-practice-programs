import java.io.*;
import java.util.*;
class BubbleSort{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A= new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
        }
    }
}