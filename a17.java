
import java.util.Scanner;

public class a17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name ="";

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());
        System.out.println("hello "+name);

        scanner.close();
    }
}




// public class a17{
//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<6);
//     }
// }