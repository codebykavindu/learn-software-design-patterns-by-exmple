package creational.factorymethod;

/**
 * @author Kavindu Perera
 */
class PaymentFactory {
    public PaymentType getPaymentType(String paymentType) {
        if (paymentType.equalsIgnoreCase("BANK")) {
            return new BankPayment();
        } else if (paymentType.equalsIgnoreCase("ONLINE")) {
            return new OnlinePayment();
        }
        return null;
    }
}
