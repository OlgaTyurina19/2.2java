public class Main {
    public static void main(String[] args) {
        int accountBalance = 100; // rub
        int topUpBalance = 1300; // rub
        int amout = topUpBalance / 100;
        int bonus = 1; // rub

        if (topUpBalance > 1000) ; // rub

        {
            bonus = 1 * amout; // rub

        }


        int total = accountBalance + topUpBalance + bonus; // rub
        System.out.println("Остаток на счете: " + total);
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
    }
}
