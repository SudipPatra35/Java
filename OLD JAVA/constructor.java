// class Student {
//     int id;
//     String name;

//     // Creating a Parameterized Constructor :
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     void display() {
//         System.out.println(id + " " + name);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         // Creating objects
//         Student s1 = new Student(111, "Karan");
//         Student s2 = new Student(222, "Aryan");
//         // Displaying values of Object
//         s1.display();
//         s2.display();
//     }
// }


//Creating a Non Parameterized Constructor :

// Create a Main class
public class constructor {
    int x;  // Create a class attribute
  
    // Create a class constructor for the Main class
    public constructor() {
      x = 5;  // Set the initial value for the class attribute x
    }
    public static void main(String[] args) {
      constructor myObj = new constructor(); // Create an object of class Main (This will call the constructor automatically)
      System.out.println(myObj.x); // Print the value of x
    }
  }