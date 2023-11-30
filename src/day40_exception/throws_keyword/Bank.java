package day40_exception.throws_keyword;

public class Bank {
    double balance;

    //login - username & password
    public void login(String username, String password) throws InvalidCredentialsException{
        if(!username.equals("loopcamp")){
            throw new InvalidCredentialsException("Invalid Username");
        }

        if(!password.equals("1234567")){
            throw new InvalidCredentialsException("Invalid");
        }

    }
}
