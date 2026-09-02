
import java.util.Scanner;

class zerosmoving{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}