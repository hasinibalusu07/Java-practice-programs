import java.util.Scanner;
class MadLibs{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String adjective1;
        String noun;
        String verb;
        String adjective2;
        String adverb;
        System.out.print("Enter Adjective: ");
        adjective1=s.nextLine();
        System.out.print("Enter Noun(Animal Or Person):");
        noun=s.nextLine();
        System.out.print("Enter Adjective: ");
        adjective2=s.nextLine();
        System.out.print("Enter verb with -ing(Action):");
        verb=s.nextLine();
        System.out.print("Enter Adverb: ");
        adverb=s.nextLine();
        System.out.println("My Name is "+noun);
        System.out.println("Today I am So "+adjective1);
        System.out.println("My Journey of "+verb+" Java is "+adjective2);
        System.out.println("I will work "+adverb+" and i will be a constant learner");
    }
}