//======================================================================================================================
//Part I
//======================================================================================================================
class Student(fName :String, lName:String, testScour:Int) {
    var firstName: String = ""
    var lastName: String = ""
    var test_Score: Int = 0
    init {
        firstName = fName.uppercase()
        lastName = lName.uppercase()
        test_Score = testScour
    }
    fun addTest(_name: String, _scour: Int): MutableMap<String, Int> {
        var map = mutableMapOf<String, Int>()
        if (_scour >= 0 && _scour <= 100) {
            map.put("$_name", _scour)
        } else {
            println("Please enter scour between 0 to 100")
        }
        return map
    }
    fun displayTests(_map: MutableMap<String, Int>) {
        println("your map: ")
        for ((k, v) in _map) {
            println("$k , your scour is: $v")
        }
    }
//======================================================================================================================
//Part II - Bonus Challenge
//======================================================================================================================
    fun search (_name:String,_map: MutableMap<String,Int>):String {
        var name = _name
        var foundStudent = _map.filterKeys { it == "$_name" }
        if (foundStudent.size == 1) return "${foundStudent.keys} scour is: ${foundStudent.values}"
        else return "no score found"
    }
    fun average (_map: MutableMap<String, Int>): Double {
        var totalScour :Int = 0
        var averageStudent :Double
        var count = 0
        _map.values.forEach {
            totalScour+= it
            count++
        }
        averageStudent =( totalScour / count).toDouble()
        return averageStudent
    }
    fun honList (_map: MutableMap<String, Int>): List<Pair<String, Int>> {
        var honStudent = _map.filterValues { it >= 90 }
        return honStudent.toList()
    }
}
//======================================================================================================================
fun main(args: Array<String>) {
//======================================================================================================================
// Part I
//======================================================================================================================
    println("Please enter the number of students: ")
    var addStudent = 0
    try{addStudent = readLine()!!.toInt()}catch (e:Exception){print(" ")}
    println("Enter Student's first name: ")
    var firstName = ""
    try{firstName = readLine()!!.toString()}catch (e:Exception){print(" ")}
    println("Enter Student's last name: ")
    var lastName = ""
    try{lastName = readLine()!!.toString()}catch (e:Exception){print(" ")}
    println("Enter student's scour: ")
    var scour = 0
    try{scour = readLine()!!.toInt()}catch (e:Exception){print(" ")}

    var fullName = "$firstName $lastName"

    var student = Student(firstName!!, lastName!!, scour!!)

    var map = student.addTest(fullName, scour)

    var i = 1
    while (i <= addStudent!! - 1) {
         println("Enter student's first name: ")
        try{firstName = readLine()!!.toString()}catch (e:Exception){print(" ")}
         println("Enter student's last name: ")
        try{lastName = readLine()!!.toString()}catch (e:Exception){print(" ")}
         println("Enter student's scour: ")
        try{scour = readLine()!!.toInt()}catch (e:Exception){print(" ")}
         fullName = "$firstName $lastName"
         map += student.addTest(fullName, scour!!)
         i++
    }
    student.displayTests(map)
//======================================================================================================================
//Part II - Bonus Challenge
//======================================================================================================================
    println("Enter student's Full name (First name and Last name) : ")
    var studentSearch = readLine()!!.toString()
    println("Student full name : ${student.search(studentSearch!!, map)}")
    println("Average score is: ${student.average(map)}")
    println("List of all students : ${student.honList(map)}")
}

