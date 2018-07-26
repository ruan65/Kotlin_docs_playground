package delegation

import kotlin.properties.Delegates

var observed = false

var max: Int by Delegates.observable(0) { property, oldValue, newValue ->
    observed = true
}

class User {
    var name: String by Delegates.observable("<initial value>") {
        prop, old, new ->
        println("$old -->> $new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Petia"
    user.name = "Julia"

    println(max)
    println("observed is $observed")

    max = 100
    println(max)
    println("observed is $observed")
}