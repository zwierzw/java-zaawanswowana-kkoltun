package wzorce.com.trzeciTydzien.account;

public class AccountApplication {

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
        System.out.println(account);

        account.deposit(100);
        account.deposit(200);
        account.withdraw(400);
        account.withdraw(4000);

        System.out.println();
        System.out.println("transfer test");
        Account other = new Account();
        other.setName("Konto other");
        account.transfer(other, 4000);
        System.out.println(other);
        account.transfer(other, 100);
        System.out.println(other);

        account.transfer(account, 1);
    }

}