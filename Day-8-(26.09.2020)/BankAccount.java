import java.util.Scanner;

public class BankAccount{
    static String name, address, accountNum;
    static double balance;

    BankAccount() {
        this.name = "";
        this.address = "";
        this.accountNum = "";
        this.balance = 0.0;
    }
    BankAccount(String name, String address, String accountNum) {
        this.name = name;
        this.address = address;
        this.accountNum = accountNum;
        this.balance = 0.0;
    }

    static void deposit(BankAccount account, double deposit) {
        account.balance+=deposit;
    }

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

    static void showDetails(BankAccount account){
        System.out.println("Name: "+account.name);
        System.out.println("Address: "+account.address);
        System.out.println("Account Number: "+account.accountNum);
        System.out.println("Balance: "+account.balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int c=1;

        while(c != 0){
            System.out.println("Enter your choice:");
            System.out.println("  1.Create an account\n  2.Deposit an amount\n  3.Withdraw an amount\n  4.Show Details");
            int choice = input.nextInt();
            switch (choice) {
                case 1:System.out.println("Enter your name: ");
                    name = new Scanner(System.in).nextLine();
                    System.out.println("Enter your address: ");
                    address = new Scanner(System.in).nextLine();
                    accountNum = "112254125";
                    account = new BankAccount(name, address, accountNum);
                    break;
                
                case 2:System.out.println("Enter the account number: ")
                    accountNumber = new Scanner(System.in).nextLine();
                    System.out.print("Enter your deposit amount: ");
                    double depositAmount = input.nextDouble();
                    deposit(account, depositAmount);
                    System.out.println("Amount Deposited!");
                    break;

                case 3:if(account.accountNum == ""){
                        System.out.println("Create account before withdrawing.");
                        break;
                    }
                    System.out.print("Enter your withdrawal amount: ");
                    double withdrawal = input.nextDouble();
                    withdraw(account, withdrawal);
                    break;

                case 4:if(account.accountNum == ""){
                        System.out.println("Create account before displaying.");
                        break;
                    }
                    showDetails(account);
                    break;

                default:System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you want to continue? Enter 1 for Yes, 0 for No");
            c = input.nextInt();
        }
    }
}