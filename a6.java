
// public class a6 {
//     public static void main(String[] args) {
//         int age = 55;
//         if (age>=18){
//             System.out.println("you can vote");
//         }else if(age == 0){
//             System.out.println("welcome to the jungle");
//         }
//         else{
//             System.out.println("you are a child");
//         }
//     }
// }



import java.util.Random;

public class a6{
    public static void main(String[] args){
        Random random = new Random();

        int num1 = random.nextInt();
        System.out.println(num1);

        int num2 = random.nextInt(-100,0);
        System.out.println(num2);

        int num3 = random.nextInt(1,100);
        System.out.println(num3);
    }
}
