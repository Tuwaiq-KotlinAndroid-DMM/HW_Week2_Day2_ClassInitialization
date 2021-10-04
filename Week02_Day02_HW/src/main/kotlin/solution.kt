import java.lang.Exception

//create a class named Student
class Student(
    _fName: String,
    _lName: String,
    _testScore: Int
) {
    //properties of the class:
    var fName: String
        get() = field.uppercase()
    var lName: String
        get() = field.uppercase()
    var testScore: Int

    //init fucntion that will be called when creating an object
    init {
        fName = _fName
        lName = _lName
        testScore = _testScore

    }

    // function named addTest to return a map item with the name and score
    fun addTest(name: String, score: Int): Pair<String, Int> {
        if (score >= 0 && score <= 100)
            return (name to score)
        else
            return (name to 0)
    }

    //function named displayTest to convert a map to a list of students, and a list of scores and print them
    fun displayTest(map: MutableMap<String, Int>) {
        var students = map.keys.toMutableList()
        var scores = map.values.toMutableList()
        println(students)
        println(scores)
    }

    //a fucntion to pass in it the name and print the name and score of the object
    fun search(name: String): String {
        return "the name is $name, and his score is $testScore"

    }

    // function named honList to return a list of honor students taken from a map
    fun honList(map: MutableMap<String, Int>): MutableList<String> {
        var list = mutableListOf<String>()
        map.forEach { t, u ->
            if (u > 90) {
                list.add(t)
            }
        }
        return list

    }

    // a function named getAvr to calculate and return the average of scores
    fun getAvr(map: MutableMap<String, Int>): Int {
        var total: Int = 0
        var counter: Int = 0
        map.values.forEach {
            total += it
            counter++
        }

        var average: Int = total / counter
        return average

    }
}

fun main() {
    /* repeatedly allow the user to enter names and scores, add it to the map, and use functions
      like displayTest to display the list of students and scores, getAvr
        to print the average of the scores, and print the honor list of students*/
    try {
        var map = mutableMapOf<String, Int>()
        var score: Int
        var i = 1
        var student1: Student
        var fullName: String
        var firstName: String
        var lastName: String

        do {
            println("Enter the first name# for student #$i: ")
            firstName = readLine()!!
            println("Enter the last name for student #$i: ")
            lastName = readLine()!!
            println("Enter the score for student #$i: ")
            score = readLine()!!.toInt()
            student1 = Student(firstName, lastName, score)
            fullName = "${student1.fName} ${student1.lName}"
            var item = student1.addTest(fullName, student1.testScore)
            map.put(item.first, item.second)
            i++

        } while (i <= 3)

        student1.displayTest(map)
        println("The average is ${student1.getAvr(map)} ")
        println(student1.honList(map))
    } catch (e: Exception) {
        println(e.message)
    }
}