fun main(args: Array<String>) {
    complexecal()
}
fun complexecal(){
    println("Complex Calculator")
    println("Enter the first Number")
    val num1= readLine()?.toDoubleOrNull()
    println("Enter the operator (+,-,/,*): ")
    val operator= readLine()
    print("Enter the second Number")
    val num2= readLine()?.toDoubleOrNull()

    if (num1==null||operator==null||num2==null ) {
        println("Inavalid input please put correct numbers and operators")
        return
    }
    val results=when(operator){
        "+"-> num2+num1
        "-"-> num2-num1
        "*"-> num2*num1
        "/"-> if (num2 !=0.0)num1/num2 else "You can't divide by zero"
        else->"Invalid Operator"
   }
    println("Answer=$results")


}