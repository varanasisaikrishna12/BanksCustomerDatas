public class Customer {
    private String name;
    private String accountNo;
    private String accountType;
    private int amount;
    private int withdrawamount;

    Customer(String name, String accountNo, String accountType, int amount, int withdrawamount) {
        this.name = name;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.amount = amount;
        this.withdrawamount = withdrawamount;
    }

    void withdraw(int amount) {
        if (amount <= this.amount) {
            System.out.println("YOU HAVE ENOUGH MONEY:) PLZ WAIT WHILE WE ARE PACKING FPR YOU");
            this.amount = (this.amount) - amount;
            withdrawamount = withdrawamount + amount;
        }

    }

    void customerDetails() {
        System.out.println("Customer Name ::" + name);
        System.out.println("Customer Name ::" + accountNo);
        System.out.println("Customer Name ::" + accountType);
        System.out.println("Customer Name ::" + amount);
        System.out.println("Customer Name ::" + withdrawamount);

    }

    int getAmount() {
        return amount;
    }

    int getWithdrawamount() {
        return withdrawamount;
    }
}
