fun main(){
    sendmessege(messege = "hello!" , name = "kanon")
}
fun sendmessege( name: String = "user", messege : String="messege"){
    println("name = $name, messege = $messege")
}