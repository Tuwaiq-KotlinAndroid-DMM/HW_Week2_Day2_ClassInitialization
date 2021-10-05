
fun main() {
    println("enter students number")
    var x = Student("", "", 0)
    println(x.displayTest())

    println(x.search())

    println(x.getAvr())

    println(x.honList())
}


class Student( var fName: String,  var lName: String, var testScore: Int ) {
    var input = readLine()!!.toInt()
    var sMap = mutableMapOf<String, Int>()
    lateinit var studentName: String


    init {
        fName = ""
        lName = ""
        testScore = 0
    }

    fun addTests() {
        var x = 1
        while (x < input + 1) {
            println("Enter first Name:")
            fName = readLine()!!
            println("Enter last Name:")
            lName = readLine()!!
            studentName = ("${fName.capitalize()} ${lName.capitalize()}")
            println("Enter score:")
            testScore = readLine()!!.toInt()
            while (testScore < 0 || testScore > 100) {
                println("score must be between 0 - 100")
                testScore = readLine()!!.toInt()
            }
            sMap[studentName] = testScore
            x++
            println("your map: $sMap") }
    }

    fun displayTest() {
        println(addTests())
        println("the list is: ${sMap.toList()}")
    }

    fun search() {
        println("write student name with the first and last name Capital letters" +
                " to see their result:")

        println(sMap[readLine()!!])
    }


    fun getAvr() {
        var arg = sMap.values
        println("the class average is: ${arg.sum() / input}")

    }

    fun honList() {
        var honorList = mutableListOf<String>()
        sMap.forEach { y, l ->
            if (l > 90) {
                honorList.add(y) } } }
}
