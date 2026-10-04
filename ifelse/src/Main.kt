fun main(){
    val number = 4
    if(number>5){
        println("The number is greater than 5")
    }else if(number<3 || number !=5){
        println("Condition is true")
    }
    else{
        println("The condition is false")
    }
    val isActive = true
    if (isActive == true){
        println("The user is active ")
    }else{
        println("The user is not active ")
    }
    val score = 100
    if(isActive && score == 100){
        println("you are the next level")
    }else{
        println("you lost something")
    }
}