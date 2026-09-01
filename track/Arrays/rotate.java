public class rotate{
    public static void main(String[] args) {
        int arr[] = {12,23,34,45};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}