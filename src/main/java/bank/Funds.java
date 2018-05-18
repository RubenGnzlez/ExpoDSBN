package bank;

public class Funds {
    private Double cashInAccount = 1000.00;

    public Double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(Double cashWithdrawn) { cashInAccount -= cashWithdrawn; }

    public void increaseCashInAccount(Double cashDeposited) { cashInAccount += cashDeposited; }

    public Boolean haveEnoughMoney(Double cashToWithdrawal) {

        if(cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(Double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());

    }

}
