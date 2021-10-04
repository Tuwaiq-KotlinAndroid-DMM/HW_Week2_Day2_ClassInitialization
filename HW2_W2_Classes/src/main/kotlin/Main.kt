fun main(args: Array<String>) {
    // Part 1 - Class Initialization
    try {
        var testMap = mutableMapOf<String, Int>()
        println("Please enter the number of students:")
        var studentNum = readLine()!!.toInt()
        var counter = 1
        var student: Student
        do {
            println("Please enter the student#$counter first name:")
            var fName = readLine()!!
            println("Please enter the student#$counter last name:")
            var lName = readLine()!!
            println("Please enter ${fName?.capitalize()} ${lName?.capitalize()} score:")
            var score = readLine()!!.toInt()
            student = Student(fName, lName, score)
            var studentTest = student.addTest("${student.fName} ${student.lName}", student.testScore)
            testMap += studentTest
            studentNum--
            counter++
        } while (studentNum != 0)

        student.displayTest(testMap)
        println("The students scores average is ${student.getAvr(testMap)}")
        student.honList(testMap)
        println(student.search("Nora"))
    } catch (e: Exception) {
        println("Something Went Wrong!")
        println(e.message)
    }

}

class Student {
    var fName: String
        get() = field.capitalize()
    var lName: String
        get() = field.capitalize()
    var testScore: Int

    // Secondary Constructor
    constructor(_fName: String, _lName: String, _testScore: Int) {
        fName = _fName
        lName = _lName
        testScore = _testScore
    }

    fun addTest(name: String, score: Int): MutableMap<String, Int> {
        var studentScores = mutableMapOf<String, Int>()

        if (score in 0..100)
            studentScores[name] = score
        else
            println("The student score must be between 0 and 100.")
        return studentScores
    }

    fun displayTest(studentsTest: MutableMap<String, Int>) {
        println("\n\t======= Test Scores =======")
        studentsTest.forEach { (t, u) -> println("Student name: $t, Score: $u") }
    }

    // Part 2 - Challenge (Optional)
    fun search(name: String): String { // Not sure at all, I think we should have a map to compare its elements with the name :)
        return if (name == "$fName $lName")
            "$name's score is $testScore"
        else
            "No match!"
    }
    // If the required is just returning the score then the search() will be like this
//    fun search(name: String): String {
//        return  "$name's score is $testScore"
//    }

    fun getAvr(map: MutableMap<String, Int>): Int {
        var sum = 0
        map.forEach { (t, u) ->
            sum += u
        }
        return sum / map.size
    }

    fun honList(map: MutableMap<String, Int>) {
        println("\n\t======= Honor List =======")
        var students = 0
        map.forEach { (t, u) ->
            if (u > 90) {
                students++
                println(t)
            }
        }
        // In case there is no names in this list it will print a message
        if (students <= 0)
            println("There is no names in this list :(")
    }
}