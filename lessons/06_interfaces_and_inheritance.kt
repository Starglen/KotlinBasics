// Lesson 6: interfaces, inheritance, abstraction, and polymorphism.
// Run: kotlinc lessons/06_interfaces_and_inheritance.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val phone: Device = SmartPhone("Pixel")
    phone.on()
    phone.off()

    val laptop = Laptop("Dell")
    laptop.turnOn()
    laptop.turnOff()
}

interface Device {
    fun on()
    fun off()
}

open class Computer(val brand: String) {
    open fun turnOn() = println("$brand computer is on")
    open fun turnOff() = println("$brand computer is off")
}

class Laptop(brand: String) : Computer(brand) {
    override fun turnOn() = println("Laptop from $brand is awake")
    override fun turnOff() = println("Laptop from $brand is asleep")
}

class SmartPhone(private val brand: String) : Device {
    override fun on() = println("$brand phone is on")
    override fun off() = println("$brand phone is off")
}
