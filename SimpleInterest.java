import java.util.*;
class SimpleInterest{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float p=s.nextFloat();
        float r=s.nextFloat();
        float t=s.nextFloat();
        float si=p*r*t/100;
        System.out.println(si);
    }
}