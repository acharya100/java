import java.util.Random;

// public class a7 {
//     public static void main(String[] args) {
//     Random random = new Random();

//     double num= random.nextDouble();
//     System.out.println(num);

//     double num2 = random.nextDouble(-100,1);
//     System.out.println(num2);

//     double num3 = random.nextDouble(1,100);
//     System.out.println(num3);
//     }

// }



public class a7{
    public static void main(String[] args){
        Random random = new Random();

        boolean isIdiot = random.nextBoolean();

        if(isIdiot){
            System.out.println("is he an idiot,he is he is,yes he is");
        }else{
            System.out.println("he is not an idiot");
        }
    }
}