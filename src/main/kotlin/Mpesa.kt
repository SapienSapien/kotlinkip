open class MpesaAccount(val phoneno:String, var balance:Double){

    open fun deposit(amount:Double){

        if (amount > 0){
            balance +=amount
            println("Deposited $amount into account $phoneno .New balance : $balance")
        }else{
            println("Invalid deposit")
        }
    }
    open fun withdraw(amount: Double){

            if(amount>0 && amount<=balance)
                balance -= amount
            println("Withdrawn $amount from account $phoneno, Balance: $balance")

        }

    }
class checkbalance(phoneno: String, balance: Double):MpesaAccount(phoneno, balance){
        fun sendmoney(receiverPhone:String,amount: Double){
            if(amount>0 && amount<=balance)
                balance -=amount
                println("Received $amount from account $phoneno, Balance in $receiverPhone: $balance")


        }


    }



fun main(args: Array<String>) {
    val mpesa1=MpesaAccount("Denno", 7500.00)
    val bal=checkbalance("Denno", 7500.00)

    mpesa1.deposit(7500.00)
    mpesa1.withdraw(5000.00)

    bal.sendmoney("Ronny",800.00)

}