import java.io.*;
import java.util.*;
class Primecheck{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        boolean Isprime=true;
        if(N<=1){
            Isprime=false;
        }
        else{
      for(int i=2;i<=Math.sqrt(N);i++){      
        if(N%i==0){
            Isprime=false;
            break;
        }
        }
        }
        if(Isprime){
            System.out.println("Is prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}