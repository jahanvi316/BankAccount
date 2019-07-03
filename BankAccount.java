public class BankAccount{
   private String name;
   private double balance;
   
   public BankAccount(){
      name = null;
      balance = 0.0;
   }
   
   public BankAccount(String setName, double intBal){
      name = setName;
      balance = intBal;
   }
   
   public void deposit(double amount){
      balance = balance + amount;
   }
   
   public void withdraw(double amount){
      balance = balance - amount;
   }
   
   public String toString(){
      return name + "," + balance;
   }
   
   public double getBalance(){
      return balance;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String newName){
       name = newName;
   }
   
   public void setBalance(double newBalance){
      balance = newBalance;
   }
}