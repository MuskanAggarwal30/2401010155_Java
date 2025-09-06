package Assigmnet1;

import java.util.Scanner;
public class UserInterface{
    private Account[] accounts;
    private int accountCount;
    private Scanner sc;

    public UserInterface(int size) {
        accounts=new Account[size];
        accountCount=0;
        sc=new Scanner(System.in);
    }
    public void createAccount(){
        if (accountCount<accounts.length){
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double balance=sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            accounts[accountCount] = new Account(accNo, name, balance, email, phone);
            accountCount++;
            System.out.println("Account created successfully!");
        }
        else{
            System.out.println("Cnannot Create more accounts. Limits reached.");
        }
    }
    private Account findAccount(int accNo){
        for (int i=0; i<accountCount; i++){
            if (accounts[i].getAccountNumber()==accNo){
                return accounts[i];
            }
        }
        return null;
    }
    public void performDeposit(){
        System.out.print("Enter Account Number: ");
        int accNo=sc.nextInt();
        System.out.print("Enter Amount to deposit: ");
        double amount=sc.nextDouble();

        Account acc=findAccount (accNo);
        if (acc!=null){
            acc.deposit(amount);
        }
        else{
            System.out.println("Account not found.");
        }
    }
    public void performWithdrawal() {
        System.out.println("Enter Account Number:- ");
        int accNo=sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double amount=sc.nextDouble();

        Account acc=findAccount(accNo);
        if (acc!=null){
            acc.withdraw(amount);
        }
        else{
            System.out.println("Account not found.");
        }
    }
    public void showAccountDetails() {
        System.out.println("Enter Account Number: ");
        int accNo=sc.nextInt();
        Account acc=findAccount(accNo);
        if (acc!=null){
            acc.displayAccountDetails();
        }
        else{
            System.out.println("Account not found");
        }
    }
    public void updateContact(){
        System.out.print("Enter Account Number: ");
        int accNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter New Email: ");
        String email = sc.nextLine();
        System.out.print("Enter new phone number: ");
        String phone = sc.nextLine();

        Account acc=findAccount(accNo);
        if (acc!=null){
            acc.updateContactDetails(email, phone);
        }
        else{
            System.out.println("Account not found.");
        }
    }
    public void mainMenu(){
        int choice;
        do {
            System.out.println("\n--- Banking Application Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Account Details");
            System.out.println("5. Update Contact Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: System.out.println("Thankyou for using the Banking App! "); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice!=6);
    }
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(10);
        ui.mainMenu();
    }
}
