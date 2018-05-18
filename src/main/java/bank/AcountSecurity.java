package bank;

public class AcountSecurity {
    private Integer accountNumber = 12345678;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Boolean accountActive(Integer acctNumToCheck) {

        if (acctNumToCheck.equals(getAccountNumber())) {
            return true;

        } else {

            return false;
        }

    }
}
