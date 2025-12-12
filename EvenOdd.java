import java.util.*;
import java.io.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        if(N%2==0){
            System.out.println("Is Even");
        }
        else{
            System.out.println("Is Odd");
        }
    }
}