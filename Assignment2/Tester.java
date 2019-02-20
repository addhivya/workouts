package Assignment2;

import Assignment2.Assignment2;

public class Tester {

    public static void main(String[] args) {
        Assignment2 assignment=new Assignment2();
        Employee emp1 = new Employee("Divya", 59, Gender.FEMALE, 8900);
        assignment.socialSecurityTax(emp1);
        assignment.insuranceCoverage(emp1);
        Employee emp2 = new Employee("Naveen", 25, Gender.MALE, 800);
        Employee emp3 = new Employee("Rachna", 59, Gender.FEMALE, 8901);
        assignment.sortSalary(emp1,emp2,emp3);
        assignment.tripleSalary(emp1);
    }
}
