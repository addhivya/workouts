package Code;



    import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Sample {

        public static void main(String[] args) {
            // workWithStacks();
            // workWithSetsAndLists();
            workWithSetsAndLists();

        }

/*        private static void workWithStudentSets() {
            // Set<StudentDetails> students = new HashSet<StudentDetails>();
            Set<StudentDetails> students = new TreeSet<StudentDetails>();
            StudentDetails a = new StudentDetails(100, "John", "Holt");
            StudentDetails b = new StudentDetails(101, "Divya", "Sharma");
            StudentDetails c = new StudentDetails(102, "Siva", "Kumar");
            StudentDetails d = new StudentDetails(100, "John", "Holt");
            students.add(c);
            students.add(b);
            students.add(a);
            students.add(d);
            System.out.println(students);

        }*/

        private static void workWithSetsAndLists() {
            Set<Integer> numbers = null;
            numbers = new HashSet<Integer>();
            System.out.println("HashSet....");
            workWithACollection(numbers);
            System.out.println("LinkedHashSet...");
            workWithACollection(new LinkedHashSet<Integer>());
            System.out.println("TreeSet..");
            workWithACollection(new TreeSet<Integer>());
            System.out.println("ArrayList..");
            workWithACollection(new ArrayList<Integer>());

        }

        private static void workWithACollection(Collection<Integer> numbers) {
            numbers.add(10);
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            System.out.println(numbers);
            numbers.add(40);
            numbers.remove(10);
            System.out.println(numbers);
            numbers.add(10);
            System.out.println(numbers);
        }

        private static void workWithStacks() {
            Stack<Integer> numbers = new Stack<Integer>();
            numbers.push(10);
            numbers.push(20);
            numbers.push(30);
            System.out.println(numbers.peek());
            System.out.println(numbers.pop());
            System.out.println(numbers.peek());
            System.out.println(numbers.size());
        }
    }

