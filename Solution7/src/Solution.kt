import kotlin.system.exitProcess

fun main() {
    println("Enter a first name")
    var fn = readLine()!!
    println("Enter a Last name")
    var ln = readLine()!!
    println("Enter a score")
    var scr = readLine()!!.toInt()
 var s=student(fn,ln,scr)
    s.displayTest()


}




class student(fName:String,lName:String,testScore:Int) {
    var fName: String
    var lName: String
    var map = mutableMapOf<String, Int>("AHMAD MOHAMMAD" to 99, "JASIM HANI" to 87)
    var testScore: Int = 0

    init {
        this.fName = fName
        this.lName = lName
        this.testScore = testScore
    }


    fun addTest(testScore: Int): MutableMap<String, Int> {
        if (testScore >= 0 && testScore <= 100) {
            var name = getName(this.fName, this.lName)
            map.put(name, testScore)
            return map
        } else {
            print("Not valid score")
            exitProcess(0)
        }

    }

    fun displayTest() {
        println(addTest(this.testScore))
    }

    fun getName(fName: String, lName: String): String {
        var both = fName.toUpperCase() + " " + lName.toUpperCase()
        return both

    }
}




