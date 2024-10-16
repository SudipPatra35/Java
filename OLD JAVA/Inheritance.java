import javax.xml.transform.SourceLocator;
// 1 :  Single Inheritance

// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.bark();
//         d.eat();
//         d.weep();
//     }
// }

// 2 : Multilevel Inheritance

// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }
// class BabyDog extends Dog{
//     void weep(){
//         System.out.println("Weeping...");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         BabyDog d = new BabyDog();
//         d.bark();
//         d.eat();
//         d.weep();
//     }
// }

// 3 : Hierarchical Inheritance

// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }
// class Cat extends Animal{
//     void meo() {
//         System.out.println("Meowing...");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Cat c = new Cat();
//         c.eat();
//         c.meo();
//         //  c.bark();  // Throwing error : Dog class in anothor child of Animal. So it cann't use the properties of Cat
//     }
// }

// Multiple Inheritance : Not Supported in Java. Supported in C++

// class A {
//     void msg() {
//         System.out.println("Hello");
//     }
// }
// class B {
//     void msg() {
//         System.out.println("Welcome");
//     }
// }
// class C extends A,B{
// // Suppose if it were
// // void msg(){
// // System.out.println("to Home");
// // }
// }
// public class Inheritance{
//     public static void main(String[] args) {
//         C obj=new C();
//         obj.msg(); 
//     }
// }

// Hybrid Inheritance :
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Cow extends Animal {
    void milk() {
        System.out.println("Gives us milk...");
    }
}

class Dog extends Cow {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Cow {
    void meo() {
        System.out.println("Meowing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat d = new Cat();
        Dog c = new Dog();
        // d.bark();
        d.milk();
        d.eat();
        d.meo();
        c.bark();
    }
}