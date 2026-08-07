import java.util.Scanner;

public class learn2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("age is: "+ age);

        System.out.println("Enter your height:");
        float height = scan.nextFloat();
        System.out.println("height is : " + height);
        
        // scan.nextLine();
        System.out.println("enter the name : ");
        String name = scan.nextLine();
        System.out.println("name is : " + name);

    }
}