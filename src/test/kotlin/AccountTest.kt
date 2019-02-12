import org.junit.Assert
import org.junit.Test

class AccountTest {
    private val account = Account()

    @Test

    fun accountHasABalanceOfZero() {
        Assert.assertEquals(0, account.balance)
    }

    @Test
    fun balanceIs100WhenAdded100() {
        account.add(100)
        Assert.assertEquals(100, account.balance)
    }


}