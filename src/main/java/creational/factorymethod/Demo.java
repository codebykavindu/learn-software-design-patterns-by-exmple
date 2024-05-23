package creational.factorymethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentType bankPayment = paymentFactory.getPaymentType("BANK");
        PaymentType onlinePayment = paymentFactory.getPaymentType("ONLINE");

        log.info(bankPayment.getPaymentType());
        log.info(onlinePayment.getPaymentType());
    }

}
