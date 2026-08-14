public class Student1{
    String name;
    int age;
    double height;
    Student1()
    {
        name="anu";
        age=17;
        height=5.0;

    }
    Student1(String name){
        this.name=name;
    }
    Student1(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

}