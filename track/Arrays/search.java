import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<=size-1; i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        boolean found = false;
        for(int i=0; i<=size-1; i++){
            if(arr[i]==target){
                System.out.println("Found");
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Not Found");
        }
        System.out.print("Reverse order: ");
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}