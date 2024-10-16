public class Person implements Student,Youtuber{
    @Override
    public void makevideo() {
System.out.println("Person is making a video");
    }

    @Override
    public void study() {
        System.out.println("Person is Studing");

    }
    public static void main(String[] args) {
          Person p = new Person();
          p.study();
          p.makevideo();
    }

    
}
