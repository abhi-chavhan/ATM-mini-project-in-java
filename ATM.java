import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Radhe Radhe");

        int balance = 5000, withdraw, deposite;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***Automated Teller Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposite");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw: ");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.err.println("Enter money to be deposited: ");
                    deposite = sc.nextInt();
                    balance = balance + deposite;
                    System.out.println("Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.err.println("");
                    break;
                    
                case 4:
                    System.exit(0);
            
                default:
                    System.err.println("Invalid choice");
                    break;
            }
        }
    }
}