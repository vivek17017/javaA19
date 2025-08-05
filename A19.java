package assignments;

public class A19 {
    public void driver(){
        SavingAccount s1=new SavingAccount();
        s1.setCustomerName("Vivek");
        s1.setBalance(5000);
        SavingAccount.setRateOfInterest(6.5);
        System.out.println(s1.getCustomerName()+s1.getBalance());
        System.out.println(s1.calculateInterest(3));



    }
}


abstract class Account1{
    private double balance;
    private int accountNo;
    private static double rateOfInterest;
    public void setBalance(double balance){
        this.balance=balance;

    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public static void setRateOfInterest(double rateOfInterest){
        Account1.rateOfInterest=rateOfInterest;
    }
    public static double getRateOfInterest(){
        return rateOfInterest;
    }
    public abstract double calculateInterest(int time);

}
class SavingAccount extends Account1{
    private String customerName;
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double calculateInterest(int time){
        return (getBalance()*Account1.getRateOfInterest()*time)/100;
    }
}