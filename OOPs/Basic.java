class Student{
    String name;
    int roll;
    Student(){
        System.out.println("I am a student.");
    }
    void StudentInfo(){
        System.out.println("Name is : "+this.name);
        System.out.println("Roll is : "+this.roll);
    }
}

class Basic{
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.name="Sudip Patra";
      s1.roll=1;
      s1.StudentInfo();  
      Student s2 = new Student();
      s2.name="Sanjoy Mondal";
      s2.roll=3;
      s2.StudentInfo();  
    }
}