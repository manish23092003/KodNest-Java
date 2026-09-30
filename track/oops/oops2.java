public class Book{
    private int pagenum;
    public void setData(int x){
        if(x>0){
            pagenum=x;
        }
    } 
    public int getData(){
        return pagenum;
    }
}
public class oops2{
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        System.out.println(b.getData());
    }

}