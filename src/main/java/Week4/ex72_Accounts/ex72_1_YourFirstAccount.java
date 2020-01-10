package Week4.ex72_Accounts;

public class ex72_1_YourFirstAccount {
    public static void main(String[] args) {
        Account newAccount = new Account("Serban", 100);
        newAccount.deposit(20);
        System.out.println(newAccount);
    }
}
