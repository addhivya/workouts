package Assignment2;

public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double salary = employee.salary;
        double sSTax = 0.0;
        if (salary <= 8900) {
            sSTax = (salary * 6.2) / 100;
        } else {
            sSTax = (106800 * 6.2) / 100;
        }
        System.out.println("Social Security tax of " + employee.name + " is " + sSTax);
        return sSTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
        double insurance=0.0;
        if (employee.age < 35) {
             insurance = (employee.salary * 3) / 100;
        } else if (employee.age > 34 && employee.age < 51) {
            insurance = (employee.salary * 4) / 100;
        } else if (employee.age > 50 && employee.age < 60) {
            insurance = (employee.salary * 5) / 100;
        } else if (employee.age > 59) {
            insurance = (employee.salary * 6) / 100;
        }
        System.out.println("Insurance Coverage for "+employee.name+ " with age "+employee.age+ " is " +insurance);
        return insurance;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        double min = e1.salary;
        if (e1.salary < e2.salary) {
            sortSalarySecond(e2, e1, e3);
        } else {
            sortSalarySecond(e1, e2, e3);
        }
    }

    private void sortSalarySecond(Employee e1, Employee e2, Employee e3) {
        if (e2.salary < e3.salary) {
            if (e1.salary < e3.salary) {
                printEmployees(e2, e1, e3);
            } else {
                printEmployees(e2, e3, e1);
            }
        } else {
            printEmployees(e3, e2, e1);
        }
    }

    private void printEmployees(Employee e1, Employee e2, Employee e3) {
        System.out.println(e1.name + " " + e2.name + " " + e3.name);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
        double per = 300;
        employee.raiseSalary(per);
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     a and b reference(address) is passed to x and y through swap method. In swap method, initially x and a is pointing
     to same address and b and y is pointing to same address. After swap, x is pointing to b's address and y is
     pointing to a's address. So x and y reference location is changed and a and b reference still remain the same in
     main method. So a.getName will still get Jenny and b.getName will be getting John.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
         Employee temp = x;
         x = y;
         y = temp;
    }
}

