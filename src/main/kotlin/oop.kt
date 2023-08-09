class computer {
    var brand=""
    var price=0
    var specs=""
}

fun main(args: Array<String>) {
    val myobj=computer()
    myobj.brand="Dell"
    myobj.price=67000
    myobj.specs="core i7 512 ssd 16gb ram"
    println("My laptop is ${myobj.brand} it is ${myobj.specs} and it costs${myobj.price}")
}