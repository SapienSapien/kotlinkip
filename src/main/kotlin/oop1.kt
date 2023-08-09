class People(val name:String,val age:Int,val gender:String){
    fun jitambulishe(){
        println("Hi my name is $name and I'm $age years old and I'm $gender")
    }
    // member function to have a birthday
    fun havebirthday(){
    //    age++
        println("$name just turned $age")
    }

}

fun main(args: Array<String>) {
  //  create a instance (objects) of the class
    val watu=People("Romeo" ,19,"Male")
    val watu1=People("Thuram",21,"Female")
    val watu2=People("YoGotti",24,"Male")

    watu.jitambulishe()
    watu.havebirthday()
    watu1.jitambulishe()
    watu2.havebirthday()

}
