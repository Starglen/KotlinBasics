fun main() {
    //standard library functions/ predefined functions

    var output = Math.sqrt(144.0)
    println("The square root of 144 is $output")

    var a =  Math.round(45.45)
    println("The output is $a")

    printSeparator()

    school()// calling out the function
    add()

    printSeparator()

    student("Glen", 18, "male")
    student("Unknown", 27,"Female" )
    student("Star", 19, "Male")

    printSeparator()

    employee("Star", 55550,false)
    employee("Unknown", 10000, true)



}

//USer-defined functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x+y)
}

//parameter/ variable and  arguments/ value
fun student(name:String,age:Int, gender:String){
    println("$name is a $gender and $age years old")
}

//simple program for two employee
fun employee(name:String, salary:Int, disability:Boolean){
    println("NAME:$name, SALARY:$salary, DISABLED?:$disability")
}

fun printSeparator() {
    println("=".repeat(80)) // Prints a line of 30 '=' characters
}
