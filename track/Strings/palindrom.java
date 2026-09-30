
import java.util.Scanner;

public class palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        char charArr[] = str.toCharArray();
        char newArr[] = new char[charArr.length];
        int j=charArr.length-1;
        for(int i=0;i<charArr.length;i++){
            newArr[j]=charArr[i];
            j--;
        }
        String revstr=new String(newArr);
        if(str.equalsIgnoreCase(revstr)){
            System.out.println("It is a palindrom..");
        }else{
            System.out.println("IT is not a palindrom");
        }
    }
}