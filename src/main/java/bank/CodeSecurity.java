package bank;

public class CodeSecurity {
    private Integer securityCode = 1234;

    public Integer getSecurityCode() { return securityCode; }

    public Boolean isCodeCorrect(Integer secCodeToCheck){

        if(secCodeToCheck.equals(getSecurityCode())) {

            return true;

        } else {

            return false;

        }

    }
}
