class Animal {

  int n = 50;
  String dog = "Labrador";

  Animal() {
    System.out.println("Hi, it is Animal Consturctor");
  }

  void animal() {
    System.out.println("I am an animal..");
  }
}

class Dogs extends Animal {

  String dog = super.dog;

  Dogs() {
    super();
    System.out.println("Dog is created..");
  }

  int x = super.n;

  void animal(int x) {
    super.animal();
    System.out.println("Total dog is " + x);
    System.out.println("Dog is : " + dog + " and number is : " + x);
  }
}

class Method_overriding {

  public static void main(String[] args) {
    Dogs d = new Dogs();
    d.animal(5);
  }
}
