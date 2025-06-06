// A Java program runs by default with one main thread (called the main thread).
// But Java lets you run multiple tasks at the same time, each in a separate thread — this is called multithreading.
// 💡 Why Use Threads?
//To do multiple things at once:
//Download a file while showing a progress bar.
//Play music while typing in a game.
//Handle multiple users in a server.
// You should not call run() directly. Use start() to create a new thread.
// Threads share memory, so you need to be careful with data — synchronization may be required.
// | Method      | Description                           |
// | ----------- | ------------------------------------- |
// | `start()`   | Starts the thread (calls `run()`)     |
// | `run()`     | Code to be executed in the thread     |
// | `sleep(ms)` | Pauses the thread for milliseconds    |
// | `join()`    | Waits for a thread to finish          |
// | `isAlive()` | Checks if the thread is still running |

// package basic_java_codes;
// class A extends Thread{
//     public void run (){
//         for (int i=1; i<=10;i++){
//             System.out.println("hi");
//         }
//     }
// }
// class B extends Thread{
//     public void run (){
//         for (int i= 1; i<10; i++){
//             System.out.println("hello");
//         }
//     }
// }

// public class threads_java {
//     public static void main(String[] args) {
//         A obj1 =new A();
//         B obj2= new B();
//         obj1.start();
//         obj2.start();
//     }
// }

// package basic_java_codes;

// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 1; i < 10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class threads_java {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();
//     }
// }


// Thread priority and S;eep in Java

// package basic_java_codes;

// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 1; i < 10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class threads_java {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();

//         obj2.setPriority(Thread.MAX_PRIORITY);
//         obj1.start();
//         obj2.start();
//     }
// }

// Runnable vs thread in java

// package basic_java_codes;

// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10); // Slow down to visualize threading
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class threads_java {
//     public static void main(String[] args) {
//         Runnable obj1 = new A();
//         Runnable obj2 = new B();
//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }

// Race Condition in java

// package basic_java_codes;

// class Counter {
//     int count;

//     public void increment() {
//         count++;
//     }
// }

// public class threads_java {
//     public static void main(String[] args) throws Exception {
//         Counter c = new Counter();

//         Runnable obj1 = () -> {
//             for (int i = 0; i < 1000; i++) {
//                 c.increment();
//             }
//         };

//         Runnable obj2 = () -> {
//             for (int i = 0; i < 1000; i++) {
//                 c.increment();
//             }
//         };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         t2.start();

//         t1.join();  // wait for t1 to finish
//         t2.join();  // wait for t2 to finish

//         System.out.println("Count: " + c.count);
//     }
// }


// Thread state in java
//n Java, a thread goes through several states in its lifecycle, defined by the java.lang.Thread.State enum. Here's a summary with real-world meaning:
// | **State**       | **Meaning**                                                              |
// | --------------- | ------------------------------------------------------------------------ |
// | `NEW`           | Thread is created but **not started** yet (`Thread t = new Thread(...)`) |
// | `RUNNABLE`      | Thread is **ready** to run and waiting for CPU time                      |
// | `RUNNING`       | Thread is **actively executing** code                                    |
// | `BLOCKED`       | Waiting to **acquire a lock** on an object                               |
// | `WAITING`       | Waiting **indefinitely** for another thread to perform an action         |
// | `TIMED_WAITING` | Waiting for **a specific time** (e.g., `sleep()`, `join(timeout)`)       |
// | `TERMINATED`    | Thread has **finished execution** (either normally or with an error)     |


//  Key Methods Affecting States:
// start() → NEW → RUNNABLE

// sleep(ms) → TIMED_WAITING

// wait() → WAITING

// join() → WAITING or TIMED_WAITING

// notify()/notifyAll() → wakes up WAITING threads

// interrupt() → interrupts a WAITING or SLEEPING thread

