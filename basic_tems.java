//this keyword just like self just difference is its inbuilt in python

// package basic_java_codes;
// public class basic_tems {

//     public static class Student { // Make Student class static to use it in static main
//         String name;

//         public Student(String name) {
//             this.name = name; // "this" refers to current object's variable
//         }

//         public void display() {
//             System.out.println("Name: " + this.name);
//         }
//     }

//     public static void main(String[] args) {
//         Student s = new Student("Ravi");
//         s.display();
//     }
// }

// // more important  key points 
// // in Java, access modifiers like public, private, and protected are optional — and if you don’t write any modifier, Java uses a default access level, also called package-private.
// //You should write public when:

// //You want a method to be accessible from anywhere, including from other packages.

// // Especially needed for methods like main — because the Java Virtual Machine (JVM) needs to call it.
// //But for small internal methods (like display() in your case), if you're only using it within the same file/package, public isn't required.
// // main() must be public so the JVM can access it.

// //display() being default works fine unless you need to call it from another package/class.
// //You can safely make it public if you want to follow clarity or access conventions.



// constructor should be saame name as class name it will return nothing
// package basic_java_codes;

// class Human_all {
//     private int age;
//     private String name;
    
//     public Human_all()
//     {
//         // System.out.println("in constructor");
//         name="Raushan";
//         age=21;
//     }
//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// public class basic_tems {
//     public static void main(String[] args) {
        // Human_all obj = new Human_all();
        // Human_all obj1 = new Human_all();
        // obj.setAge(30);                

//         //  System.out.println(obj.getName() + " : " + obj.getAge());
//     }
// }

// Constructor Overloading and normaal constructor vs parmetrised constructor
// package basic_java_codes;

// class Human_all {
//     private int age;
//     private String name;
    
//     public Human_all()   // normal constructor or default 
//     {
//         // System.out.println("in constructor");
//         name="Raushan";
//         age=21;
//     }
//     public  Human_all(int a, String n ) // parametrised constructor
//         {
//             age = a;
//             name=n;

//         }
//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// public class basic_tems {
//     public static void main(String[] args) {
//         Human_all obj = new Human_all();
//         Human_all obj1 = new Human_all(19,"Swati");
//         obj.setAge(30);                

//          System.out.println(obj.getName() + " : " + obj.getAge());
//           System.out.println(obj1.getName() + " : " + obj1.getAge());
//         }
// }

//or you can write the same code in this way by some changes in parametrised constructor

// package basic_java_codes;

// class Human_all {
//     private int age;
//     private String name;
    
//     public Human_all()   // normal constructor or default 
//     {
//         // System.out.println("in constructor");
//         name="Raushan";
//         age=21;
//     }
//     public  Human_all(int age, String name ) // parametrised constructor
//         {
//             this.age = age;
//             this.name=name;

//         }
//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// public class basic_tems {
//     public static void main(String[] args) {
//         Human_all obj = new Human_all();
//         Human_all obj1 = new Human_all(19,"Swati");
//         obj.setAge(30);                

//          System.out.println(obj.getName() + " : " + obj.getAge());
//           System.out.println(obj1.getName() + " : " + obj1.getAge());
//         }
// }


// naming  camel case we uuse their  for class , for variable and method   small letter and for constant we use capital letter 



// Anonymous Object in java...for anonynomous object there will be no reference
    // newA().show() // anonymous object where we do not store it directly use it


// this and super method  in java 
// every constructor have by default super keyword
// this keyword
//Refers to the current class instance — mainly used for:

//Differentiating between instance variables and parameters.

//Calling one constructor from another constructor in the same class.

//Passing the current object to methods/constructors.

// Super Keyword
//Refers to the parent class. It is used to:
//Call the parent class constructor (super()).
//Access parent class methods or variables that are overridden




// packages 
// import tools.Calc;   we are importing calc file from tool foldef and working in different folder 
// import tools.AdvCalc;
//import tools.*; then all file inside folder will imported and we can use  all funcs 
// import java.util.ArrayList; its inbuilt in java there is util folder in which list available


// Access modifiers when we ccesing variable or method in saame folder then it is not necessaryt to make int variable or any puublic but
// when u are using variablle or method  in different folder the u have to make that variable public otherwise we  unable to acess variable from different folder
// public means u can access from anywhere and otherside private mens u can use only in same class
// default - it can be acceess in same package
//protected -it can be use in same class same package non-subclass different package subclass but not in different package non subclass