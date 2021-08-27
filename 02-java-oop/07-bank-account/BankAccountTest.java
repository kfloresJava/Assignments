public class BankAccountTest {
    public static void main(String[]args)
    {
        BankAccount myAcc= new BankAccount();
        myAcc.depositCheckingBalance(2500);
        myAcc.depositSavingsBalance(2500);
        myAcc.withdrawSavingsBalance(1000);
        myAcc.showAllMoney(); 
        myAcc.showAccount(); 
    }
}
