// In Java, enum (short for enumeration) is a special data type that enables a variable to be a set of predefined constants. It’s used when you have a fixed set of known values that a variable can hold—like days of the week, directions, or states.
//Enums are type-safe — you can't assign any value other than those defined.
//Each enum constant is a public static final instance.
//Enums can have constructors, fields, and methods.
//Advantages of Enums:
//Readability: Clear and self-explanatory.
//Type safety: Prevents assigning invalid values.
//Scalability: Can include methods and fields.
// package basic_java_codes;

// // Define enum
// enum Status {
//     Running, Failed, Pending, Success;
// }

// // Main class
// public class enum_key {
//     public static void main(String[] args) {
//         // Declare a variable of enum type and assign a value
//         Status s = Status.Running;

//         // Print the enum value
//         System.out.println(s);  // Output: Running
//     }
// }

// Enum if and switch in java
// package basic_java_codes;
// // Define an enum for days of the week
// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
// }

// public class EnumIfSwitchExample {

//     public static void main(String[] args) {
//         Day today = Day.WEDNESDAY;

//         // Using if-else with enum
//         if (today == Day.SATURDAY || today == Day.SUNDAY) {
//             System.out.println("It's the weekend!");
//         } else {
//             System.out.println("It's a weekday.");
//         }

//         // Using switch with enum
//         switch (today) {
//             case MONDAY:
//                 System.out.println("Start of the work week.");
//                 break;
//             case WEDNESDAY:
//                 System.out.println("Midweek day.");
//                 break;
//             case FRIDAY:
//                 System.out.println("Almost weekend!");
//                 break;
//             default:
//                 System.out.println("Just another day.");
//                 break;
//         }
//     }
// }



// // enum class in javaa 

// package basic_java_codes;
// enum Laptop {
//     Macbook(2000), XPS(2200), Surface(2399);

//     private int price;

//     private Laptop(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }
// }

// public class enum_key {
//     public static void main(String[] args) {
//         Laptop lap = Laptop.Macbook;
//         System.out.println(lap + " costs $" + lap.getPrice());
//     }
// }
