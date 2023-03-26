package chapter3.exercises.c3_exercise4;

//Self-Review Exercise 3.14

public class Date {
    private int day, month, year;

    public Date(int month, int day, int year) {
        this.year = year;
        
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public void displayDate() {
        System.out.printf("\nThe current date is:  %d/%d/%d\n", getMonth(), getDay(),
            (getYear() < 1000 ? 2000 + getYear() : getYear()));
    }

    //set and get methods for day
    public void setDay(int newDay) {
        if (newDay >= 1) {
            day = newDay;
        }
    }

    public int getDay() {
        return day;
    }

    //set and get methods for month
    public void setMonth(int newMonth) {
        if (newMonth >= 1) {
            month = newMonth;
        }
    }

    public int getMonth() {
        return month;
    }

    //set and get methods for year
    public void setYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }
}
