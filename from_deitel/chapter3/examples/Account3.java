package chapter3.examples;

public class Account3 {
    private String name;
    private double balance;

    //Constructor
    public Account3(String name, double balance) {
        this.name = name;

        //valid balance?
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
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
