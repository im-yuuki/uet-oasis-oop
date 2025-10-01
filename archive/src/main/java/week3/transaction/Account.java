package week3.transaction;

import java.util.ArrayList;

public class Account {

    private double balance = 0;
    private final ArrayList<Transaction> transitionList = new ArrayList<>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        Transaction transaction = new Transaction(Transaction.DEPOSIT, amount, balance);
        transitionList.add(transaction);
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
        Transaction transaction = new Transaction(Transaction.WITHDRAW, amount, balance);
        transitionList.add(transaction);
    }

    public void addTransaction(double amount, String operation) {
        if (operation.contentEquals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.contentEquals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            String operation = "";
            if (transaction.getOperation().contentEquals(Transaction.DEPOSIT)) {
                operation = "Nap tien";
            } else if (transaction.getOperation().contentEquals(Transaction.WITHDRAW)) {
                operation = "Rut tien";
            }
            System.out.printf(
                    "Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    i + 1, operation, transaction.getAmount(), transaction.getBalance()
            );
        }
    }

}
