import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        DecimalFormat df = new DecimalFormat("#.00");
        double creditPayment = service.calculate(12, 1_000_000);
        System.out.println(df.format(creditPayment));
    }
}
