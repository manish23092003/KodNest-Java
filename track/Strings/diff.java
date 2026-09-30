class demo1{
    static {
        System.out.println("1st static block");
    }
     static {
        System.out.println("2st static block");
    }
     static {
        System.out.println("3st static block");
    }
    {
        System.out.println("1st Non static block....");
    }
     {
        System.out.println("2nd Non static block....");
    }
     {
        System.out.println("3rd Non static block....");
    }
}
public class diff{
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        demo1 d2 = new demo1();
        demo1 d3 = new demo1();

    }
}