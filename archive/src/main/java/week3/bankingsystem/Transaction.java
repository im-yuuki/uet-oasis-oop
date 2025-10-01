package week3.bankingsystem;

public class Transaction {

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private final int type;
    private final double amount;
    private final double initialBalance;
    private final double finalBalance;

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    public String getTransactionSummary() {
        String typeString;
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                typeString = "Nạp tiền vãng lai";
                break;
            case TYPE_WITHDRAW_CHECKING:
                typeString = "Rút tiền vãng lai";
                break;
            case TYPE_DEPOSIT_SAVINGS:
                typeString = "Nạp tiền tiết kiệm";
                break;
            case TYPE_WITHDRAW_SAVINGS:
                typeString = "Rút tiền tiết kiệm";
                break;
            default:
                typeString = "";
        }
        return String.format(
                "- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. Số tiền: $%.2f. Số dư cuối: $%.2f.",
                typeString, initialBalance, amount, finalBalance
        );
    }

}
