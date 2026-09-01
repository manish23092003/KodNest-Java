
import java.util.Scanner;

public class adding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 30, 50, 70};
        int b[] = new int[a.length + 1];
        int newele = 60;
        for (int i = 0; i < a.length+1; i++) {
            if (i > 2) {
                b[i + 1] = a[i];
            } else if (i == 2) {
                b[i + 1] = a[i];
                b[i] = newele;
            } else {
                b[i] = a[i];
            }
        }
        for(int i=0;i<b.length-1;i++){
        System.out.println(b[i]);
        }
    }
}
