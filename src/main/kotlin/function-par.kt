fun getfullname(firstname:String,lastname:String=""):String {
    return if (lastname.isNotEmpty()) {
        "$firstname $lastname"
    } else {
        firstname
    }
}
fun calculatescore(correctanswer:Int,totalquestions:Int):Int{
    return (correctanswer *100)/totalquestions

}
fun main(args: Array<String>) {
    //  lambda function
    val sum ={num1:Int,num2:Int ->num1+num2}

    println("20+7 : ${sum(20,7)}")
    val person=getfullname("Rick", "Ross")
    println(person)
    val correctanswer=7
    val totalquestions=10
    val score=calculatescore(correctanswer, totalquestions)
    println("Your score is : $score %")
}
// create a function that displays calculator usingg input and output form