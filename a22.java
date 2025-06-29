//2d array

public class a22 {
    public static void main(String[] args) {
        String[][] bikes = {{"pulsar","honda"},{"splendor","hero"}};

        for(int i = 0; i<bikes.length; i++){
            System.out.println();
            for(int j=0; j<bikes[i].length; j++){
                System.out.print(bikes[i][j]+" ");
            }
        }


        String[][] fruits = new String[2][2];

        fruits[0][0] = "mango";
        fruits[0][1] = "apple";
        fruits [1][0] = "banana";
        fruits [1][1] = "meth";

        for(int i = 0; i< fruits.length; i++){
            System.out.println();
            for(int j =0; j<fruits[i].length; j++){
                System.out.print(fruits[i][j]+" ");
            }
        }
    }
}
