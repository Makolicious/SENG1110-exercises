import java.util.*;

public class BankAccountManager {

static Scanner console = new Scanner(System.in);

public static void main (String[] args) 
{
    BankAccount account = new BankAccount();
    int option;
    double amount;
    String name, idNumber;
    
    System.out.println("Please enter your name: ");
    name = console.nextLine();
    System.out.println("Please enter your ID number: ");
    idNumber = console.nextLine();
    do {
        System.out.println("Balance(0), Deposit(1), Withdrawal(2), Exit (9): ");
        option = console.nextInt();
        switch(option)
        {
            case 0: checkBalance(account,name,idNumber);
                    break;
            case 1: System.out.println("Amount: ");
                    amount = console.nextDouble();
                    makeDeposit(account,amount,name,idNumber);
                    break;
            case 2: System.out.println("Amount: ");
                    amount = console.nextDouble();
                    makeWithdrawal(account,amount,name,idNumber);
                    break;
            case 9: break;
            default: System.out.println("invalid option");
        }
    }
        while(option!=9);
}
   private static void checkBalance(BankAccount account, String name, String idNumber)
   {
      System.out.println("balance for "+account.getName(name, idNumber)+" = "+account.getBalance());
   }
   private static void makeDeposit(BankAccount account, double amount, String name, String idNumber)
   {
   
     String result = account.getName(name, idNumber)+"\n"+account.deposit(amount);
     System.out.println(result);
   }

   private static void makeWithdrawal(BankAccount account, double amount, String name, String idNumber)
   {
      String result = account.getName(name, idNumber)+"\n"+account.withdraw(amount);
      System.out.println(result);
   }
}
