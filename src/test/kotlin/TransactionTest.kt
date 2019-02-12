import org.junit.Assert
import org.junit.Test

class TransactionTest {
    private val transaction = Transaction("deposit", 100)

    @Test

    fun transactionHasAType() {
        Assert.assertEquals("deposit", transaction.type)
    }

    @Test

    fun transactionHasAnAmount() {
        Assert.assertEquals(100, transaction.amount)
    }
}