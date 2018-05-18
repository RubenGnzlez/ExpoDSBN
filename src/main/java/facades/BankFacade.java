package facades;

import bank.AcountSecurity;
import bank.CodeSecurity;
import bank.Employee;
import bank.Funds;

public class BankFacade {
    private Integer accountNumber;
    private Integer securityCode;

    AcountSecurity acctChecker;
    CodeSecurity codeChecker;
    Funds fundChecker;

    Employee bankWelcome;

    public BankFacade(Integer newAcctNum, Integer newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new Employee();

        acctChecker = new AcountSecurity();
        codeChecker = new CodeSecurity();
        fundChecker = new Funds();

    }

    public Integer getAccountNumber() { return accountNumber; }

    public Integer getSecurityCode() { return securityCode; }


    public void withdrawCash(Double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }


    public void depositCash(Double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }
}
