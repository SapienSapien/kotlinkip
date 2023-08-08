fun main(args: Array<String>) {
    // for loops
    for (i in 5..15) {
        println("My loops: $i")
    }
    var myarr= arrayOf("Denno","Sancho","Bruno")
    for (names in myarr){
        println("Student : $names")
    }
    // do..while
    var num=100
    do{
        println("Loop : $num")
        num+=6
    }while (num<=110)
}