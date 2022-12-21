public class Main {

    public static void main(String[] args){
        BankAccount JimAccount  = new BankAccount();
        JimAccount.deposit(1000.0);

        JimAccount.withdraw(100.0);
        JimAccount.deposit(22.0);

    }
}
