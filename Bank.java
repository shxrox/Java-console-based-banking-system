public class Bank {
    private int accNum;
    private int balance;

    public Bank(int accNum, int initialDeposit) {
        this.accNum = accNum;
        this.balance = initialDeposit;
        System.out.println("Account created successfully with number: " + accNum);
        System.out.println("Initial deposit is: " + initialDeposit);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current Balance: " + balance);
        } else if (amount < 0) {
            System.out.println("Amount cannot be negative.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: " + balance);
        }
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative.");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount + ". New Balance: " + balance);
        }
    }

    public void accountDetails() {
        System.out.println("Account number is " + accNum);
        System.out.println("Account balance is: " + balance);
    }
}
