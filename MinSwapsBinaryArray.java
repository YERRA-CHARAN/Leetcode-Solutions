class Account {
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    public Account(String name, long accNo, double bal) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = bal;
    }
    public void showdetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        
    }

    // Common method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {

    double interestRate = 5.0;

    public SavingsAccount(String name, long accNo, double bal) {
        super(name, accNo, bal);
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
    
    
}
class CurrentAccount extends Account {

    double overdraftLimit = 1000;

    public CurrentAccount(String name, long accNo, double bal) {
        super(name, accNo, bal);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Limit exceeded!");
        }
    }
}

 class Main{
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("Charan", 1018440488, 1000);
        s.showdetails();
        s.deposit(500);
        s.addInterest();
        s.showBalance();

        System.out.println("************************");

        CurrentAccount c = new CurrentAccount("Kailash", 102, 2000);
        s.deposit(500);
        c.withdraw(2500);
        c.showBalance();
        s.deposit(500);

    }
}

//dsa
public class MinSwapsBinaryArray {

    public static int minSwaps(int[] arr) {
        int n = arr.length;

        // Count total number of 0s
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) zeroCount++;
        }

        // Case 1: 0s on left → count misplaced 1s
        int misplacedOnes = 0;
        for (int i = 0; i < zeroCount; i++) {
            if (arr[i] == 1) misplacedOnes++;
        }

        // Case 2: 1s on left → count misplaced 0s
        int misplacedZeros = 0;
        for (int i = 0; i < n - zeroCount; i++) {
            if (arr[i] == 0) misplacedZeros++;
        }

        return Math.min(misplacedOnes, misplacedZeros);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1};
        System.out.println(minSwaps(arr));
        System.out.println("length of arr is: " + " " +arr.lencgth); // Output: 7
    }
}
class cal { 
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        cal obj = new cal();
        obj.add(10, 20);
    }
}