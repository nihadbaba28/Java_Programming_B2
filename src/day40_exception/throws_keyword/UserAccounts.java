package day40_exception.throws_keyword;

public class UserAccounts {
    public static void main(String[] args) {

    Bank account1 = new Bank();
    account1.balance = 100_000;


   try {
       account1.login("nihadbaba","12345!#");
   } catch (InvalidCredentialsException e){
       System.out.println(e.getMessage());
   }


}}
