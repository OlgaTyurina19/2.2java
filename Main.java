public class Main {
    public static void main(String[] args) {

        int accountBalance = 100; // rub
        int topUpBalance =1400; // rub

        int bonus = topUpBalance / 100; // rub
        int resultBalance; // rub

        if (topUpBalance > 1000)  // rub

        {
            resultBalance = accountBalance + topUpBalance + bonus;
        } else {
            resultBalance = accountBalance + topUpBalance;
        }

        System.out.println("Остаток на счете: " + resultBalance);