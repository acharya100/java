public class User {
    String name ;
    String email;
    int age;

    User(String name){
        this.name = name;
        this.email = "ok1@gmail.com";
        this.age = 21;
    }
    User(String name,int age){
        this.name = name;
        this.email = "notok@gmail.com";
        this.age = age;
    }
    User(String name,String email,int age){
        this.name = name;
        this.email = email;
        this.age= age;
    }
    // User(){
    //     this.name = name;
    //     this.email = email;
    //     this.age = age;
    // }
}
