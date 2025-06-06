//A lambda expression is a concise way to implement a functional interface (an interface with only one abstract method).
// package basic_java_codes;
// @FunctionalInterface
// interface A {e
//     void show();
// }

// public class Lambda_expres_Example {
//     public static void main(String[] args) {
//         // Using lambda expression instead of anonymous class
//         A obj = () -> System.out.println("in show");
//         obj.show();  // Output: in show
//     }
// }


// Now with parameter
// package basic_java_codes;
// @FunctionalInterface
// interface A {
//     void show(int i);
// }

// public class Lambda_expres_Exampl {
//     public static void main(String[] args) {
//         // Using lambda expression instead of anonymous class
//         A obj = i-> System.out.println("in show"+" " + i);
//         obj.show(5);  // Output: in show
//     }
// }

// Lambda expression with java 

// package basic_java_codes;
// @FunctionalInterface

// interface C {
//     int square(int x);
// }

// public class Lambda_expres_Exampl {
//     public static void main(String[] args) {
//         C sq = x -> x * x;

//         System.out.println("Square of 6: " + sq.square(6));  // Output: 36
//     }
//}

