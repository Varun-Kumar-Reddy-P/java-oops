public class BankAccount{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName; 
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited: "+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawn: "+ amount);
        }
        else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String []args){
        
        BankAccount account = new BankAccount(12345679L, "Varun", 5000);

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Current balance: "+account.getBalance());
    }
}
