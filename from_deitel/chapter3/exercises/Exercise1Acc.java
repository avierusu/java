package chapter3.exercises;

//Self Review Exercise 3.11

public class Exercise1Acc {
    private String name;
    private double balance;

    //Constructor
    public Exercise1Acc(String name, double balance) {
        this.name = name;

        //valid balance?
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    @Override
    public String toString() {
        return String.format("%s's balance: $%.2f", getName(), getBalance());
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withdraw(double withdrawal) {
        if (withdrawal < balance) {
            balance = balance - withdrawal;
            System.out.printf("\n$%.2f has been withdrawn from %s\n", withdrawal, getName());
        } else {
            System.out.printf("\n$%.2f is more than your current balance ($%.2f), and\ncannot be withdrawn\n",
                withdrawal, getBalance());
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
