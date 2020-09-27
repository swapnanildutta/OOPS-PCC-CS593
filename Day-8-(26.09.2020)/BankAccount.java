import java.util.Scanner;

public class BankAccount{
    static String name, address, accountNum;
    static double balance;

    //Non parameterized constructor for convenience of initialization
    BankAccount() {
        this.name = null;
        this.address = null;
        this.accountNum = null;
        this.balance = 0.0;
    }

    //Parameterized constructor for account setup
    BankAccount(String name, String address, String accountNum) {
        this.name = name;
        this.address = address;
        this.accountNum = accountNum;
        this.balance = 0.0;
    }

    //Deposit amount to balance
    static void deposit(BankAccount account, double deposit) {
        account.balance+=deposit;
    }

    //Withdraw amount from balance
    static void withdraw(BankAccount account, double withdrawal){
        if (account.balance >= withdrawal){
            account.balance -= withdrawal;
            System.out.printf("Withdrew %.2f from account. Balance left: %.2f",withdrawal,account.balance);
            System.out.println("");
        }
        else{
            System.out.println("Withdrawal not possible, balance too low.");
        }
    }

    //Show account details
    static void showDetails(BankAccount account){
        System.out.println("Name: "+account.name);
        System.out.println("Address: "+account.address);
        System.out.println("Account Number: "+account.accountNum);
        System.out.println("Balance: "+account.balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[10];                                           //Initialize account array
        int pos = 0;                                                                            //Initialize pos of array
        int c=1;                                                                                //Choice variable

        while(c != 0){
            System.out.println("Enter your choice:");
            System.out.println("  1.Create an account\n  2.Use an existing account");
            int choice1 = input.nextInt();
            switch (choice1) {
                case 1:System.out.println("Enter your name: ");                                 //Create a new account
                    name = new Scanner(System.in).nextLine();
                    System.out.println("Enter your address: ");
                    address = new Scanner(System.in).nextLine();
                    accountNum = "112254125"+String.valueOf(pos);
                    accounts[pos] = new BankAccount(name, address, accountNum);
                    System.out.println("------------------------Details------------------------");
                    showDetails(accounts[pos]);
                    pos++;
                    break;

                case 2:System.out.println("Enter the bank account number: ");
                    String number = new Scanner(System.in).nextLine();
                    int flag=0, index=0;
                    for(int i = 0; i < accounts.length; i++){
                        if (accounts[i].accountNum.equals(number) && accounts[i].accountNum != null){
                            flag=1;
                            index=i;
                        }
                    }
                    if(flag == 0){
                        System.out.println("Account Not Found");
                    }
                    else{
                        System.out.println("What do you want to do?");
                            System.out.println("  1.Deposit an amount\n  2.Withdraw an amount\n  3.Show Details");
                            int choice2 = new Scanner(System.in).nextInt();
                            switch (choice2){
                                case 1:System.out.print("Enter your deposit amount: ");
                                    double depositAmount = input.nextDouble();
                                    deposit(accounts[index], depositAmount);
                                    System.out.println("Amount Deposited!");
                                    break;

                                case 2:System.out.print("Enter your withdrawal amount: ");
                                    double withdrawal = input.nextDouble();
                                    withdraw(accounts[index], withdrawal);
                                    break;

                                case 3:showDetails(accounts[index]);
                                    break;
                                
                                case 4:break;
                                default:System.out.println("Invalid input");
                                    break;
                            }
                    }
                    break;
                    
                default:System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you want to continue? Enter 1 for Yes, 0 for No");
            c = input.nextInt();
        }
    }
}