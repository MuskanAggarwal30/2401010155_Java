package Assigmnet1;
public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;
    public Account(int accountNumber, String accountHolderName, double balance, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Succesfully deposited RS."+amount);
        }
        else{
            System.out.println("Invalid deposit amount.Must be positive.");
        }
    }
    public void withdraw(double amount){
        if (amount>0){
            if (amount<=balance){
                balance -=amount;
                System.out.println("Successfully withdrawn Rs."+amount);
            }
            else{
                System.out.println("Insufficient balnce!");
            }
        }
        else{
            System.out.println("Invalid withdrawal amount. Must be positive.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹"+balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("------------------------\n");
    }
    public void updateContactDetails(String email, String phoneNumber){
        this.email=email;
        this.phoneNumber=phoneNumber;
        System.out.println("Contact details updated successfully!");
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}

