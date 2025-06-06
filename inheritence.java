// extent use for inheriting class and we will write another cllass jus below the parent class without any indentation out of the parent class and 
//we will reconstruct aa constructoor for child class and inherit same this of parent claass by using super 

// package basic_java_codes;

// // Base class
// class Calc {
//     protected int a, b;

//     public Calc(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     public int doSum() {
//         return a + b;
//     }

//     public int doDiff() {
//         return a - b;
//     }

//     public int doProd() {
//         return a * b;
//     }

//     public int doDiv() {
//         return a / b; // Assuming b != 0
//     }
// }

// // Subclass
// class AdvCalc extends Calc {
//     public AdvCalc(int a, int b) {
//         super(a, b); // Call parent constructor
//     }

//     public int findArea() {
//         return a * b;
//     }

//     public int findPerimeter() {
//         return 2 * (a + b);
//     }
// }

// // Main class
// public class inheritence {
//     public static void main(String[] args) {
//         AdvCalc obj1 = new AdvCalc(3, 5);
//         System.out.println("Sum: " + obj1.doSum());
//         System.out.println("Difference: " + obj1.doDiff());
//         System.out.println("Product: " + obj1.doProd());
//         System.out.println("Division: " + obj1.doDiv());
//         System.out.println("Area: " + obj1.findArea());
//         System.out.println("Perimeter: " + obj1.findPerimeter());
//     }
// }


// //single level and multi level inheritence
// package basic_java_codes;

// // Base class
// class Calc {
//     protected int a, b;

//     public Calc(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     public int doSum() {
//         return a + b;
//     }

//     public int doDiff() {
//         return a - b;
//     }

//     public int doProd() {
//         return a * b;
//     }

//     public int doDiv() {
//         return a / b; // Assuming b != 0
//     }
// }

// // Subclass
// class AdvCalc extends Calc {
//     public AdvCalc(int a, int b) {
//         super(a, b); // Call parent constructor
//     }

//     public int findArea() {
//         return a * b;
//     }

//     public int findPerimeter() {
//         return 2 * (a + b);
//     }
// }
// class MoreAdvCalc extends AdvCalc{
//    public MoreAdvCalc(int a, int b){
//       super(a,b);
//    }
//    public  int size_breadths(){
//     return 2*a;

//    }
//    public int size_lengths(){
//     return 2*b;
//    }
// }

// // Main class
// public class inheritence {
//     public static void main(String[] args) {
//         MoreAdvCalc obj1 = new MoreAdvCalc(3, 5);
//         System.out.println("Sum: " + obj1.doSum());
//         System.out.println("Difference: " + obj1.doDiff());
//         System.out.println("Product: " + obj1.doProd());
//         System.out.println("Division: " + obj1.doDiv());
//         System.out.println("Area: " + obj1.findArea());
//         System.out.println("Perimeter: " + obj1.findPerimeter());
//         System.out.println("breadth size: " + obj1.size_breadths());
//         System.out.println("length size: " + obj1.size_lengths());
//     }
// }

// //  multiple inheritance  will not work in java 


