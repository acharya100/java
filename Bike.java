public class Bike {

    String name = "honda";
    int year = 2025;
    double price = 12000.50;
    boolean isRunning = false;

    void start(){
        System.out.println("you are starting the "+ name);
        isRunning = true;  
    }

    void brake(){
        System.out.println(name+" which is of Rs." + price +" is on brake");
        year = 2026;
    }
}
