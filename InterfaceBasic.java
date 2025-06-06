// multiple inheritence supported in interfrence.
// An interface in Java is a blueprint for a class. It defines a set of abstract methods (method signatures only, no body) that must be implemented by any class that chooses to "implement" the interface.
//Think of it as a contract: any class that signs the contract must implement all the declared methods. 
// package basic_java_codes;
// interface A{
//      void show();
//      void config();
// }

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void config()
//     {
//         System.out.println("in config");
//     }
// }
// public class interface_basic {
//     public static void main(String[] args){
//         A obj;
//         obj = new B();
//         obj.show();
//         obj.config();
//     }
// }


// class-class --> extends
// class-interface --> implement
// interface-interface  --> extends

// package basic_java_codes;

// interface A {
//     int age = 44;
//     String area = "Mumbai";

//     void show();
//     void config();
// }

// interface X {
//     void run();
// }

// interface Y extends X {
//     // Y inherits run() from X
// }

// class B implements A, X {
//     public void show() {
//         System.out.println("in show");
//     }

//     public void config() {
//         System.out.println("in config");
//     }

//     public void run() {
//         System.out.println("is running");
//     }
// }

// public class InterfaceBasic {
//     public static void main(String[] args) {
//         A obj;
//         obj = new B();
//         obj.show();
//         obj.config();

//         // To call run(), you need a reference of type X
//         X obj2 = new B();
//         obj2.run();
//     }
// }

// types of Interface normal, functional(SAM--. singlee abstract method), marker(no methods)==> serialisable annd not seriialiisable
// // funstion interface
// package basic_java_codes;

// @FunctionalInterface
// interface A{
//     void show();
// }
// // class B implements  A{
// //     public void  show()
// //     {
// //         System.out.println("in show");
// //     }
// // }
// public class InterfaceBasic {
// public static void main(String[] args) {
//         // Anonymous class implementation of interface A
//         A obj = new A() {
            
//             public void show() {
//                 System.out.println("in show");
//             }
//         };

//         obj.show();  // Output: in show
//     }
// }