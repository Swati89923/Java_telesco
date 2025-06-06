//  an inner class is a class defined inside another class. It helps group logically related classes together and increases encapsulation.
// To simplify code related to event handling (especially in GUI programming)
// package basic_java_codes;
// class A 
// {
//     int age;
//     public void show(){
//         System.out.println(" in show");

//     }
//     class B{
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Inner_class {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();
//         A.B obj1 = obj.new B();
//         obj1.config();
//     }
    
// }


// when inner class is static and one more thing u can not make outer class staftic
// package basic_java_codes; 
// class A 
// {
//     int age;
//     public void show(){
//         System.out.println(" in show");

//     }
//     static class B{
//         public static void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Inner_class {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();
        
//         A.B.config();
//     }
    
// }


// Anonymous Inner class 
// An anonymous class is a class without a name that is declared and instantiated in a single line.
//It is usually used to override methods of a class or interface on the spot, especially for short-term use.
//Common in event handling, threading, and functional programming (like lambda alternatives).

// package basic_java_codes;
// abstract class Animal{
//     abstract void makesound();
// }

// public class Inner_class {
//     public static void main(String[] args){
//         Animal dog = new Animal() {
//             @Override
//             void makesound() {
//                 System.out.println("Bark");
//             }
//         };
//         dog.makesound();
//     }
// }

// Abstract and Anonymous inner class


