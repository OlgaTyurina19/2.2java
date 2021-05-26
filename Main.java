public class Main {
    public static void main(String[] args) {
        int account = 2000;
        int topUp = 1100;
        if (topUp > 1000) {
            int bonus = (topUp) / 100;
            System.out.println(account + bonus);
            System.out.println(bonus);
        } else {
            System.out.println(account);
        }

    }
}