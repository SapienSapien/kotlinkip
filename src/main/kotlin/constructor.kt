class Wanafunzi(val jina:String, var miaka:Int, var masomo:String){


}

fun main(args: Array<String>) {
    val mimi=Wanafunzi("Denno",22,"Analytical Chemistry")
    val Me=Wanafunzi("Rasmus",21,"MIT")
    println("Stud Name is ${mimi.jina} and age is ${mimi.miaka} and I do ${mimi.masomo}")
    println("Stud Name is ${Me.jina} and age is ${Me.miaka} and I do ${Me.masomo}")
}