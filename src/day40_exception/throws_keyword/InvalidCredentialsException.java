package day40_exception.throws_keyword;

public class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException (String message){
        super(message);
    }
}
