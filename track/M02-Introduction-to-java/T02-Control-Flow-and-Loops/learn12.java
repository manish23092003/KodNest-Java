public class learn12{
    public static void main(String[] args) {
        outer: for(int i=1;i<=3;i++){
            inner: for(int j=1;j<=4;j++ ){
                if(j==2){
                    continue outer;
                }
                System.out.println("i value: " + i +"  j value: " + j);
            }
            System.out.println();
        }
    }
}