public class CreditPaymentService {

    public int Calculate(int sum, double percent, double month) {


        percent = percent / 100 / 12;
        double credit = sum * (percent + percent / (Math.pow(1 + percent, month) - 1));

        return (int) credit;
    }
}
