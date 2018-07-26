package delegation

val lazyVal: String by lazy {
    println("lazy has been computed")
    "Hi there!!!"
}


fun main(args: Array<String>) {
    println(lazyVal)
    println(lazyVal)
}