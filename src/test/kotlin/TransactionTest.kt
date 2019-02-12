import org.junit.Assert
import org.junit.Test

class TransactionTest {
    private val transaction = Transaction("deposit")

    @Test

    fun transactionHasAType(){
        Assert.assertEquals("deposit", transaction.type)
    }
}