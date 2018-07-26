package delegation

class AppUser(val map: MutableMap<String, Any?>) {
    val name: String by map
    var age: Int by map
}

fun main(args: Array<String>) {

    val user = AppUser(mutableMapOf(
            "name" to "John Doe",
            "age" to 25
    ))

    println(user.name)
    println(user.age)
    println(user.map)

    user.age =  26

    println(user.map)



}