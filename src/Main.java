public class Main {

    static void banktransactions(Customer[] bankdata) {
        int totalamount = 0;
        int totalamountwithdraw = 0;
        for (Customer i : bankdata
        ) {
            totalamount = totalamount + i.getAmount();
            totalamountwithdraw = totalamountwithdraw + i.getWithdrawamount();
        }
        System.out.println("Total Amount ::" + totalamount);
        System.out.println("Total Amount Withdraw ::" + totalamountwithdraw);
    }

    public static void main(String[] args) {
        Customer a1 = new Customer("a1", "001", "Current", 1000, 500);
        Customer a2 = new Customer("a2", "002", "Savings", 1000, 500);
        Customer a3 = new Customer("a3", "003", "Savings", 1000, 500);
        Customer a4 = new Customer("a4", "004", "Savings", 1000, 500);

        Customer[] bank = {a1, a2, a3, a4};
        for (Customer i : bank
        ) {
            i.customerDetails();
        }
        banktransactions(bank);
    }
}
