import java.util.Scanner;


public class a16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.printf("Enter your name: ");
            scanner.nextLine();
        }
        System.out.println("hello "+name);

   scanner.close();
    }
}




// public class a16{
//     public static void main(String[] args){
//         int i = 0;
//         while (i<=5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }