// package basic_java_codes;
// class calculator
// {
//         public int sum(int n1,int n2){
//         int r = n1+n2;
//         return r;
//         }
//         public int diff(int n1,int n2){
//         int r=n1-n2;
//         return r;
//         }
//         public int mul(int n1, int n2){
//         int r = n1*n2;
//         return r;
//         }
//         public int div(int n1, int n2){
//         int r = n1  % n2;
//         return r;

//         }
//     }


// public class practice 
//     {
        
//     public static void main(String[] args) {
//     int num1 = 7;
//     int num2 = 9;
//     calculator calc= new calculator();
//     System.out.println(calc.sum(num1,num2));
//     System.out.println(calc.diff(num1,num2));
//     System.out.println(calc.mul(num1,num2));
//     System.out.println(calc.div(num1,num2));
//     }
// }



// Encapsulation

// package basic_java_codes;
// class PHONE
// {
//     int price ;
//     private String brand;
//     String username;
    
//     public interest_calculation_on_emi void(String n)
//     int interest = 0.1*price;
//     int interest_after_releif =0.05 *price;
    
// }

// public class practice {
//          public static void main(String[] args) {
//           PHONE obj1= new PHONE();
//           obj1.price=67000;
//           obj1.brand="Samsung";
//           obj1.username="Raushan";  

//           System.out.println(obj1.price + obj1.interest +obj1.interest_after_releif);
//          }
     
// }


// // package basic_java_codes;

// class PHONE {
//     int price;
//     private String brand;
//     String username;
//     double interest;
//     double interest_after_releif;

//     // Correct method syntax
//     public void interest_calculation_on_emi(String n) {
//         interest = 0.1 * price;
//         interest_after_releif = 0.05 * price;
//     }

//     // Optional: method to access private brand if needed
//     public void setBrand(String b) {
//         brand = b;
//     }

//     public String getBrand() {
//         return brand;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         PHONE obj1 = new PHONE();
//         obj1.price = 67000;
//         obj1.setBrand("Samsung"); // Cannot access private directly
//         obj1.username = "Raushan";

//         obj1.interest_calculation_on_emi(obj1.username);

//         System.out.println(obj1.price + obj1.interest + obj1.interest_after_releif);
//     }
// }


// package basic_java_codes;

// class PHONE {
//     int price;
//     private String brand;
//     String username;
//     double interest;
//     double interest_after_releif;

//     // Correct method syntax
//     public void interest_calculation_on_emi(String n) {
//         interest = 0.1 * price;
//         interest_after_releif = 0.05 * price;
//     }

//     // Optional: method to access private brand if needed
//     public void setBrand(String b) {
//         brand = b;
//     }

//     public String getBrand() {
//         return brand;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         PHONE obj1 = new PHONE();
//         obj1.price = 67000;
//         obj1.setBrand("Samsung"); // Cannot access private directly
//         obj1.username = "Raushan";

//         obj1.interest_calculation_on_emi(obj1.username);

//         System.out.println(obj1.price + obj1.interest + obj1.interest_after_releif);
//     }
// }
