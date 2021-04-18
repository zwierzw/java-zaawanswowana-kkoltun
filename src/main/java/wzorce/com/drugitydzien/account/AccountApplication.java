package wzorce.com.drugitydzien.account;

public class AccountApplication {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("Konto Premium");
        System.out.println("Nazwa: " + account1.getName());
        System.out.println("Stan konta: " + account1.getBalance());

//        account1.deposit(1000);
//        account1.withdraw(2001);
////        account1.deposit(-100);
////        account1.withdraw(-1000);

        Account account2 = new Account();
        account1.transfer(account2, 100);
        System.out.println();
        account1.transfer(account2, 1_000_000);


    }
}
