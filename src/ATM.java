import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        double balance = 3000.00; // initial balance
        int pin = 5678;           // example PIN
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("\nLogin Successful!");

            while (true) {
                System.out.println("\n----- ATM MENU -----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Successfully Deposited! New Balance: ₹" + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdraw = sc.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal Successful! New Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using our ATM!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option! Try again.");
                }
            }
        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }

        sc.close();
    }
}
