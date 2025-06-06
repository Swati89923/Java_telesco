// // // object oriented programming
// // // Object - properties and behaviour
// // // class is blueprint of how an object work

// // package basic_java_codes;
// // class Calculator 
// // {
// //     public int add(int n1 , int n2)
// //     {
// //        System.out.println("in add");
// //        return n1+n2; 
// //     }
// // }

// //  class Object_oriented_program {
// //     public static void main(String[] args) {
// //         int num1=6;
// //         int num2=9;

// //         Calculator calc = new Calculator();
// //         int result= calc.add( 6,9);
// //         System.out.println(result);
// //     }
    
// // }


// // //  methods written witth round bracket
// // package basic_java_codes;
// // class Computer {
// //         public void playMusic()
// //         {
// //             System.out.println("Music playing..");
// //         }
        
// //             public String getMepen(int cost)
// //             {
// //                 if (cost>=10)
// //                    return "Pen";
// //                 return "nothing";
// //             }
// //         }
// // class Object_oriented_program
// //  {
// //     public static void main(String[] args) {
        
// //         Computer obj =new Computer();
// //         obj.playMusic();
// //         String str=obj.getMepen(3);
// //         System.out.println(str);
// //     }
// //  }



// // // method overloading we can also use same name and we are Passing different parameter..here we have used int but we can also use double float etc .

// // package basic_java_codes;
// // class Calculator
    
// //    {   
// //        int num=5; // instance variable
// //        public int add(int n1,int n2,int n3)
// //        {
// //         System.out.println(num);
// //         return n1+n2+n3;
// //        }
// //        public int add(int n1 ,int n2)
// //        {
// //         return n1+n2;
// //        }
// //    }
// // class Object_oriented_program
// //   {
// //     public static void main(String[] args) {
// //        Calculator obj=new Calculator();
// //        int r1 = obj.add(2,9,8);
// //        System.out.println(r1);
// //        int r2=obj.add(4,7);
// //        System.out.println(r2);
// //     }
// // }

// // // Stack and heap
// // every method has its own stack
// // local variable part of stack memory
// // instance variable part of heap memory
// // in heap a reference variable object created
// // there is a link betwwen stack and heap when u call obj ...jump from stack to heap. 


// // Encapsulation

// // package basic_java_codes;
// // class Human
// // {
// //    private int age=11;
// //    private String name="Navin";

// //    public int getage()
// //    {
// //       return age;
// //    }
// //    public String getname()
// //    {
// //       return name;
// //    }
// // }

// // class Object_oriented_program 
// // {

// //    public static void main(String[] args)
// //    {
// //          Human obj = new Human();
// //          // obj.age=11;
// //          // obj.name="Navin";
// //          System.out.println(obj.getname());
// //          System.out.println(obj.getage());
// //    }

// // }


// // Method Overriding in Java
// // package basic_java_codes;

// // class A{
// //      public void show(){
// //         System.out.println("in show");
// // }
// //        public void config(){
// //         System.out.println("in a configure");
// //        }
// // }
// // class B extends A {
// //     public void show(){
// //         System.out.println("overidden");
// //     }
// // }

// // public class Object_oriented_program {
// //        public static void main (String[] args){
// //             A obj =new B();
// //             obj.show();
// //             obj.config();
// //    }
// // }


// // Polymorphismm (Many behaviour)
// // two typpes of polymorphismm : compile time(early binding)----> Overloading  and Run time(late binding)---> overriding


// // Dynamic method  dispatch(Runtime pOLYMORPHISM)

// // It involves method overriding, where a subclass provides its own implementation of a method already defined in its superclass.
// // The reference variable is of superclass type, but the object is of subclass type.
// //At runtime, Java decides which version of the method to call — based on the actual object.
// //Why It's Called “Dynamic”:
// //Because the method call is dispatched (selected) at runtime, not during compilation.



// // package basic_java_codes;

// //     class Animal{
// //         public void sound(){
// //             System.out.println("Some animal sound");
// //         }
// //     }

// //     class Dog extends Animal{
// //         public void sound(){
// //             System.out.println("bark");
// //         }
// //     }
// //     class Object_oriented_program{
// //         public static void main(String[] args) {
// //             Animal obj = new Dog();{
// //             obj.sound();

// //         }
// //         }
// // }
// //Even though obj is of type Animal, the actual object is of type Dog, so Dog's sound() is called at runtime.
// // Enables runtime polymorphism

// //Supports flexibility and extensibility in object-oriented programs

// //Often used in interface-based programming


// // final keyword
// //The final keyword in Java is a non-access modifier used for variables, methods, and classes. It is used to restrict modification or inheritance.
// // You must initialize a final variable either:

// //at the time of declaration, or inside the constructor (if it’s not sta

// // package basic_java_codes;
// // final class Calc{
// //     public void show(){
// //         System.out.println("in calc show");
// //     }
// //     public final void add(int a, int b){
// //         System.out.println(a+b);
// //     }
// // }
// // class Advcalc extends Calc{
// //     public static void diff(int a, int b){
// //         System.out.println(a-b);
// //     }
// // }

// // public class Object_oriented_program {
// //     public static void main(String[] args){
// //          Advcalc obj=new Advcalc();
// //          obj.add(9,2);

// //     }
// // }

// // what is Object class in java and object class equals toString hashcode
// // In Java, Object is the root class of the class hierarchy.
// //Every class in Java implicitly inherits from the Object class, unless it explicitly extends another class.
// package basic_java_codes;


// class Laptop {
//     String model;
//     int price;

//     @Override
//     public String toString() {
//         return model + " : " + price;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         Laptop that = (Laptop) obj;
//         return this.model.equals(that.model) && this.price == that.price;
//     }

//     @Override
//     public int hashCode() {
//         return model.hashCode() + price;
//     }
// }

// public class Object_oriented_program  {
//     public static void main(String[] args) {
//         Laptop obj1 = new Laptop();
//         obj1.model = "Lenovo Yoga";
//         obj1.price = 1000;

//         Laptop obj2 = new Laptop();
//         obj2.model = "Lenovo Yoga";
//         obj2.price = 1000;

//         System.out.println(obj1);               // Lenovo Yoga : 1000
//         System.out.println(obj2);               // Lenovo Yoga : 1000
//         System.out.println(obj1.equals(obj2));  // true
//         System.out.println(obj1.hashCode());    // same hash
//         System.out.println(obj2.hashCode());    // same hash
//     }
// }
