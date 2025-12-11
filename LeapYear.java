import java.util.*;
class LeapYear{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int Year=s.nextInt();
        if((Year%400==0)||(Year%4==0&&Year%100!=0)){
            System.out.println("Is a Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}