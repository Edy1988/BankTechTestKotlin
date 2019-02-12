import org.junit.Assert
import org.junit.Test

class AccountTest {
    private val account = Account()

    @Test

    fun accountHasABalanceOfZero() {
        Assert.assertEquals(0, account.balance)
    }

}