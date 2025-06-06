// ✅ Comparator Interface (Custom Ordering)
// Belongs to: java.util package
// Used when: You want different ways to sort the same class.
// 👉 Key Points:
// You create a separate class or use lambda/anonymous class to define custom sorting.
// You override: public int compare(T obj1, T obj2);


// ✅ Comparable Interface (Natural Ordering)
// Belongs to: java.lang package
// Used when: You want to define default sorting logic in the class itself.
// 👉 Key Points:
// You implement Comparable in the class whose objects need to be sorted.
// You must override the method:


//  ✅ When to use what?
//Use Comparable when:
// You control the class.
// Only one natural/default order is needed.
// Use Comparator when:
// You need multiple sorting criteria.
// You cannot modify the original class (like sorting built-in classes).



// | Feature            | Comparable                     | Comparator                           |
// | ------------------ | ------------------------------ | ------------------------------------ |
// | Package            | `java.lang`                    | `java.util`                          |
// | Method to Override | `compareTo(Object o)`          | `compare(Object o1, Object o2)`      |
// | Sorting Logic      | Defined **inside the class**   | Defined **outside the class**        |
// | Flexibility        | Only one sorting logic allowed | Multiple sorting logics can be used  |
// | Used with          | `Collections.sort(list)`       | `Collections.sort(list, comparator)` |

package basic_java_codes;

import java.util.*;

// Student class
class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Ascending order by name
    }
}

// Main class
public class Comparator_comparable {
    public static void main(String[] args) {
        // Test case list
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Zara"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(5, "Neha"));
        students.add(new Student(2, "Rahul"));
        students.add(new Student(4, "Amit")); // Duplicate name

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by name
        Collections.sort(students, new NameComparator());

        System.out.println("\nAfter Sorting by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
