import java.util.Scanner;

public class frequency{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size =scan.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<=size-1; i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        int freq=0;
        for(int i=0; i<=size-1; i++){
            if(arr[i]==target){
                freq++;
            }
        }
        System.out.println("Frequency of "+target+": "+freq);
    }
}