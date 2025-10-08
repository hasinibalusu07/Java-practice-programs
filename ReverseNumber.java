import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int N=s.nextInt();
        int rev=0;
        while(N!=0){
            int rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        System.out.println("Rveresed number:"+rev);
        s.close();
    }
}