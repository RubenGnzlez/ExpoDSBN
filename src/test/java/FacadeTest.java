import facades.BankFacade;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void withdrawSuccess(){
        BankFacade testingWithdraw = new BankFacade(12345678,1234);
        testingWithdraw.withdrawCash(999.00);

    }
    @Test
    public void withdrawError(){
        BankFacade testingWithdraw = new BankFacade(1234567,1234);
        testingWithdraw.withdrawCash(50.00);

    }

    @Test
    public void DepositSuccess(){
        BankFacade testingWithdraw = new BankFacade(12345678,1234);
        testingWithdraw.depositCash(500.00);

    }
}
