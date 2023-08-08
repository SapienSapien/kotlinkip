fun main(args: Array<String>) {
    print("Enter students score: ")
    val passmark: Int=Integer.valueOf(readln())

    if (passmark>=50 && passmark<59) {
        println("You have passed")
    }else if(passmark>60 && passmark<70)
        println("Credit score")
    else if(passmark>70 && passmark<100)
        println("Distinction score")
    else if(passmark<50)
        println("You have failed")
    else (passmark>100 && passmark<0)
        println("Error input")

}