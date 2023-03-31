import java.util.Scanner;
class MBI{
    public int accountNum;
    private double balance;
    public String accountName;
    public MBI(int accountNum , String accountName , double balance){
        this.balance = balance;
        this.accountNum = accountNum;
        this.accountName = accountName;
    }
    public void checkBal (){
        System.out.println("Current Balance : " + balance + "₹");
    }
    public void depositCash(int amount){
        balance = balance + amount;
        System.out.println(amount + " /- " + "Deposit successfully");
        System.out.println("Current Balance : " + balance + "/- ");
    }
    public void withdrawCash(int amount){
        if (balance > amount ) {
            balance = balance - amount;
            System.out.println(amount + "/- Withdraw successfully");
            System.out.println("Current Balance : " + balance + "/- ");
        }else {
            System.out.println("Withdrawal request failed! , insufficient balance");
        }
    }
    public void details(){
        System.out.println("Sure , Here your details");
        System.out.println("Account Name    : " + accountName);
        System.out.println("Account Number  : " + accountNum);
        System.out.println("Account Balance : " + balance + "/-");
        System.out.println("Name Of Bank    : " + "Manish Bank Of India");
    }
}
public class BankMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the MBI - Manish Bank Of India");
        System.out.println("Create New Account. Fill Below Forms");
        System.out.print("Enter Your Name ");
        String accountName = sc.nextLine();

        System.out.print("Enter Account Number in 1-5 letters ");
        int accountNum = sc.nextInt();
        if (accountNum <= 99999) {
            System.out.println("Account successfully created\nYour Initial Balance is 500/-");
            double accountBalance = 500;

            MBI bank = new MBI(accountNum, accountName, accountBalance);
            while (true) {
                System.out.println("\nEnter only Number");
                System.out.println("1. Check Balance" + "  ,  2. Deposit Cash");
                System.out.println("3. Withdraw Cash" + "  ,  4. Full Details");
                System.out.println("5. Close Account");
                while (true) {
                    try {
                        int choose = sc.nextInt();
                        if (choose == 1) {
                            bank.checkBal();
                        } else if (choose == 2) {
                            System.out.println("Sure , Enter the amount");
                            int amount = sc.nextInt();
                            if (amount <= 100000) {
                                bank.depositCash(amount);
                            } else if (amount > 100001) {
                                System.out.println("Deposit process failed!");
                            } else {
                                System.out.println("Deposit process failed!");
                            }
                        } else if (choose == 3) {
                            System.out.println("Sure , Enter the amount");
                            int amount = sc.nextInt();
                            bank.withdrawCash(amount);
                        } else if (choose == 4) {
                            bank.details();
                        } else if (choose == 5) {
                            System.out.println("Successfully Closed.");
                            System.exit(0);
                        } else {
                            System.out.println("Are you sure your number is in 1 - 5");
                        }
                    } catch (Exception MisMatch) {
                        System.out.println("Are you sure you entered a number!");
                        sc.next();
                    }
                }
            }
        } else {
            System.out.println("Fill Another Form");
        }
    }
}
