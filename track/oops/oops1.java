public class Book{
    private int pagenum;
    public void setData(int x){
        pagenum = x;
    }
    public void getData(){
        System.out.println(pagenum);
    }
}
public class oops1{
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-100);
        b.getData();
    }
}