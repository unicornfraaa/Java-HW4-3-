public class CreditPaymentService {
    public double calculate(int m, int s) {
        double p = 0.00825;
        double creditPayment = s * (p+(p/(1+p)*m-1));
        return creditPayment;
    }
}
