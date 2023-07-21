public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        int sum = 1_000_000; //сумма кредита (Рублей)
        double bid = 9.99; //процентая ставка(%)
        int month = 12; //количество месяцев

        int pay = service.Calculate(sum, bid, month);

        System.out.println();
        System.out.println("Сумма кредита " + sum + " Рублей");
        System.out.println("Процентая ставка " + bid + " %");
        System.out.println("Срок Кредитования " + month + " Месяцев");
        System.out.println("Ежемесячный платеж " + pay + " Рублей");
    }
}