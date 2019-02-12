class Account(var balance: Int = 0) {
    fun add(amount: Int) {
        balance =+ amount
    }
}
