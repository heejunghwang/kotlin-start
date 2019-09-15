data class Customer(val name: String, val email: String)

fun main() {
    // initialize object
    val customer = Customer("hong", "gil@dong.com")
    println(customer.name)
    println(customer.email)

    //list
    val customerList = ArrayList<Customer>()
    customerList.add(customer)
    customerList.add(Customer("candy", "hot.com"))

    // stream filter
    println(customerList.filter { customer -> customer.name == "candy" })

    // check the class type
    when (customer) {
        is Customer -> println("customer instance of Customer")
        else -> println("else")
    }

    // loop for (in is iterator of list)
    for (item in customerList) {
        println("$item")
    }

    // The result include 10
    for (i in 1..10) {
        println(i)
    }

    // The result doesn't include 10
    for (i in 1 until 10) {
        println(i)
    }

    // Arrays as list (In Java Arrays.asList(listName))
    val stringlist = listOf("a", "b", "c")

    // Tuple
    // a,b,c is key, 1,2,3 is value
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    for(item in map){
        println(map)
    }

    println(map["a"])
    println(map["d"])

}