package wzorce.com.trzeciTydzien.account;

public class Account {

    private String name;
    private int balance = 0;
    private boolean debit = false;
    private final int maxDebit = -1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }


    public void deposit(int amount) {
        long start = System.nanoTime();
        if (amount > 0) {
            final int tmpBalance = balance;
            balance += amount;
            if (balance >= 0) {
                debit = false;
            }
            StringBuilder message = new StringBuilder();
            message.append("Stan konta ")
                    .append(name)
                    .append(": ")
                    .append(tmpBalance)
                    .append(" | Wpłata: ")
                    .append(amount)
                    .append(" | Po operacji: ")
                    .append(balance);
            System.out.println(message);
        } else {
            System.out.println("Kwota wplaty musi być dodatnia!");
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Czas wykonania metody przy uzyciu int wynosi " + timeElapsed);
    }

    public void withdraw(int amount) {
        if (amount > 0) {

            if (balance - amount < maxDebit) {
                System.out.println("Nie mozna wykonac operacji przekraczającej debet");
                return;
            }

            final int tmpBalance = balance;
            balance -= amount;

            StringBuilder message = new StringBuilder();
            message.append("Stan konta ")
                    .append("Stan konta ")
                    .append(name)
                    .append(": ")
                    .append(tmpBalance)
                    .append(" | Wypłata: ")
                    .append(amount)
                    .append(" | Po operacji: ")
                    .append(balance);
            System.out.println(message);

            if (balance < 0) {
                debit = true;
                System.out.println("Ujemny stan konta");
            }

        } else {
            System.out.println("Kwota wyplaty musi być dodatnia!");
        }

    }

    public void transfer(Account other, int amount) {
        if (this == other) {
            System.out.println("Nie mozna przelac z tego samego konta na to samo konto!");
            return;
        } else if (amount <= 0) {
            System.out.println("Kwota przelewu musi byc dodatnia");
            return;
        } else {
            final int tmpBalance = balance;
            withdraw(amount);
            if (tmpBalance != balance) {
                other.deposit(amount);
            }
        }
    }

    public String toString() {
        return "wzorce.com.trzeciTydzien.account.Account{name: " + name + ", balance:" + balance + "}";
    }

}