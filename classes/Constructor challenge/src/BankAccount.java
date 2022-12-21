public class BankAccount {


    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double deposit){
        this.balance = this.balance + deposit;
        System.out.println("The amount deposited is " + deposit + " andthe balance is " + this.balance);
    }

    public void withdraw(double withdraw){
        if(this.balance - withdraw > 0){
            this.balance = this.balance - withdraw;
            System.out.println("the amooubt withdrawned is " + withdraw + "and the balance is " +balance);
        }else{
            System.out.println("Insufficient funds");
        }
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
