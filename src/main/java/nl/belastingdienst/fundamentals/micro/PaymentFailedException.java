package nl.belastingdienst.fundamentals.micro;

public class PaymentFailedException extends RuntimeException{
    PaymentFailedException(String s){
        super(s);
    }
}
