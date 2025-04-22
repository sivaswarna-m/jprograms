import java.util.Scanner;

interface Transaction {
    void processTransaction();
}

class Account {
    private String accountNumber;
    private String accountType;
    private long balance;
    private int pin;

    public Account(String accountNumber, String accountType, long balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public long getBalance() {
        return balance;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void deposit(long amount) {
        this.balance += amount;
        System.out.println("Deposit successful. Current balance: " + this.balance);
    }

    public boolean withdraw(long amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + this.balance);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Your current balance is: " + this.balance);
    }

    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }
}

class Withdraw implements Transaction {
    private Account account;
    private Scanner scanner;

    public Withdraw(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    @Override
    public void processTransaction() {
        System.out.println("Enter amount to withdraw:");
        long amount = scanner.nextLong();
        if (account.withdraw(amount)) {
            System.out.println("Transaction successful.");
        }
    }
}

class BalanceEnquiry implements Transaction {
    private Account account;

    public BalanceEnquiry(Account account) {
        this.account = account;
    }

    @Override
    public void processTransaction() {
        account.displayBalance();
    }
}

class PinChange implements Transaction {
    private Account account;
    private Scanner scanner;

    public PinChange(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    @Override
    public void processTransaction() {
        System.out.println("Enter your registered phone number:");
        long phoneNumber = scanner.nextLong();
        // In a real system, you would verify the phone number and send an OTP.
        // For this example, we'll simulate a fixed OTP.
        System.out.println("Enter the OTP received (simulated as 14567):");
        int otp = scanner.nextInt();
        if (otp == 14567) {
            System.out.println("Enter new PIN:");
            int newPin = scanner.nextInt();
            System.out.println("Confirm new PIN:");
            int confirmNewPin = scanner.nextInt();
            if (newPin == confirmNewPin) {
                account.changePin(newPin);
            } else {
                System.out.println("PINs do not match. PIN change failed.");
            }
        } else {
            System.out.println("Invalid OTP. PIN change failed.");
        }
    }
}

class MiniStatement implements Transaction {
    private Account account;
    // In a real system, you would fetch and display transaction history.

    public MiniStatement(Account account) {
        this.account = account;
    }

    @Override
    public void processTransaction() {
        System.out.println("Mini statement functionality is not fully implemented in this example.");
        account.displayBalance(); // For this example, we just show the balance.
    }
}

class ATM {
    private Account currentAccount;
    private Scanner scanner;

    public ATM() {
        this.scanner = new Scanner(System.in);
        // In a real system, you would have a way to identify the account
        // based on the inserted card. For this example, we'll create a dummy account.
        this.currentAccount = new Account("123456", "savings", 156356, 1234);
        System.out.println("Card inserted.");
    }

    public boolean authenticateUser() {
        System.out.println("Enter your PIN:");
        int enteredPin = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (currentAccount.verifyPin(enteredPin)) {
            System.out.println("PIN verified successfully.");
            return true;
        } else {
            System.out.println("Invalid PIN.");
            return false;
        }
    }

    public void displayMenu() {
        System.out.println("\nSelect Transaction:");
        System.out.println("1. Withdraw");
        System.out.println("2. Balance Enquiry");
        System.out.println("3. ATM Pin Change");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processOption(int choice) {
        Transaction transaction = null;
        switch (choice) {
            case 1:
                transaction = new Withdraw(currentAccount, scanner);
                break;
            case 2:
                transaction = new BalanceEnquiry(currentAccount);
                break;
            case 3:
                transaction = new PinChange(currentAccount, scanner);
                break;
            case 4:
                transaction = new MiniStatement(currentAccount);
                break;
            case 5:
                System.out.println("Thank you for using the ATM!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }
        if (transaction != null) {
            transaction.processTransaction();
        }
    }

    public void start() {
        if (authenticateUser()) {
            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                processOption(choice);
            } while (choice != 5);
        } else {
            System.out.println("Authentication failed. Please try again.");
        }
    }
}

public class Atm {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}