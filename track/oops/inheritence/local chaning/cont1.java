class parent{
    parent(){
        System.out.println("inside parent");
    }
}
class child extends parent{
    child(){
        this(10);
        System.out.println("inside child 1");

    }
    child(int a){
        this(10,20);
        System.out.println("inside child 2");

    }
    child(int a,int b){
        System.out.println("inside child 3");

    }

}

class cont1{
    public static void main(String[] args) {
        child c1 = new child();
    }
}