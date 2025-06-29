public class Mian{
    public static void main(String[] args){

        User user1 = new User("ok");
        User user2 = new User("notok",22);
        User user3 = new User("yeet","ye2@gmail.com",23);

        // User user = new User();
        // System.out.println(user.name);
        // System.out.println(user.email);
        // System.out.println(user.age);

        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);
        
    }
}