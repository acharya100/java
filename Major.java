public class Major {
    public static void main(String[] args) {
        
        // Car car1 = new Car("ford","black",2023);
        // Car car2 = new Car("maruti","blue",2024);
        // Car car3 = new Car("audi","white",2025);

        // System.out.println(car1.name);
        // System.out.println(car1.color);
        // System.out.println(car1.year);

        // System.out.println(car2.name);
        // System.out.println(car3.color);

       Car[] cars = {new Car("ford","black",2023),
                    new Car("maruti","blue",2024),
                    new Car("audi","white",2025)};

       for(Car car: cars){
        car.drive();
       }
    }
}
