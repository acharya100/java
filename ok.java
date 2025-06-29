public class ok{
    public static void main(String[] args){

        Student student1 = new Student("ram",21,2.4,false);
        Student student2 = new Student("shyam",22,3.2,true);
        Student student3 = new Student("hari",23,3.8,true);

        System.out.println(student1.name);
        System.out.println(student2.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
       
        student1.study();
        student3.enrolled();
    }
}