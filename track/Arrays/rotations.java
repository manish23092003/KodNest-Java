
class rotations {

    public static void main(String[] args) {
        int n = 4;
        int a[] = {10, 20, 30, 40, 50};
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int left = 0;
        int right = n;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
