
// compile error like u are doing spelling mistake , logical error ur code is running but uur output is coming wrong and runtime error(exception) sometime stop running

// An exception in Java is an event that disrupts the normal flow of the program.
//It occurs during runtime (when the program is running).
//Example: Dividing a number by zero or accessing an invalid index in an array.
// 🔷 Types of Exceptions:
// Checked Exceptions (Compile-time)
//Handled using try-catch or declared using throws.
//Example: IOException, SQLException.
//Unchecked Exceptions (Runtime)
//Occur during execution.
//Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.
//🔷 Exception Hierarchy:
//php
// Copy code
// Throwable
//  ├── Exception
//  │    ├── IOException(checked)
//  │    └── SQLException
//  └── RuntimeException (unchecked exception)
//       ├── ArithmeticException
//       ├── NullPointerException
//       └── ArrayIndexOutOfBoundsException


// package basic_java_codes;
// public class ExceptionExample {

//     public static void main(String[] args) {
//         int i=0;
//         int j = 2;

//         try
//         {
//             j=18/i;
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something went wrong. " + e);
//         }
//         System.out.println(j);
//         System.out.println("Bye");
//     }
// }


// Now when u are doing two error then first one willbe e otherwise ur first one is coorrect then second one will be e if u removve e from the print statement then if first statement is true and second one is false then alsooo it will print same first error
// package basic_java_codes;
// public class ExceptionExample {

    // public static void main(String[] args) {
    //     int i=4;
    //     int j = 2;
    //     int nums[] = new int[4];
    //     try
    //     {
    //         j=18/i;
    //         System.out.println(nums[1]);
    //         System.out.println(nums[8]);  // outcome is.. Something went wrong. java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 4
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println("Something went wrong. " + e);
    //     }
    //     System.out.println(j);
    //     System.out.println("Bye");
    // }

// package basic_java_codes;
// public class ExceptionExample {

    

//     public static void main(String[] args) {
//         int i=4;
//         int j = 2;
//         String str = null;
//         int nums[] = new int[4];
//         try
//         {
//             j=18/i;
//             System.out.println(nums[1]);
//             System.out.println(nums[3]);
//             System.out.println(str.length()); 
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("can't devide by 0");
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("stay in ur limit");
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something went wrong");
//         }
//         System.out.println(j);
//         System.out.println("Bye");
//     }
// }



// Exception throw keyword in java 

// package basic_java_codes;
// public class ExceptionExample {

//     public static void main(String[] args) {
//         int i=0;
//         int j=9;
    
//     try {
//         j= 18/i;
//     }
//     catch(ArithmeticException e){
//          j=18/1;
//          System.out.println("default value");
//     }
//     catch(Exception e)
//     {
//         System.out.println("something  went wrong");
//     }
//     System.out.println(j);
//     System.out.println("Bye");
// }
// }

// custom exception


// package basic_java_codes;

// class SwatiException extends Exception {
//     public SwatiException(String string) {
//         // no super() used, as per your request
//     }
// }

// public class ExceptionExample {

//     public static void main(String[] args) {
//         int i = 0;
//         int j = 4;

//         try {
//             j = 18 / i;  // This will throw ArithmeticException

//             if (j == 0)
//                 throw new SwatiException("I don't want any error");
//         }

//         catch (SwatiException e) {
//             j = 18 / 1;
//             System.out.println("Default value assigned due to SwatiException.");
//         }

//         catch (Exception e) {
//             System.out.println("Something went wrong");
//         }

//         System.out.println(j);
//         System.out.println("Bye");
//     }
// }


//  Duckling Exception in java

//These are checked at compile-time.
//Java forces you to handle them using try-catch or throws.
// .📌 What Is "Ducking an Exception"?
// It just means: "I don’t want to handle the exception here. Let the caller handle it."
// This class tries to load a class using reflection
// class A {
//     public void show() throws ClassNotFoundException {
//         // This will throw ClassNotFoundException if "Calc" class is not found
//         Class.forName("Calc");
//     }
// }

// public class ExceptionExample  {
//     static {
//         System.out.println("Class Loaded");
//     }

//     public static void main(String[] args) {
//         A obj = new A();
//         try {
//             obj.show();
//         } catch (ClassNotFoundException e) {
//             System.out.println("Exception caught: " + e);
//         }
//     }
// }


// User Input using BufferedReader and Scannner in java
// package basic_java_codes;

// import java.io.IOException;

// public class ExceptionExample {
//   public static void main(String[] args) throws IOException{
//       System.out.println("Enter a number");
//       int num = System.in.read();

//       System.out.println(num-255);
//   }
// }

// Importing required classes
// package basic_java_codes;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// // Package declaration (should come before imports if used)


// public class ExceptionExample {
//     public static void main(String[] args) throws IOException {
//         System.out.println("Enter a number:");

//         // Creating BufferedReader object to read input from the console
//         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//         // Creating Scanner object to read input from the console
//         Scanner sc = new Scanner(System.in);

//         // Using BufferedReader to read input and parse it to an integer
//         int num = Integer.parseInt(bf.readLine());

//         // Displaying the number entered
//         System.out.println("You entered (using BufferedReader): " + num);

//         // Taking another input using Scanner to demonstrate both
//         System.out.print("Enter another number (using Scanner): ");
//         int num2 = sc.nextInt();

//         System.out.println("You entered (using Scanner): " + num2);

//         // Closing resources
//         sc.close();
//         bf.close();
//     }
// }


// try with resoursces in Java

// finally will give output either u are getting exception or not 
// package basic_java_codes;
// public class ExceptionExample {

//     public static void main(String[] args) {

//         int i = 0;
//         int j =0;
//         try
//         {
//             j=18/i;
//         }
//         catch(Exception e)
//         {
//               System.out.println("Something went wrong");
//         }
//         finally
//         {
//               System.out.println("Bye");
//         }
//     }
// }


// try with close
// Ensures that resources like streams, readers, etc., are automatically closed, even if exceptions occur.
// The object used in try(...) must implement AutoCloseable (which BufferedReader, Scanner, etc., do)
// package basic_java_codes;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class  ExceptionExample {

//     public static void main(String[] args) throws NumberFormatException, IOException {
//         int num = 0;

//         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//             num = Integer.parseInt(br.readLine());
//             System.out.println(num);
//         } catch (Exception e) {
//             System.out.println("Something went wrong.");
//         }

//         System.out.println("Bye");
//     }
// }
