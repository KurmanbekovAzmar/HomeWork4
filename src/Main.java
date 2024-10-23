import javax.accessibility.AccessibleAction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accaunt accaunt1 = new Accaunt();
        for (; true; ) {
            System.out.println("0-Exit, 1-Balance, 2-Withdrowal, 3-Deposit");
            int bal = scanner.nextInt();
            if (bal==1) {
                System.out.println(accaunt1.getBalance());
            } else if (bal==2) {
                accaunt1.withdrowal();
            } else if (bal==3) {
                accaunt1.deposit();
            } else if (bal==0) {
                break;
            }
        }
    }
}