import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    static double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        BankAccount.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Balance after deposit: "+ balance +"\n");
    }
    
    public void withdraw(double amount){
        if(amount >= balance){
            System.out.println("Insuffient balance in your account");
        }
        else{
            balance -= amount;
            System.out.println("Balance after withdrawl: "+ balance+"\n");
        }
    }

    public void Display(){
        System.out.println(balance);
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int action;

        //Creating method of the BankAccount class
        BankAccount newAccount = new BankAccount("Tester1", 100000);
        do{
            System.out.println("-----------Hello Welcome to the baking system!----------- \n Please select one of the options below: \n 1. Deposit \n 2. Withdraw \n 3.Check account balance \n 4.Exit \n Current Balance= "+balance);
            action = scn.nextInt();
            if(action == 1){
                int amount;
                System.out.println("Please enter the amount that you would like to deposit \n");
                amount = scn.nextInt();
                newAccount.deposit(amount);
            }
            else if(action == 2){
                int amount;
                System.out.println("Please enter the amount that you would like to withdraw \n");
                amount = scn.nextInt();
                newAccount.withdraw(amount);
            }
            else if(action == 3){
                newAccount.Display();
            }
        }while(action !=4);
        scn.close();
    }
}
