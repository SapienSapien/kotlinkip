fun main(args: Array<String>) {

    var num=65
    if (num>18){
        println("The num is greater")
    }else{
        println("The num is less")
    }
    // if ..elsif statement
    val nambari=-6
    if (nambari<0){
        println("Its a negative number")
    }else if (nambari>0 && nambari<10)
        println("Its a one digit number")
    else if (nambari>=10 && nambari<100)
        println("Its a double digit number")
    else
        println("It has 3 or more digits")
}
//create a if..elseif statement to check marks as pass fail ,distinction and credit