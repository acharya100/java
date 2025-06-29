import java.util.Scanner;

public class a5{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        System.out.print("enter if you are elligible or not?: ");
        boolean isElligible = scanner.nextBoolean();        

        //first if-else
        if(name.isEmpty()){
            System.out.println("you havenot entered your name.");
        }else{
            System.out.println("Hello "+name);
        }
        //second if-else
        if(age>=18 && age <= 80){
            System.out.println("You have become adult");
        }
        else if(age > 80 && age <=100){
            System.out.println("you are not elligible grandpa");
        }
        else if(age > 100){
            System.out.println("die old man die");
        }
        else if (age<0){
             System.out.println("you havenot born");   
            }
        else if (age==0){
            System.out.println("you are a new born baby");
        }
        else{
            System.out.println("you are a child");
        }
        //third if-else
        if(isElligible){
            System.out.println("you are elligible");
        }
        else{
            System.out.println("yoou arenot elligible");
        }

        scanner.close();
        }
} 