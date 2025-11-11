import java.util.*;
class Anagram{
    public static void main(String[] args){
        String str1="listen";
        String str2="silent";
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagrams");
        }
        else{
            char[] Arr1=str1.toCharArray();
            char[] Arr2=str2.toCharArray();
            Arrays.sort(Arr1);
            Arrays.sort(Arr2);
            if(Arrays.equals(Arr1,Arr2)){
                System.out.println("Strings are Anagrams");
            }
            else{
                System.out.println("Strings are not Anagrams");
            }
        }
    }
}