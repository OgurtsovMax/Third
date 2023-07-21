public class CreditPaymentService {

    public int Calculate(int k, double p, double m) {


        p = p / 100 / 12;
        double credit = k * (p + p / (Math.pow(1 + p, m) - 1));

        return (int) credit;
    }
}
