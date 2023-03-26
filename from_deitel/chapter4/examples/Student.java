package chapter4.examples;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        setAverage(average);
    }

    @Override
    public String toString() {
        return String.format("%s's average grade is %.2f\n%s's letter grade is %s\n",
            getName(), getAverage(), getName(), getLetterGrade());
    }

    //set and get methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //set and get methods for average
    public void setAverage(double newAverage) {
        if(newAverage > 0.0 && newAverage <= 100.0) {
            average = newAverage;
        }
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "";

        if (average >= 90) {
            letterGrade = "A";
        }else if (average >= 80) {
            letterGrade = "B";
        }else if (average >= 70) {
            letterGrade = "C";
        }else if (average >= 60) {
            letterGrade = "D";
        }else {
            letterGrade = "F";
        }

        return letterGrade;
    }
}
