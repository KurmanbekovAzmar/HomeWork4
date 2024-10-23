import java.util.Scanner;

public class Accaunt {
    private double balance;

    public Accaunt() {

    }

    public Accaunt(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;


    }

    public double getBalance() {
        return balance;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set balance : ");
        int b = scanner.nextInt();
        System.out.println("Balance: " + (balance += b));


    }

    public void withdrowal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sum:");
        int scan = scanner.nextInt();
        if (balance == 0) {
            System.out.println("Akcha yok");
        }
        System.out.println("Your balance: " + balance);
        System.out.println("Remained on the balance sheet: " + (balance -= scan));


    }
}

