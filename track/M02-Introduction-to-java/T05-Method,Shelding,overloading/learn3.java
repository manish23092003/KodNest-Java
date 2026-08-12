class A{
    void m(String a, String b){
        System.out.println("first");
    }
    void m(A a,A b){
        System.out.println("Second");
    }
}
public class learn3{
    public static void main(String[] args) {
        A one = new A();
        one.m(null,null);
    }
}