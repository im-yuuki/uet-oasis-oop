package week3.bankingsystem;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private final List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void readCustomerList(InputStream input) {
        Customer currentCustomer = null;
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(" ");
                if (parts[0].matches("\\d+")) {
                    if (currentCustomer == null) {
                        continue;
                    }
                    long accountNumber = Long.parseLong(parts[0]);
                    String accountType = parts[1];
                    double initialBalance = Double.parseDouble(parts[2]);
                    Account account;
                    if (accountType.equals(Account.CHECKING)) {
                        account = new CheckingAccount(accountNumber, initialBalance);
                    } else if (accountType.equals(Account.SAVINGS)) {
                        account = new SavingsAccount(accountNumber, initialBalance);
                    } else {
                        continue;
                    }
                    currentCustomer.addAccount(account);
                } else {
                    long customerId = Long.parseLong(parts[parts.length - 1]);
                    StringBuilder fullNameBuilder = new StringBuilder();
                    for (int i = 0; i < parts.length - 1; i++) {
                        fullNameBuilder.append(parts[i]).append(" ");
                    }
                    String fullName = fullNameBuilder.toString().trim();
                    currentCustomer = new Customer(customerId, fullName);
                    customerList.add(currentCustomer);
                }
            }
        }
    }

    public String getCustomersInfoByIdOrder() {
        ArrayList<Customer> sortedCustomers = new ArrayList<>(customerList);
        sortedCustomers.sort(Comparator.comparingLong(Customer::getIdNumber));
        StringBuilder result = new StringBuilder();
        for (Customer customer : sortedCustomers) {
            result.append(customer.getCustomerInfo()).append("\n");
        }
        return result.toString();
    }

    public String getCustomersInfoByNameOrder() {
        ArrayList<Customer> sortedCustomers = new ArrayList<>(customerList);
        sortedCustomers.sort(Comparator.comparing(Customer::getFullName));
        StringBuilder result = new StringBuilder();
        for (Customer customer : sortedCustomers) {
            result.append(customer.getCustomerInfo()).append("\n");
        }
        return result.toString();
    }

}
