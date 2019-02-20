package Assignment3.Question1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 12; i++) {
            list.add(new Student("Divya" + i, 100 + i));
        }
        Course c1 = new Course("Learning Java");
        for (int i = 0; i < 11; i++) {
            c1.registerStudent(list.get(i));
        }
        Student[] students = c1.getStudents();
        System.out.println("Getting students registered!!");
        System.out.println("*************************");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
        }
    }
}
