package creational.factorymethod;

/**
 * @author Kavindu Perera
 */
class BankPayment implements PaymentType{
    @Override
    public String getPaymentType() {
        return "Bank Payment";
    }
}
