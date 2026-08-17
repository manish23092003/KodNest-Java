
import java.util.Scanner;

public class learn2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int a[] = new int[5];
            System.out.println("enter array elements: ");
            for(int i=0;i<a.length;i++){
                a[i]=scan.nextInt();
            }
            System.out.println("Array elements are: ");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        
    }
}