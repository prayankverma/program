//Swap value using 3rd variable

fun main() {

    var x:Int;
    var y:Int;

    println("Enter value of x: ")
    x= readLine()!!.toInt()
    println("Enter value of y: ")
    y= readLine()!!.toInt()

    x=x+y;
    y=x-y;
    x=x-y;

    println("Value of X is: $x ")
    println("Value of X is: $y ")

}

