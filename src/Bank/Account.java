package Bank;

public class Account {
    private int account_Number;
    private double account_Balance;
    private String name;
    private String email;
    private int phoneNumber;

    public int getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(int account_Number) {
        this.account_Number = account_Number;
    }

    public double getAccount_Balance() {
        return account_Balance;
    }

    public void setAccount_Balance(double account_Balance) {
        this.account_Balance = account_Balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositAmount(double depositAmount){
        account_Balance += depositAmount;
        System.out.println("Deposit amount " + depositAmount + "$" + " Now the account Balance is " + account_Balance + "$");
    }
    public void withdrawFunds (double withdrawalAmount){
        if (account_Balance - withdrawalAmount <0) {
            System.out.println("You can't withdraw this amount cause you only have" + account_Balance);
        }else{
                account_Balance -=  withdrawalAmount;
                System.out.println("withdraw amout " + withdrawalAmount + "$" + " Now the account Balance is " + account_Balance + "$");
            }
    }
}
