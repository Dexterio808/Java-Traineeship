package nl.belastingdienst.micro;

public class PaymentFailedException extends RuntimeException{
    PaymentFailedException(String s){
        super(s);
    }
}
