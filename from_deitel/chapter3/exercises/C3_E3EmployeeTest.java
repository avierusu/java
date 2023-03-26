package chapter3.exercises;

//Self-Review Exercise 3.13

public class C3_E3EmployeeTest {
    public static void main(String[] args) {
        Exercise3Employee employee1 = new Exercise3Employee("Billy", "Bob", 50);
        Exercise3Employee employee2 = new Exercise3Employee("NotBilly", "NotBob", 100);

        System.out.printf("%s\n%s\n", employee1.toString(), employee2.toString());

        System.out.printf("\n%s's yearly salary is: $%.2f\n%s's yearly salary is: $%.2f\n",
            employee1.getFullName(), (employee1.getSalary() * 12), employee2.getFullName(), (employee2.getSalary() * 12));
        //a

        System.out.printf("\nAfter a 10 percent raise for both employees, \n%s's yearly salary is: $%.2f\n%s's yearly salary is: $%.2f\n",
            employee1.getFullName(), (employee1.getSalary() * 12 * 1.1), employee2.getFullName(), (employee2.getSalary() * 12 * 1.1));
        //a
    }
}
