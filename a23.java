import java.util.ArrayList;

public class a23 {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("dal");
        food.add("bhat");
        food.add("tarkari");
        food.add("achar");
        // if we use food.clear() all arraylist will be cleared
        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("yamaha");
        bikes.add("pulsar");
        bikes.add("duke");
        bikes.add("harley");
        bikes.add("davidson");

        bikes.set(2,"bullet");
        bikes.remove(3);

        for(int i = 0; i<bikes.size(); i++){
            System.out.println(bikes.get(i));
        }
    }
}
