public class User {
    private String fullName;
    private int cardNumber;
    private int pinNumber;
    private double amount;

    public User(String fullName, int cardNumber, int pinNumber, double amount) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
        this.amount = amount;
    }

    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
