package Assignment2;

/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question.
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        this.name=name;
    }

    public void raiseSalary(double byPercent)
    {
       this.salary= (salary*byPercent)/100;
       System.out.println("New salary after raise : "+this.salary);
    }

}
