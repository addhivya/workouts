package Assignment3.Question1;

public class Course {

    private String title;
    private int numberOfStudent;
    private int maxNumberOfStudent;
    private Student[] students;

    public Course(String title) {
        this.title = title;
        this.students = new Student[10];
        this.maxNumberOfStudent = 10;  //Default since it is given as course can have max of 10 students.
        this.numberOfStudent = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public boolean isFull() {
        return this.numberOfStudent >= this.maxNumberOfStudent;
    }

    public void registerStudent(Student student) {
        if (isFull()) {
            System.out.println("Class is full. Cannot Register!!");
            System.out.println("*************************");
        } else {
            students[numberOfStudent] = student;
            numberOfStudent++;
            System.out.println(student.getName() + " is registered to " + this.getTitle());
        }
    }
}
