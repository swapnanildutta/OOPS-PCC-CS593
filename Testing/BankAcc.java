public class BankAcc
{
    String name;
    String address;
    int accno;
    double balance;

    BankAcc(String name, String address,int accno){
        this.name=name;
        this.address=address;
        this.accno=accno;
        this.balance=0;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount)
    {
        if((balance-amount)>0)
            balance=balance-amount;
        else
            System.out.println("Amount cannot be withdrawn");
    }
    void display()
    {
        System.out.println("Customer:"+name);
        System.out.println("Address:"+address);
        System.out.println("Account number:"+accno);
        System.out.println("Account balance:"+balance);
    }
    public static void main(String[] args) 
    {
        BankAcc b1=new BankAcc("ABC","XYZ",1677);
        BankAcc b2=new BankAcc("CDE","MNO",1234);
        b1.deposit(15000);
        b2.deposit(10000);
        b1.withdraw(5000);
        b2.withdraw(9000);
        b1.display();
        b2.display();
    }
}