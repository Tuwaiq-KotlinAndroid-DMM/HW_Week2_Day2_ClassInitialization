
class Student(var fName:String, var lName:String, var testScore:Int){
    var smap = mutableMapOf<String,Int>()
init {
     fName = ""
     lName = ""
    testScore = 0
}
    fun addTest(){
        var i = 1
while (i<6){
    println("Student First Name#$i:")
    var fName:String = readLine()!!.toString()
     println("Student Last Name#$i:")
    var lname: String = readLine()!!.toString()
    println("Score of the Student#$i:")
    var testScore :Int= readLine()!!.toInt()
    if (testScore < 0 || testScore >100){
        println("Please try again, the score should be from 0 to 100")
    return addTest()}
    smap["${fName.capitalize()} ${lname.capitalize()}"] = testScore
    i++
    println("your map is $smap")
}
    }
    fun displayTests(){apply {
        println("Write name 5 of Students and their test score ")
        println(addTest())
        println("your list ${smap.toList()}")
    }
    }
}
fun main(){
var v = Student("","",0)
  var x =  v.displayTests()
    println(x)

}