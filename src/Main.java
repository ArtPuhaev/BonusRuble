public class Main {
    public static void main(String[] args) {
        int accountNumber = 100;
        int addingNumber = 1200;
        int balance = accountNumber + addingNumber;
        int bonusRuble = addingNumber / 100;
        int finalBalance = balance + bonusRuble;
        if (addingNumber > 1000) {
            System.out.println("Ваш баланс " + finalBalance);
            System.out.println("Вам начислено бонусных рублей " + bonusRuble);

        } else {
            System.out.println("Ваш баланс " + balance);
        }

    }
}
