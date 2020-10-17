import java.util.Scanner;
abstract class Account {
    private String Cus_Name, acc_type;
    private long acc_num;
    private double balance;
   public Account(String nm, String ty, long n, double b) {
        Cus_Name = nm;
        acc_type = ty;
        acc_num = n;
        balance=b;
    }
    public String getName() {
        return Cus_Name;
    }
    public String getType() {
        return acc_type;
    }
    public long getNo() {
        return acc_num;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double n)
    {
        balance=n;
    }
    public void printDetails()
    {
        System.out.println("Customer Details");
        System.out.println("Name-"+Cus_Name+" Account Number-"+acc_num);
        System.out.format("Account type-%s Balance- %.2f\n", acc_type, balance);
    }
    abstract public void deposit();
    abstract public void displayBalance();
    abstract public void computeInterest();
    abstract public void withdraw();
    abstract public void updateBalance();
}
class CurrentAccount extends Account {
    public CurrentAccount(String nm, String ty, long n, double b)
    {
        super(nm, ty, n, b);
    }
    public void deposit() {
        double n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        n=sc.nextDouble();
        setBalance(getBalance()+n);
        computeInterest();
    }
    public void displayBalance() {
        System.out.println("Your current balance- "+getBalance());
    }
    public void computeInterest()
    {
    }
    public void withdraw() {
        displayBalance();
        System.out.println("Enter the amount to be withdrawn");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(Double.compare(getBalance(), n)>0)
        {
            setBalance(getBalance()-n);
            updateBalance();
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void updateBalance()
    {
        if(getBalance()<1000)
        {
            setBalance(getBalance()-100);
        }
    }
}
class SavingsAccount extends Account{
    public SavingsAccount(String nm, String ty, long n, double b) {
        super(nm,ty,n,b);
        computeInterest();
    }
    public void deposit() {
        double n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        n=sc.nextDouble();
        setBalance(getBalance()+n);
        computeInterest();
    }
    public void displayBalance() {
        System.out.println("Your current balance- "+getBalance());
    }
    public void computeInterest()
    {
        double t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time");
        t=sc.nextDouble();
        setBalance(getBalance()*Math.pow((1+0.096), t));
    }
    public void withdraw() {
        displayBalance();
        System.out.println("Enter the amount to be withdrawn");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(Double.compare(getBalance(), n)>0)
        {
            setBalance(getBalance()-n);
            updateBalance();
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void updateBalance()
    {
    }
}
class TestAccount{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ncus;
        System.out.println("Enter the number of customers");
        ncus=sc.nextInt();
        Account ac[]=new Account[ncus];
        for(int i=0;i<ncus;i++)
        {
            String name, type;
            long ano;
            double bal;
            System.out.println("Enter the details of Customer "+(i+1));
            System.out.println("Name");
            name=sc.next();
            System.out.println("Account Number");
            ano=sc.nextLong();
            System.out.println("Account Type");
            type=sc.next();
            System.out.println("Current Balance");
            bal=sc.nextDouble();
            switch(type)
            {
                case "Savings":
                {
                    ac[i]=new SavingsAccount(name, type, ano, bal);
                    break;
                }
                case "Current":
                {
                    ac[i]=new CurrentAccount(name, type, ano, bal);
                }
            }
        }
        while(true)
        {
            System.out.println("Options");
            System.out.println("1. Print Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            int c=sc.nextInt();
            int chk=0;
            switch(c)
            {
                case 1:
                {
                    System.out.println("Account Number");
                    long num=sc.nextLong();
                    int index=-1;
                    for(int j=0;j<ncus;j++)
                    {
                        if(ac[j].getNo()==num)
                        {
                            index=j;
                            break;
                        }
                    }
                    if(index==-1)
                    {
                        System.out.println("Invalid Account Number");
                    }
                    else
                    {
                        ac[index].printDetails();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Account Number");
                    long num=sc.nextLong();
                    int index=-1;
                    for(int j=0;j<ncus;j++)
                    {
                        if(ac[j].getNo()==num)
                        {
                            index=j;
                            break;
                        }
                    }
                    if(index==-1)
                    {
                        System.out.println("Invalid Account Number");
                    }
                    else
                    {
                        ac[index].deposit();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Account Number");
                    long num=sc.nextLong();
                    int index=-1;
                    for(int j=0;j<ncus;j++)
                    {
                        if(ac[j].getNo()==num)
                        {
                            index=j;
                            break;
                        }
                    }
                    if(index==-1)
                    {
                        System.out.println("Invalid Account Number");
                    }
                    else
                    {
                        ac[index].withdraw();
                    }
                    break;
                }
                case 4:
                {
                    chk=1;
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
            if(chk==1)
            {
                break;
            }
        }
    }
}