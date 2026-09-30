class demo{
    static int count =0;
    {
        count++;
    }
}
public class sttt{
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
        demo d4 = new demo();
        demo d5 = new demo();
        System.out.println("number of objects: "+demo.count);

    }
}