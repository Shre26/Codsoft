import java.util.Scanner;
                //  TASK 3: ATM INTERFACE
class userBankAccount {
        private float Balance;
        public float getBalance() {

            return Balance;
        }

        public userBankAccount(float Balance){

            this.Balance=Balance;
        }
        public boolean withdraw(float amount) {
            if (amount > Balance) {
                return false;
            } else {
                Balance = Balance - amount;
                return true;
            }
        }
        public void deposit(float amount){
            Balance=Balance+amount;
        }
}
class ATM {

    private userBankAccount account;
    ATM(userBankAccount account) {

        this.account = account;
    }

    public void showMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1: checkBalance();
                    break;
            case 2: withdraw();
                  break;
            case 3: deposit();
                    break;
            case 4: System.out.println("Thank You!");
                    break;
            default: System.out.println("Please enter a valid no.");
                     showMenu();
        }
    }

    private void checkBalance() {
        float Balance = account.getBalance();
        System.out.println(" Your Balance: " + Balance);
        showMenu();
    }

    private void withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        if (account.withdraw(amount)) {
            System.out.println("Money withdrawed successfully.");
        } else {
            System.out.println("Insufficient Balance!!!");
        }
        showMenu();
    }
    private void deposit() {
            System.out.print("Enter the amount you want to deposit: ");
            Scanner sc = new Scanner(System.in);
            float amount=sc.nextFloat();
            account.deposit(amount);
            System.out.println("Money deposited successfully.");
            showMenu();
        }
}

public class ATMInterface {
    public static void main(String[]args){
            userBankAccount ba=new userBankAccount(50000);
            ATM atm=new ATM(ba);
            atm.showMenu();
    }
}
