public class BankAccountClient{
   public static void main(String args[]){
      BankAccount B1 = new BankAccount("Shreyas", 13);
      B1.deposit(500);
      System.out.println(B1);
      B1.withdraw(300);
      System.out.println(B1);
      BankAccount B2 = new BankAccount();
      System.out.println(B2);
      B2.setName("Varun Dhawan");
      B2.setBalance(1234567890);
      System.out.println(B2);
   }
}