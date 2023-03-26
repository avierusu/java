package chapter3.exercises;

//Self-Review Exercise 3.12

public class Exercise2Invoice {
    private String number, description; //part number and desc
    private int quantity; //# of items being produced
    private double price; //price per item

    public Exercise2Invoice(String number, String desc, int quant, double cost) {
        this.number = number;
        description = desc;
        
        if (quant >= 0) {
            quantity = quant;
        } else {
            quantity = 0;
        }
        if (cost >= 0) {
            price = cost;
        } else {
            price = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("\tPart number: %s\n\tDescription: %s\n\tQuantity: %d\n\tPrice per item: $%.2f",
            getPartNumber(), getDesc(), getQuantity(), getPrice());
    }

    //set and get methods for number
    public void setPartNumber(String newNumber) {
        number = newNumber;
    }

    public String getPartNumber() {
        return number;
    }

    //set and get methods for description
    public void setDesc(String newDesc) {
        description = newDesc;
    }

    public String getDesc() {
        return description;
    }

    //set and get methods for quantity
    public void setQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    //set and get methods for price

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        }
    }

    public double getPrice() {
        return price;
    }

    //calculates quantity * price/item
    public double getInvoiceAmount() {
        return (quantity * price);
    }
}
