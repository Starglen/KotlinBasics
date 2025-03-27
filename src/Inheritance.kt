//Parent class/ Base class/ Super class
open class Animal{

    var gender="Male"
    var age = 3

    fun makesound(){
        println("Animal is speaking")
    }
}

//Child class/Derived class/ Sub-Class
class dog:Animal(){
    fun bark(){
        println("Woof! Woof!")
    }
}

class cat{
    var color = "White"
    var hasfur = true
    fun meow(){
        println("Meow!")
    }
}

fun main() {
    var a = Animal()
    var d = dog()
    d.bark()
    println(d.gender)
    var c = cat()
}