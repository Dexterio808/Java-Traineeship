package nl.belastingdienst.micro;

public class InvalidDiscountException extends Exception{
    InvalidDiscountException(String s) {
        super(s);
    }
}
