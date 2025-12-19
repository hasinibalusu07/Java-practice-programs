import java.util.*;
class PerfectNumber{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for(int i=1;i<=N/2;i++){
              if(N%i==0){
                 sum+=i;
            }
        }
        if(sum==N&&N!=0){
            System.out.println("Is a Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}