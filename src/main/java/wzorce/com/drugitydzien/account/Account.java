package wzorce.com.drugitydzien.account;

public class Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;
    private int maxDebet = -1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setMaxDebet(int maxDebet) {
        this.maxDebet = maxDebet;
    }

    public void deposit(int amount) {
        int beforeDeposit = getBalance();
        if (amount < 0) {
            System.out.println("Kwota wplaty musi byc dodatnia!");
        } else {
            balance = balance + amount;
            if (balance >= 0) {
                debit = false;
            }
            System.out.println("Stan konta " + this.getName() + " : " + beforeDeposit + " | Wpłata: "
                    + amount + " | Po operacji: " + getBalance());
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Kwota wyplaty musi byc dodatnia!");
            return;
        }
        if (getBalance() - amount < maxDebet) {
            System.out.println("Nie mozna wykonac operacji przekraczajacej debet");
            return;
        }
        int beforeWithdraw = getBalance();
        balance = balance - amount;
        if (balance < 0) {
            debit = true;
            System.out.println("ujemny stan konta");
        }
        System.out.println("Stan konta " + this.getName() + " : " + beforeWithdraw + " | Wypłata: "
                + amount + " | Po operacji: " + getBalance());
    }


    public void transfer(Account other, int amount) {
        if (amount < 0) {
            System.out.println("Kwota przelewu nie może być ujemna!");
            return;
        }
        if (getBalance() - amount < maxDebet) {
            System.out.println("Przelewając z konta " + this.getName() + " nie możesz przekroczyć maksymalnego debetu");
            return;
        }
        this.withdraw(amount);
        other.deposit(amount);
    }


    public String toString() {
        return "wzorce.com.trzeciTydzien.account.Account{name: " + name + ", balance:" + balance + "}";
    }

}
