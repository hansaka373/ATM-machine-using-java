import java.util.HashSet;
import java.util.Scanner;

public class Operations implements Services{

    public Operations() {
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);
        hashSet.add(user5);
    }

    Scanner sc = new Scanner(System.in);
    ATM atm = new ATM();
    public HashSet<User> hashSet = new HashSet<>();

    User user1 = new User("Hansaka Konara",123456, 123,100000);
    User user2 = new User("Madushani Munaweera",456789, 234,200000);
    User user3 = new User("Mihisara Liyanamana",123789, 345,50000);
    User user4 = new User("Induwara Bogoda",519267, 456,5000);
    User user5 = new User("Tharushi Bogida",753219, 567,70000);



    @Override
    public void deposite(int cardNumber, double amount) {

        if (amount<0){
            System.out.println("Please enter correct amount to deposite.");
        }else {
            for (User user : hashSet) {
                if (user.getCardNumber() == cardNumber) {
                    user.setAmount(user.getAmount() + amount);
                    System.out.println("Your total amount is " + user.getAmount());
                    System.out.println("============================================");
                }
            }
        }
    }

    @Override
    public void withdraw(int cardNumber, double amount) {
        for (User user:hashSet){
            if (user.getCardNumber()==cardNumber){
                if (amount>user.getAmount()){
                    System.out.println("insufficient balance to withdraw");
                }else{
                    user.setAmount(user.getAmount()-amount);
                    System.out.println("Withdrawal done!");
                    System.out.println("Your new amount is "+user.getAmount()+" .");
                    System.out.println("============================================");
                }
            }
        }
    }

    @Override
    public void checkAmmount(int cardNumber) {
        for (User user:hashSet){
            if (user.getCardNumber()==cardNumber){
                System.out.println("Your current amount is "+user.getAmount()+" .");
                System.out.println("============================================");
            }
        }
    }

    @Override
    public void miniStatement(int cardNumber) {
        for (User user:hashSet){
            if (user.getCardNumber()==cardNumber){
                System.out.println("Full name: "+user.getFullName());
                System.out.println("Card Number: "+user.getCardNumber());
                System.out.println("Pin Number: "+user.getPinNumber());
                System.out.println("Current Amount: "+user.getAmount());
                System.out.println("============================================");
            }
        }

    }

    public boolean loginCheck(int card, int pw) {
        boolean found = false;
        for (User u:hashSet){
            if (u.getCardNumber()==card && u.getPinNumber()==pw){

                System.out.println("Registration done!");
                System.out.println("Welcome to "+u.getFullName()+"'s Account!");
                System.out.println("-------------------------------------------------------");
                found=true;
                break;
            }
        }
        return found;
    }

}
