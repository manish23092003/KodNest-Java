class parent{
    parent(int a){
        System.out.println("parent");
    }
}
class child extends parent{
    child(){
        super(20);
        System.out.println("child");
    }
}




public class cont{
    public static void main(String[] args) {
        child c1 = new child();
        
    }
}