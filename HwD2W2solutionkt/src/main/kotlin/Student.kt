
class Student(var fName:String,
              var lName:String,
              var testScore:Int
) {
    var input = readLine()!!.toInt()
    var studentMap = mutableMapOf<String,Int>()
    lateinit var studentName:String



    init{
        fName = ""
        lName = ""
        testScore = 0
    }
    fun addTests(){

        var i = 1
        while (i<input+1){
            println("Enter first Name:")
            fName = readLine()!!
            println("Enter last Name:")
            lName = readLine()!!
            studentName = ("${fName.capitalize()} ${lName.capitalize()}")
            println("Enter test score:")
            testScore = readLine()!!.toInt()
            while (testScore < 0 || testScore > 100){
                println("test score must be between 0 - 100")
                testScore = readLine()!!.toInt()
            }
            studentMap[studentName] = testScore
            i++
            println("the map is: $studentMap")

        }
    }

    fun displayTest(){
        println(addTests())
        println("the list is: ${studentMap.toList()}")
    }

}