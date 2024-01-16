package SumCalculator;

public class Number {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void getAdditionResult(){
      double  summ = 0 ;
        summ = secondNumber + firstNumber;
        System.out.println(summ);

    }
}
