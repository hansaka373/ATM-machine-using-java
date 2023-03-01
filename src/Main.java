import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations op = new Operations();
        User us = new User();

        System.out.println("Welcome to our ATM System ");
        System.out.println("--------------------------------------");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your card Number");
            int cardNumber = sc.nextInt();

            System.out.println("Enter your pin number");
            int pw = sc.nextInt();

                if (op.loginCheck(cardNumber,pw)){
                    do {
                        menu();
                        int choice = sc.nextInt();

                        switch (choice){
                            case 1:
                                System.out.println("Enter the amount you want to deposit");
                                double depositAmount = sc.nextDouble();
                                op.deposite(cardNumber, depositAmount);
                                System.out.println("Money deposit done!");
                                System.out.println("==========================================");
                                break;

                            case 2:
                                System.out.println("Enter the amount you want to withdraw");
                                double withdrawAmount = sc.nextDouble();
                                op.withdraw(cardNumber, withdrawAmount);

                                break;

                            case 3:
                                op.checkAmmount(cardNumber);
                                break;

                            case 4:
                                op.miniStatement(cardNumber);
                                break;

                            case 5:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Invalid Input. Try again!");
                                break;
                        }
                    }while (true);

                }else{
                    System.out.println("Card number or password incorrect. Try again");
                    System.out.println("-------------------------------------------");
                    System.out.println("");
                    break;
                }
        }while (true);
    }

    private static void menu() {
        System.out.println("Enter 1 to deposit money");
        System.out.println("Enter 2 to withdraw money");
        System.out.println("Enter 3 to check your amount");
        System.out.println("Enter 4 to view mini statement");
        System.out.println("Enter 5 to exit");
    }
}
