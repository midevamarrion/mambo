fun main() {
    var intakes =Human("Marrion",21,63)
    intakes.eat(10)
    intakes.speak("I am Marrion currently a student at Akirachix")
    intakes.birthday()
    var details = People("Midevah","Marrion","midevahmarrion@gmail.com","0714053378",7981)
    details.user("Midevah")
    details.lastN("Marrion")



    
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        var newWeight = weight + foodWeight
        println("I am eating $newWeight kgs of food")
        }

    fun speak(speech:String){
        println(speech)
    }

    fun birthday(){
        var newAge =++age
        println(newAge)
    }

}
data class People(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int){
    fun user(firstName: String){
        println(firstName)
    }
    fun lastN(lastName: String){
        println(lastName)
    }




}






















