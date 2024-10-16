class Student{
    String name;
    int roll;
    //Non parameterized Consturctor : 
        Student(){
        System.out.println("I am a student.But no details!");
    }
    //Constructor overloading : Parameterized Constuctor
        Student(String nam,int rol){
            this.name=nam;
            this.roll=rol;
        System.out.println("Name is : "+name);
        System.out.println("Roll is : "+roll);
    }
    //Copy Consturctor :
    Student(Student s){
        this.name =s.name;
        this.roll =s.roll;
        System.out.println("Name is : "+name+", Roll is : "+roll);
    }
}
public class Construc {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sudip",1);

        Student s3 = new Student(s2);
    }
}
