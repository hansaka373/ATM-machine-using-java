public interface Services {
    void deposite(int cardNumber, double amount);
    void withdraw(int cardNumber, double amount);
    void checkAmmount(int cardNumber);
    void miniStatement(int cardNumber);
}
