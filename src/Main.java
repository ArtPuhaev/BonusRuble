public class Main {
    public static void main(String[] args) {
        int AccountNumber = 100;
        int AddingNumber = 1200;
        int Balance = AccountNumber + AddingNumber;
        int BonusRuble = AddingNumber / 100;
        int FinalBalance = Balance + BonusRuble;
        if (AddingNumber > 1000) {
            System.out.println("Ваш баланс " + FinalBalance);
            System.out.println("Вам начислено бонусных рублей " + BonusRuble);

        } else {
            System.out.println("Ваш баланс " + Balance);
        }

    }
}
