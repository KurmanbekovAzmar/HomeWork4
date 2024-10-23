import javax.accessibility.AccessibleAction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accaunt accaunt1 = new Accaunt();
        Accaunt accaunt2 = new Accaunt();
        for (; true; ) {
            System.out.println("0-Exit, 1-Accaunt1, 2-Accaunt2");
            int accauntScan = scanner.nextInt();
            if (accauntScan == 1) {
                for (; true; ) {
                    System.out.println("0-Exit, 1-Balance, 2-Withdrowal, 3-Deposit, 4-Transaction");
                    int bal = scanner.nextInt();
                    if (bal == 1) {
                        System.out.println(accaunt1.getBalance());
                    } else if (bal == 2) {
                        accaunt1.withdrowal();
                    } else if (bal == 3) {
                        accaunt1.deposit();
                    } else if (bal == 4) {
                        accaunt1.transaction(accaunt2);

                    } else if (bal == 0) {
                        break;
                    }
                }
            } else if (accauntScan == 2) {
                for (; true; ) {
                    System.out.println("0-Exit, 1-Balance, 2-Withdrowal, 3-Deposit, 4-Transaction");
                    int bal = scanner.nextInt();
                    if (bal == 1) {
                        System.out.println(accaunt2.getBalance());
                    } else if (bal == 2) {
                        accaunt2.withdrowal();
                    } else if (bal == 3) {
                        accaunt2.deposit();
                    } else if (bal == 4) {
                        accaunt2.transaction(accaunt1);

                    } else if (bal == 0) {
                        break;
                    }
                }
            } else if (accauntScan==0) {
                System.out.println("Exit");
                break;
            }
        }
    }
}