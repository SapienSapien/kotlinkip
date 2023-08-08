fun Denno(){
    println("This is a user-defined Function")
}
fun main(args: Array<String>) {
    Denno()
    addtwo()
}
fun addtwo(){
    var num=4
    var num2=98
    println("The sum of $num and $num2 is: ${num+num2}")
    println("The multiplication of $num and $num2 is: ${num*num2}")
    println("The division of $num and $num2 is: ${num/num2}")
    println("The subtraction of $num and $num2 is: ${num2-num}")
}