// class name & proprieties
class Student(fName :String, lName:String, testScour:Int) {
    var firstName:String=""
    var lastName:String=""
    var scourTest = 0
    init {
        firstName = fName.uppercase()
        lastName = lName.uppercase()
        scourTest = testScour
    }

    fun addTest (_name :String , _scour:Int) : MutableMap<String, Int> {
        var map = mutableMapOf<String,Int>()
        if (_scour >= 0 && _scour <= 100)
        {
            map.put("$_name",_scour)
        }
        else
        {
            println("Enter scour between 0 to 100")
        }

        return map
    }
//to display test
    fun displayTests(_map : MutableMap<String,Int>){
        println("your map: ")
        for ((k,v) in _map){
            println("$k , your scour is: $v")
        }

    }

    fun search (_name:String,_map: MutableMap<String,Int>):String {
        var name = _name
        var foundStudent = _map.filterKeys { it == "$_name" }


        if (foundStudent.size == 1)
            return "${foundStudent.keys} scour is:  ${foundStudent.values}"
        else
            return "not found"

    }
//to find the average 
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


///

fun main() {
    try {


        println("enter how many want: ")
        var addStudent = readLine()?.toInt()

        println("Enter first name: ")
        var firstName = readLine()?.toString()

        println("Enter last name: ")
        var lastName = readLine()?.toString()

        println("Enter the scour: ")
        var scour = readLine()?.toInt()

        var fullName = "$firstName $lastName"

        var student = Student(firstName!!, lastName!!, scour!!)


        var map = student.addTest(fullName, scour)


        var count = 1

        while (count <= addStudent!! - 1) {
            println("Enter first name: ")
            firstName = readLine()?.toString()

            println("Enter last name: ")
            lastName = readLine()?.toString()

            println("Enter the scour: ")
            scour = readLine()?.toInt()

            fullName = "$firstName $lastName"

            map += student.addTest(fullName, scour!!)



            count++
        }

        // display the map
        student.displayTests(map)
        // input name of student
        println("enter name for search what his scour: ")
        var studentSearch = readLine()?.toString()

        // print scour the student his search about it
        println("search student : ${student.search(studentSearch!!, map)}")

        println("average is: ${student.average(map)}")

        // print hostList
        println(" honList : ${student.honList(map)}")
    }catch (e:Exception){
        println(e.message)
    }
}