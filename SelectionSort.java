import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A= new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            int minind=i;
            for(int j=i+1;j<N;j++){
                if(A[j]<A[minind]){
                    minind=j;
                }
            }
            int temp=A[i];
            A[i]=A[minind];
            A[minind]=temp;
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
        }
    }
}