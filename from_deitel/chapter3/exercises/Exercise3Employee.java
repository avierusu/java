package chapter3.exercises;

//Self-Review Exercise 3.13

public class Exercise3Employee {
    private String firstName, lastName;
    private double monthlySalary;

    public Exercise3Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;

        if (salary >= 0) {
            monthlySalary = salary;
        } else {
            monthlySalary = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s's monthly salary is $%.2f",
            getFullName(), getSalary());
    }

    public String getFullName() {
        return String.format("%s %s", getFName(), getLName());
    }

    //set and get methods for firstName
    public void setFName(String newFName) {
        firstName = newFName;
    }

    public String getFName() {
        return firstName;
    }

    //set and get methods for lastName
    public void setLName(String newLName) {
        firstName = newLName;
    }

    public String getLName() {
        return lastName;
    }

    //set and get methods for monthlySalary
    public void setSalary(double newSalary) {
        monthlySalary = newSalary;
    }

    public double getSalary() {
        return monthlySalary;
    }
}
