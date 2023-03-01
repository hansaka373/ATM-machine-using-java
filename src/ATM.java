public class ATM {
    private double balance;
    private double dipositeAmount;
    private double withdrawAmount;

    public ATM(double balance, double dipositeAmount, double withdrawAmount) {
        this.balance = balance;
        this.dipositeAmount = dipositeAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public ATM(){}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDipositeAmount() {
        return dipositeAmount;
    }

    public void setDipositeAmount(double dipositeAmount) {
        this.dipositeAmount = dipositeAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
