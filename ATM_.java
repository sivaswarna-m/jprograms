import java.util.Scanner;

interface Transaction//interface
{
	 void processTransaction();//abstract
}

class Account
{
    private String accountNumber;
   private String accountType;
  private  long balance;
    private int pin;

    public Account(String accountNumber, String accountType, long balance, int pin) 
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber()//getter-encapsulation
    {
        return accountNumber;
    }

    public String getAccountType() 
    {
        return accountType;
    }

    public long getBalance() 
    {
        return balance;
    }

    public boolean verifyPin(int enteredPin)
    {
        return this.pin == enteredPin;
    }

    public boolean withdraw(long amount)
    {
        if (this.balance >= amount) 
        {
            this.balance -= amount;
            System.out.println("Withdrawal successful Current balance: " + this.balance);
            return true;
        } 
	else
        {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public void displayBalance() 
   {
        System.out.println("Your current balance is: " + this.balance);
    }

    public void changePin(int newPin)
    {
        this.pin = newPin;
        System.out.println("PIN changed successfully");
    }
}

class Withdraw implements Transaction//inheritance
{
    private Account account;
    private Scanner scanner;

    public Withdraw(Account account, Scanner scanner)//constructor
    {
        this.account = account;
        this.scanner = scanner;
    }

    @Override
    public void processTransaction() //poly morphism
     {
        System.out.println("Enter amount to withdraw:");
        long amount = scanner.nextLong();
        if (account.withdraw(amount)) 
	{
		
            System.out.println("Transaction successful");
        }
    }
}

class BalanceEnquiry implements Transaction 
{
    private Account account;

    public BalanceEnquiry(Account account) 
    {
        this.account = account;
    }

    @Override
    public void processTransaction()
    {
        account.displayBalance();
    }
}

class PinChange implements Transaction
{
    private Account account;
    private Scanner scanner;

    public PinChange(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }
	public void call()
	{
		System.out.println("Enter new PIN:");
            int newPin = scanner.nextInt();
            System.out.println("Confirm new PIN:");
            int confirmNewPin = scanner.nextInt();
            if (newPin == confirmNewPin) 
            {
                account.changePin(newPin);
            } 
            else 
            {
                System.out.println("enter a matching pin");
			 call();//recursion
            }
	}

    @Override
    public void processTransaction()
     {
        System.out.println("Enter your registered phone number:");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter the OTP received (338413)");
        int otp = scanner.nextInt();
        if (otp == 338413)
        {
		call();
        } 
        else
        {
            System.out.println("Invalid Otp");
		processTransaction();
        }
    }
}
class MiniStatement implements Transaction
{
    private Account account;
    private Scanner scanner;
        public MiniStatement(Account account)
        {
        this.account = account;
	this.scanner=scanner;
        }
	
    @Override
    public void processTransaction()
    {
	/*long amount = scanner.nextLong();
	if(account.withdraw(amount)==false)
	{ */
        System.out.println("Mini statement ");
	System.out.println("your current balance is :67358");
	System.out.println("your  current balance is :57657");
	System.out.println("your  current balance is :98896");
	System.out.println("your  current balance is :45428");
        account.displayBalance();
	/*}
	else
	{
		System.out.println("Mini statement can not be generated ");
	}*/
    }
}

class ATM 
{
    private Account currentAccount;
    private Scanner scanner;

    public ATM()
    {
        this.scanner = new Scanner(System.in);
        this.currentAccount = new Account("123456", "savings", 156356, 3384);
        System.out.println("insert the card");
	System.out.println("card inserted successfully");
    }

    public boolean authenticateUser() 
    {
        System.out.println("Enter PIN:");
        int enteredPin = scanner.nextInt();                                                                                                                                                                                                                                                                                                         
        scanner.nextLine();
        if (currentAccount.verifyPin(enteredPin)) 
        {
            System.out.println("PIN verified successfully");
            return true;
        }
        else 
        {
            System.out.println("Invalid PIN");
           return authenticateUser();//recursion
        }
    }

    public void displayMenu() 
    {
        System.out.println("\nSelect Transaction:");
        System.out.println("1. Withdraw");
        System.out.println("2. Balance Enquiry");
        System.out.println("3. ATM Pin Change");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processOption(int choice) 
    {
        Transaction transaction = null;
        switch (choice) 
        {
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
                System.out.println("you are exited successfully");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
       if (transaction != null)
        {
            transaction.processTransaction();
        }
    }

    public void process() 
      {
        if (authenticateUser())
        {
            int choice;
            do
	    {
                displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine(); 
                processOption(choice);
            } while (choice != 5);
        } 
	else 
	{
            System.out.println("entered wrong pin");
        }
    }
}

public class ATM_
   {
    public static void main(String[] args)
    {
        ATM atm = new ATM();
        atm.process();
    }
}