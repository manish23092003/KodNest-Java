
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("runing");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class learn1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 15;
        s1.name = "Manish";
        s1.height = 5.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
        Student s2 = new Student();
        s2.roll = 17;
        s2.name = "Modi";
        s2.height = 5.8;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s1.run();
        s1.sleep();
    }
}
