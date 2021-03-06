import org.junit.Assert
import org.junit.Test

class AccountTest {
    private val account = Account(transactions = mutableListOf<Any>())

    @Test

    fun accountHasABalanceOfZero() {
        Assert.assertEquals(0, account.balance)
    }

    @Test
    fun balanceIs100WhenAdded100() {
        account.deposit(100)

        Assert.assertEquals(100, account.balance)
    }

    @Test
    fun balanceIs50WhenWithdrawing50From100() {
        account.deposit(100)
        account.withdraw(50)

        Assert.assertEquals(50, account.balance)
    }


    @Test
    fun balanceIs20WhenAdding100Withdrawing50Adding10Withdrawing40() {
        account.deposit(100)
        account.withdraw(50)
        account.deposit(10)
        account.withdraw(40)

        Assert.assertEquals(20, account.balance)
    }

    @Test
    fun transactionListIsEmptyIfThereAreNoTransactions(){

        Assert.assertEquals(true, account.transactions.isEmpty())
    }

    @Test
    fun whenUserDepositsTransactionsLengthIs1() {
        account.deposit(100)

        Assert.assertEquals(1, account.transactions.size)
    }


}