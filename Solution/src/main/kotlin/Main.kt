class Students(var _fname: String, var _lname: String, var _testscore: Int) {
    var fname: String
        get() = field.capitalize()
    var lname: String
        get() = field.capitalize()
    var testscore: Int
    var fullname: String

    init {
        fname = _fname
        lname = _lname
        testscore = _testscore
        fullname = fname + lname
    }

    fun addtest(name: String, score: Int): MutableMap<String, Int> {
        var map = mutableMapOf<String, Int>()
        if (score >= 0 && score <= 100) {
            map.put("$fullname", $score)
        } else {
            println("your score must be between 0 and 100")
        }
        return map
    }

    fun displaytest(map: MutableMap<String, Int>) {
        var students = map.keys.toMutableList()
        var scores = map.values.toMutableList()
        println(students)
        println(scores)
    }

    fun main() {
        println("Enter your first name:")
        var fname = readLine()!!
        println("Enter your Last name:")
        var lname = readLine()!!
        println("Enter your grade:")
        var score = readLine()!!.toInt()
    }
}