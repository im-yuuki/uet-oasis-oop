package week3.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private long idNumber;
    private String fullName;
    private final List<Account> accountList = new ArrayList<>();

    public Customer() {
        this.idNumber = 0;
        this.fullName = "";
    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public String getCustomerInfo() {
        return String.format("Số CMND: %d. Họ tên: %s.", idNumber, fullName);
    }

    public void addAccount(Account account) {
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

}
