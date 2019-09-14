data class Customer(val name: String, val email: String)

fun main() {
    val customer = Customer("hong", "gil@dong.com")
    println(customer.name)
    println(customer.email)

    val customerList = ArrayList<Customer>()
    customerList.add(customer)
    customerList.add(Customer("candy", "hot.com"))

    println(customerList.filter { customer -> customer.name == "candy" })
}