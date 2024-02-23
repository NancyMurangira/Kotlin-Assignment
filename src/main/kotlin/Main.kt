fun main() {
    theName("Nancy")
    remainder(4,5)
    sum(3,5,7,2)
    Fact("I am understanding")
    Fact("I love listening to music ")
}
fun theName(name:String){
    println("Hello${name}")
}
fun remainder(a: Int, b:Int){
    var result = a%b
    println("the result= $result")
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int){
    var addition= num1+num2+num3+num4
    println("Result= $addition")
}
fun Fact(interestingFact:String) {
    println(interestingFact)
}

