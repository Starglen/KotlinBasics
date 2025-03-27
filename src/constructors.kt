class Dog(var name:String,var Breed:String, color:String){
}

fun main() {
    var dog1 = Dog("Olit","Chihuahua", "White")
    println(dog1.name)
    printSeparator()

    var dog2 = Dog("Ojijo","Siberian Husky", "Black")
    println(dog2.Breed)
    printSeparator()

    var dog3 = Dog("Unknown","PitBull", "Brown")
    println(dog3)
    printSeparator()
}