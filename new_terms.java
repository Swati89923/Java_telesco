// Object oriented programming


// Upcasting  When a subclass object is treated as a superclass type.

// Why: Upcasting  (Child → Parent) is safe and implicit. It is often used in polymorphism.

// package basic_java_codes;
// class Animal{
//     public void sound(){
//     System.out.println("Some sound");
//     }
//     public void species(){
//     System.out.println("belongs to some species");
//     }
// } 
// class Dog extends Animal{
//     public void sound(){
//     System.err.println("bark");
//     }
//     public void fight(){
//     System.out.println("Cat");
//     }
// }

// public class new_terms {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.species();
//         a.sound(); // upcasting 
//         // a.fight();  // method not in animal so it will give error 
//     }
    
// }

// Downcasting (Parent → Child) Converting a superclass reference back to a subclass type.

//Why: To access subclass-specific methods after upcasting .. Child c = (Child) parentRef;  // Downcasting (explicit)
// package basic_java_codes;
// class Animal{
//     public void sound(){
//     System.out.println("Some sound");
//     }
//     public void species(){
//     System.out.println("belongs to some species");
//     }
// } 
// class Dog extends Animal{
//     public void sound(){
//     System.err.println("bark");
//     }
//     public void fight(){
//     System.out.println("Cat");
//     }
// }

// public class new_terms {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         Dog d= (Dog) a;
//         a.species();
//         a.sound(); // upcasting safe and implicit
//         d.fight();  //Downcasting risky and explicit
        
//     }
    
// }

// wrappper class in java
//rapper classes in Java are object representations of primitive data types. They "wrap" primitives into objects so they can be used where objects are required—like in collections (ArrayList, HashMap, etc.).
//primitive type vs Wrapper class: 
// byte Byte, short Short, int Integer, long Long, float Float, double Double , char Character, boolean Boolean.
//Wrapper classes are immutable. Once created, you can’t change their value.
// Why use Wrapper Classes?
// To store primitives in collections like ArrayList<Integer>
//For utility methods (Integer.parseInt("123"))
//Used in generics, synchronization, serialization
//Null values (primitive can’t hold null, wrappers can)

// package basic_java_codes;
// class new_terms{
//     public static void main(String[] args) {
        
//         int num = 7;
//         Integer num1 =num; // auto boxing 
//         Integer num1 = new Integer(num); // boxing
//         int num2= num1.intValue(); // unboxing primitive type to wrapper class or object clss
//         int num2 =num1; // auto unboxing
//         System.out.println(num1);
//     }
// }


// Abstract keyword
// The abstract keyword in Java is used for creating abstract classes and abstract methods, which are part of abstraction in object-oriented programming.
// An abstract class is a class that cannot be instantiated (you can’t create its object). It can contain abstract methods (methods without a body) as well as concrete methods (with implementation).
// An abstract method has no body — only the declaration. Subclasses must override it.
// Use abstract when you want to define a common structure but leave the actual implementation to subclasses.

// package basic_java_codes;
// abstract class Animal{
//     abstract void sound(); // abstract method // abstrqact class can have constructor but cannot directly create object
//     void sleep(){
//         System.out.println("sleeping...");
//     }
// }
// class Dog extends Animal{
//     @Override
//     void sound(){               // in abstrac.  child class must override abstract methods
//         System.out.println("Bark");
//     }
// }
// public class new_terms {

//      public static void main(String[] args) {
//         Animal a = new Dog();     //upcasting // in abstract class we cn't wroite Animal a = new Animal();
//         a.sound();  // output baark
//         a.sleep();  // output: sleeping..
//      }
// }

// // abstract method should have abstract class but it is not necessary that abstracr class should have abstract method

// Anotation

// Annotation is a form of metadata that provides data about a program but is not part of the program itself.
//It can be read by the compiler or at runtime to perform certain operations.
//They start with @ symbol, like @Override, @Deprecated, or custom ones.

//Why use Annotations?
//To provide instructions to the compiler.
//To generate code or XML files automatically.
//To influence runtime behavior via reflection (commonly used in frameworks like Spring or Hibernate).

// package basic_java_codes;
// class parent{
//     void display(){
//         System.out.println("parent display");
//     }
// }
// class child extends parent{
//     @Override
//     void display(){
//         System.out.println("display child");
//     }
//     @Deprecated
//     void oldmethod(){
//         System.out.println("This method is deprected");
//     }
// }
// public class new_terms{
//     public static void main(String[] args) {
//         child c = new child();
//         c.display();
//         c.oldmethod(); // using  a deprecated method
//     }
// }