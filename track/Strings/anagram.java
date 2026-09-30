
import java.util.Arrays;
import java.util.Scanner;
public class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 and String 2 :");
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram...");
            return;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);
        if(sorted1.equalsIgnoreCase(sorted2)){
            System.out.println("It is an anagram...");
        }else{
            System.out.println("It is not an anagram...");
        }



    }
}