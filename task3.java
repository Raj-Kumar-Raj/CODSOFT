
import java.util.Scanner;



class bankAccount{
    private int balance;
   public bankAccount(int intialAmount){
    this.balance = intialAmount;
   }

   public int balance(){
    return balance;
   }

   public void deposite(int amount){
    if(amount>0){
        balance +=amount;
        System.out.println(amount+"Rs  Deposit successfull ");
    }
    else{
        System.out.println("Enter the valid amount (amount must above 0) ");
    }
   }
 public void withdraw (int amount){
    if(amount >0 && amount <= balance){
        System.out.println(amount+"Rs Withdraw Successfull");
        balance -=amount;
    }
    else{
        System.out.println("Insuffucient balance");
    }
}
}

class ATM{
    private bankAccount account;
    public ATM(bankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance ");
        System.out.println("4. exit");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("select an option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to deposite ");
                    int depositAmount = sc.nextInt();
                    account.deposite(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("current account balance "+account.balance());
                    break;
                case 4:
                    System.out.println("COLLECT YOUR ATM CARD.");
                    System.out.println("!! THANK YOU FOR USING ATM MACINE !!");
                    break;
            
                default:
                    break;
            }
                
            }while (option != 4) ;
            sc.close();
            
        }
            
        
    }

public class task3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      bankAccount user = new bankAccount(50000);
      ATM atm = new ATM(user);
      System.out.println("Enter your PIN");
      int pin = sc.nextInt();
      if(pin == 123456){
        System.out.println();
        System.out.println(" !! WELCOME TO ATM MACHINE !!");
        System.out.println();
        atm.run();
      } else {
        System.out.println("wrong PIN");
      }

    }
}
