class Account(var balance: Int = 0, var transactions: MutableList<Any>) {

    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        balance -= amount
    }
}
