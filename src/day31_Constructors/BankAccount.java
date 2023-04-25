package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
}
