public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
  
    public void checkBalance() {
      System.out.println("Hello!");
      System.out.println("Your balance is " + balance);
    }
  
    public int deposit(int amountToDeposit){
      balance = balance + amountToDeposit;
      System.out.println("You just deposited " + amountToDeposit);
      return balance;
    }
  
    public int withdraw(int amountToWithdraw){
      balance = balance - amountToWithdraw;
      return amountToWithdraw;
    }
  
    // public String toString() {
    //   return String 
    // }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Withdrawing:
      // int afterWithdraw = savings.balance - 300;
      // savings.balance = afterWithdraw;
      savings.withdraw(10);
      System.out.println("You just withdrew "+300);
      
      //Check balance:
      System.out.println("Hello!");
      savings.checkBalance();
      //System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      // int afterDeposit = savings.balance + 600;
      // savings.balance = afterDeposit;
      // System.out.println("You just deposited "+600);
      savings.deposit(500);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit2 = savings.balance + 600;
      savings.balance = afterDeposit2;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
  
      //savings.toString();
      
    }       
  }
  