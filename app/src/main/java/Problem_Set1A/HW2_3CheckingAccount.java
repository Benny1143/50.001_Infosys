package Problem_Set1A;

public class HW2_3CheckingAccount {
    public static void main(String[] args) {

        CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);

        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
    }

}

class CheckingAccount extends Account{
    CheckingAccount() {

    }
    CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    @Override
    public void withdraw(double money) {
        if (getBalance() - money < -5000) {
            System.out.println("over limit");
        } else {
            super.withdraw(money);
        }
    }
}