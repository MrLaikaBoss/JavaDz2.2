public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 100;
        int sum = 1500;
        int bonus = sum / 100;
        if (sum < 1000) {
            bonus = 0;
        }
        int total = (balance + sum + bonus);
        System.out.println(total);
    }
}