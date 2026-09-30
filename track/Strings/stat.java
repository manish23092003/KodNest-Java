class Car{
    static void convert() {
        System.out.println("Converting KM into Miles");
    }

    void calculateMilage(){
        System.out.println("Calculating Mile....");

    }

}



public class stat{
    public static void main(String[] args) {
        Car.convert();
        Car nano = new Car();
        nano.calculateMilage();
        Car bmw = new Car();
        bmw.calculateMilage();
    }
}