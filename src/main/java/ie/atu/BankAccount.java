package ie.atu;

public class BankAccount {
    private String accNo;
    private String name;
    private double balance;

    public BankAccountTest(String accNo, String name, double balance) {
        if (balance <= 0) {
            throw new IllegalArgumentException("Balance ,ust be greater than 0.");
        }
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public String getAccNo() {

        return accNo;
    }

    public String getName() {

        return 0;
    }

    public double getBalance() {
        return balance;
    }
}


