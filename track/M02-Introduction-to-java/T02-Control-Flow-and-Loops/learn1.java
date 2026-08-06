
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        switch (n) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            default -> System.out.println("Invalid");
        }
    }
}
