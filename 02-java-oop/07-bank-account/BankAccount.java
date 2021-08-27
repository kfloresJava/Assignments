import java.util.*;
public class BankAccount {
    private double checkingBalance, savingsBalance;
    private static int membersCount=0;
    private static double totalCash=0;
    private String AccountNumber;
    public BankAccount()
    {
        membersCount++;
        AccountNumber=generateRandom();
    }
    private String generateRandom()
    {
        String myvxl="";
        for(int i=0;i<10;i++)
        {
            Random randx= new Random();
            myvxl=myvxl+randx.nextInt(9);
        }
       
        return myvxl;
    }

    public double getcheckingBalance()
    {
        return this.checkingBalance;
    }
    public double getSavingsBalance()
    {
        return this.savingsBalance;
    }
    
    public void depositSavingsBalance(double value)
    {
        this.savingsBalance+=value;
        totalCash+=value;
    }
    public void depositCheckingBalance(double value)
    {
        this.checkingBalance+=value;
        totalCash+=value;
    }

    public void withdrawSavingsBalance(double value)
    {
        this.savingsBalance-=value;
        totalCash-=value;
    }
    public void withdrawCheckingBalance(double value)
    {
        this.checkingBalance-=value;
        totalCash-=value;
    }

    public  void showAllMoney()
    {
        System.out.println(totalCash);
    }
    public void showAccount()
    {
        System.out.println(AccountNumber);
    }
    public void members()
    {
        System.out.println(membersCount);
    }
}
