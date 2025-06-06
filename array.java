// when you want to store manyy variable in one variable
// int num[]={1,34,3}
// int num[] = new int[4] # 4 is the size of the array 

// package basic_java_codes;

// class array {
//     public static void main(String[] args) {
//         int num[]={1,4,7,8,2};
//         num[3]=90; // changing the value at index 3 from 8 to 90
//         System.out.println(num[3]);
//     }
// }


// package basic_java_codes;

// class array {
//     public static void main(String[] args) {
//         int num[]=new int[8]; // there an array of capacity 8 will create and 0 at each index
//         num[4]=3; // we can put value individually index wise
//         System.out.println(num[3]);
//         System.out.println(num[4]);
//     }
// }


// //now I want to print whole array
// package basic_java_codes;

// class array {
//     public static void main(String[] args) {
//         int num[]=new int[8]; // there an array of capacity 8 will create and 0 at each index
//         num[4]=3; // we can put value individually index wise
//         for (int i=0; i<=8; i++)
//         System.out.println(num[i]);
//     }   
// }


// // now i want to make a single array by using 3 array (multi dim array)

// package basic_java_codes;

// class array {
//     public static void main(String[] args) {
//         int nums[][] = new int[3][4];

//         // Fill the array with random values from 0 to 99
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 nums[i][j] = (int)(Math.random() * 100); // Corrected placement of cast
//             }
//         }

//         // Print the array
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// // jagged array

// package basic_java_codes;

// class array {
//     public static void main(String[] args) {
//         int nums[][] = new int[3][]; //jagged

//         nums[0] = new int[3];
//         nums[1] = new int[4];
//         nums[2] = new int[2];

//         // Fill the array with random values from 0 to 99
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 nums[i][j] = (int)(Math.random() * 100); // Corrected placement of cast
//             }
//         }

//         // Print the array
//         for (int i = 0; i < nums.length;  i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



//  // Draawback of array
// // static size, contious adress, searching traverse one by oone, same type of element can be store in one array

// because of collection we can say draawback of Array

// // object representation in array
// package basic_java_codes;
// class Student{
//     int rollno;
//     String name;
//     int marks;
// }
// class array{
//     public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.rollno =1;
//        s1.name="Raushan";
//        s1.marks= 96;
//        Student s2 = new Student();
//        s2.rollno =2;
//        s2.name="Nikhil";
//        s2.marks= 95;
//        Student s3 = new Student();
//        s3.rollno =3;
//        s3.name="Kriti";
//        s3.marks= 92;
//        Student s4 = new Student();
//        s4.rollno = 4;
//        s4.name="Swati";
//        s4.marks= 90;

//        Student studns[] =new Student[4];
//        studns[0] =s1;
//        studns[1]=s2;
//        studns[2]=s3;
//        studns[3]=s4;

//        for(int i =0; i<studns.length; i++)
//        System.out.println(studns[i].name + ":" +studns[i].marks+"  " +studns[i].rollno);
//     }
// }

// for each loop ..... enhanced for  loop

// package basic_java_codes;
// public class array {

//     public static void main(String[] args) {
//         int nums[]=new int[4];
//         nums[0]=1;
//         nums[1]=2;
//         nums[2]=3;
//         nums[3]=4;

//         for (int n :nums)
//         System.out.println(n);
//     }
// }