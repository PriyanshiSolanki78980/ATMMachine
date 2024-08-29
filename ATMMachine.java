import java.util.Scanner;


class ATM{
    float Balance;
    int PIN = 1054;

    public void checkpin(){
    System.out.println("Enter your pin: ");
    Scanner sc = new Scanner(System.in);
    int eneteredpin = sc.nextInt();
    if (eneteredpin==PIN){
        menu();
    }
    else{
        System.out.println("Enter a valid pin");
        sc.close();
    }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        sc.close();
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("enter a valid choice");
           
        }

    }
    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Blance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawal Successful");
            sc.close();
        }
        menu();

    }
    public void depositMoney(){
        System.out.println("Enter thr Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        sc.close();
        menu();

    }
    }




public class ATMMachine{

    public static void main(String[]args){

        ATM obj = new ATM();
        obj.checkpin();




    }
}