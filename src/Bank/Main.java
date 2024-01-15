package Bank;

public class Main {
    public static void main(String[] args) {
        Account alexAccount = new Account();
        alexAccount.setAccount_Number(1234);
        alexAccount.setPhoneNumber(123456789);
        alexAccount.withdrawFunds(100.0);
        alexAccount.depositAmount(2000);
        alexAccount.withdrawFunds(10);
        alexAccount.depositAmount(10);
        alexAccount.withdrawFunds(2000);
        System.out.println(alexAccount.getPhoneNumber());
    }

}
