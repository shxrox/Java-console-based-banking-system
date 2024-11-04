import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = null;

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("5. View Account Details");
            System.out.print("Enter your choice: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    System.out.print("Enter Initial Deposit: ");
                    int initialDeposit = sc.nextInt();
                    bank = new Bank(accNum, initialDeposit);
                    break;
                }
                case 2: {
                    if (bank == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        bank.withdraw(withdrawAmount);
                    }
                    break;
                }
                case 3: {
                    if (bank == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        bank.deposit(depositAmount);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 5:{
                    if(bank == null) {
                        System.out.println("No account found. Please create an account first.");

                    }else {
                        bank.accountDetails();
                    }

                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                    break;
                }
            }
        }
    }
}
