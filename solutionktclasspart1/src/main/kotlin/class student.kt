import jdk.incubator.vector.VectorOperators

class student  {
    var firstName: String
    var secondName: String
    var testScore: Int
    var map= mutableMapOf<String,Int>()
    constructor (_firstName: String,_secondName: String,_testScore: Int)  {
        firstName=_firstName
        secondName=_secondName
        testScore=_testScore
    }
    fun addTest() {
        var result = 2
        var firstName: String = readLine()!!.toString()
        println("student first name")
        var secondName: String = readLine()!!.toString()
        println("student last name")
        var testScore: Int = readLine()!!.toInt()
        if (testScore >= 0 && testScore <= 100){
            map.put("$firstName", testScore)
        } else {
            println("Enter the score between 0 to 100")
            return addTest()
            map["${firstName.uppercase()} ${secondName.uppercase()}"]=testScore
            println("$map")
        }
     fun displayTests() {
         var students = map.keys.toMutableList()
         var scores = map.values.toMutableList()
         println(students)
         println(scores)
     }}
    }




