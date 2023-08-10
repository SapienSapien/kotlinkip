open class Animal(val name:String){
    open fun makesound(){
        println("$name makes a sound")
    }
}
class Cat(name: String):Animal(name){
    override fun makesound(){
        println("$name meows!!!")
    }
}
class Dog(name: String):Animal(name){
    override fun makesound(){
        println("$name barks!!!")
    }
}
class Snake(name: String):Animal(name){
    override fun makesound(){
        println("$name Hisses!!!")
    }
}
fun main(args: Array<String>) {
    val dog=Dog("Randy")
    val cat=Cat("Rita")
    val snake=Snake("Josh")

    dog.makesound()
    cat.makesound()
    snake.makesound()
}
