class Student(_Fname: String, _Lname: String, _testScore: Int) {

    var Fname: String
        get() = field.capitalize()
    var Lname: String
        get() = field.capitalize()
    var testScore: Int


    init {
        Fname = _Fname
        Lname = _Lname
        testScore = _testScore
    }
    fun addTest (name:String , score:Int):  MutableMap <String, Int> {
        var map = mutableMapOf<String, Int>()
        if (score >= 0 && score <= 100) {
            map.put("$name", score)
        } else {
            println("Enter the score between 0 to 100")
        }
        return map
    }
    fun display(map: MutableMap<String,Int>){

        var students = map.keys.toMutableList()
        var scores = map.values.toMutableList()
        println(students)
        println(scores)


    }
}

fun main (){
    var student:Student
    var map = mutableMapOf<String,Int>()
    println("enter how many want: ")
    var addStudent = readLine()!!.toInt()
    do {
        println("Enter first name: ")
        var firstName = readLine()!!

        println("Enter last name: ")
        var lastName = readLine()!!

        println("Enter the scour: ")
        var scour = readLine()!!.toInt()

        var fullName = "$firstName $lastName"

        student = Student(firstName, lastName, scour)

        addStudent--
        var studentData = student.addTest(fullName, scour)
        map.put(fullName, scour)
    } while (addStudent > 0)
    student.display(map)


}


































