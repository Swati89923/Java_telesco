// // static variable 

// package basic_java_codes;
// class Mobile{
//     String brand;
//     int price;
//     static String name = "Smartphone";

//     public void show()
//     {
//         System.out.println(brand+ ":" + price + ":" + name + ":");
//     }
// }
// public class static_keyword{
//     public static void main(String[] args)
//     {
//          Mobile obj1= new Mobile();
//          obj1.brand="Apple";
//          obj1.price =90000;
         

//          Mobile obj2= new Mobile();
//          obj2.brand="Samsung";
//          obj2.price =9000;
         

//          Mobile obj3= new Mobile();
//          obj3.brand="Nokia";
//          obj3.price =900;
         

//          obj1.show();
//          obj2.show();
//          obj3.show();
         
//     }
    
// }

// static method
// static method can be directly used by class name

// package basic_java_codes;
// class Mobile{
//     String brand;
//     int price;
//     static String name = "Smartphone";

//     public void show()
//     {
//         System.out.println(brand+ ":" + price + ":" + name + ":");
//     }
//     public static void show1(Mobile obj)
//     {
//           System.out.println(obj.brand+ ":" + obj.price + ":" + obj.name + ":");
//     }
//     }

// public class static_keyword{
//     public static void main(String[] args)
//     {
//          Mobile obj1= new Mobile();
//          obj1.brand="Apple";
//          obj1.price =90000;
         

//          Mobile obj2= new Mobile();
//          obj2.brand="Samsung";
//          obj2.price =9000;
         

//          Mobile obj3= new Mobile();
//          obj3.brand="Nokia";
//          obj3.price =900;
         

//          obj1.show();
//          obj2.show();
//          obj3.show();
//          Mobile.show1(obj1);
//     }
    
// }

// // Static Block is used to initialiise a sstatic variable
// package basic_java_codes;

// class Mobile {
//     String brand;
//     int price;
//     static String name;

//     // Static block to initialize the static variable
//     static {
//         name = "Smartphone";
//         System.out.println("Static block executed");
//     }

//     public void show() {
//         System.out.println(brand + ":" + price + ":" + name);
//     }
// }

// public class static_keyword{
//     public static void main(String[] args) {
//         Mobile obj1 = new Mobile();
//         obj1.brand = "Samsung";
//         obj1.price = 25000;
//         obj1.show();

//         Mobile obj2 = new Mobile();
//         obj2.brand = "OnePlus";
//         obj2.price = 30000;
//         obj2.show();
//     }
// }


