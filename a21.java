//1d array
public class a21 {
    public static void main(String[] args){
        String[] fruits = {"apple","mango","guava","orange"};
        fruits[2] = "peach";
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        String[] veggies = new String[3];

        veggies[0] = "brinjal";
        veggies[1] = "pea";
        veggies[2] = "potato";
        System.out.println(veggies[2]);


        String[] cars = new String[3];
        cars[0] = "maruti";
        cars[1] = "suzuki";
        cars[2] = "tesla";

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
