open class Shape{
   open fun draw(){
        println("Drawing a shape")
    }
}

class circle:Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

class rectangle:Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}
class triangle:Shape(){
     override fun draw(){
        println("Drawing a triangle")
    }
}

fun main() {
    var sh = Shape()
    sh.draw()

    var ci = circle()
    ci.draw()

    var re = rectangle()
    re.draw()

    var tr = triangle()
    tr.draw()
}