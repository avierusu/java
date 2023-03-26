package personal.quadratic_calculator;

public class ComplexNumber {
    private double realNum;
    private double imaginaryNum;

    public ComplexNumber(double a, double b) {
        realNum = a;
        imaginaryNum = b;
    }

    //set and get methods
    public double getRealNum() {
        return realNum;
    }

    public double getImaginaryNum() {
        return imaginaryNum;
    }

    public void setRealNum(double a) {
        realNum = a;
    }

    public void setImaginaryNum(double b) {
        imaginaryNum = b;
    }

    public void add(int num) {
        setRealNum(getRealNum() + num);
    }

    public void subtract(int num) {
        setRealNum(getRealNum() - num);
    }

    public void multiply(int num) {
        setRealNum(getRealNum() * num);
        setImaginaryNum(getImaginaryNum() * num);
    }

    public void divide(int num) {
        setRealNum(getRealNum() / num);
        setImaginaryNum(getImaginaryNum() / num);
    }

    @Override
    public String toString() {
        if(getRealNum() == 0) {
            if(getImaginaryNum() == 0) {
                return "0";
            } else {
                return String.format("%.3fi", getImaginaryNum());
            }
        } else {
            if(getImaginaryNum() == 0) {
                return String.format("%.3f", getRealNum());
            } else {
                return String.format("%.3f %s %.3fi", getRealNum(), (getImaginaryNum() > 0 ? "+" : "-"), Math.abs(getImaginaryNum()));
            }
        }
    }
}
