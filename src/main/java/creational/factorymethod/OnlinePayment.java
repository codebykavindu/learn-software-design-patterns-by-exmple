package creational.factorymethod;

/**
 * @author Kavindu Perera
 */
class OnlinePayment implements PaymentType{
    @Override
    public String getPaymentType() {
        return "Online Payment";
    }
}
