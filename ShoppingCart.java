import java.util.Scanner;
class ShoppingCart{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total;
        char currency='$';
        System.out.print("What do you like to buy?:");
        item=s.nextLine();
        System.out.print("What is the prize of item?:");
        price=s.nextDouble();
        System.out.print("How many "+item+"/s do you want?:");
        quantity=s.nextInt();
        total=price*quantity;
        System.out.print("You bought "+quantity+" "+item+"/s");
        System.out.print("\nYour Total Bill:"+currency+""+total);
    }
}