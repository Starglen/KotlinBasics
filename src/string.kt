fun main() {
    var firstname ="Glen"
    var lastname = "Star"
    var school = "eMobilis"

    println(firstname)
    println(firstname +" " +lastname) //string concatination
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //string interpolation
    println(school + " is a good school")
    println("$school is a coding school")
    println("My fulname is $firstname $lastname")
}