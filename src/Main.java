public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ian", 2000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
