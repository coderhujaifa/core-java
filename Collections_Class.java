package Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define Student class
class Student implements Comparable<Student> {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNo, o.rollNo);
    }

    @Override
    public String toString() {
        return name + " (" + rollNo + ")";
    }
}

public class Collections_Class {

    public static void main(String[] args) {

        // Student List
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Subhan", 2));
        studentList.add(new Student("Zaid", 4));
        studentList.add(new Student("Sohel", 3));
        studentList.add(new Student("Wqas", 1));

        Student s1 = new Student("Subhan", 2);
        Student s2 = new Student("Sohel", 3);

        System.out.println("Compare s1 to s2 (by rollNo): " + s1.compareTo(s2));

        System.out.println("Original Student List:");
        System.out.println(studentList);

        // Sort students by name
        Collections.sort(studentList, Comparator.comparing(st -> st.name));

        System.out.println("Sorted by Name:");
        System.out.println(studentList);

//        // Integer List
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(34);
//        numberList.add(12);
//        numberList.add(9);
//        numberList.add(9);
//        numberList.add(9);
//        numberList.add(76);
//        numberList.add(29);
//        numberList.add(75);
//
//        System.out.println("\nMin element: " + Collections.min(numberList));
//        System.out.println("Max element: " + Collections.max(numberList));
//        System.out.println("Frequency of 9: " + Collections.frequency(numberList, 9));
//
//        Collections.sort(numberList, Comparator.reverseOrder());
//        System.out.println("Sorted in Descending Order:");
//        System.out.println(numberList);
    }
}
