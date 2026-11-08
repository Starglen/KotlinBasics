// Lesson 7: interfaces, inheritance, and abstraction.
// Run: kotlinc lessons/07_interfaces_and_inheritance.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val samsung = SmartPhone("Samsung")
    val iphone = SmartPhone("Apple")

    samsung.call()
    samsung.sendMessage()
    iphone.call()

    val assistant: Device = SmartPhone("Android")
    assistant.on()
    assistant.off()

    // Try it: add a Tablet class that implements Device and overrides the same methods.
}

interface Device {
    fun on()
    fun off()
}

open class Phone(val brand: String) : Device {
    open fun call() {
        println("Calling from $brand")
    }

    fun sendMessage() {
        println("Sending a message from $brand")
    }

    override fun on() {
        println("$brand is on")
    }

    override fun off() {
        println("$brand is off")
    }
}

class SmartPhone(brand: String) : Phone(brand) {
    override fun call() {
        println("Smartphone call from $brand")
    }
}
