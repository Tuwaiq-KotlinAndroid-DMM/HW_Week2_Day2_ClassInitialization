class Students(_fName: String, _lName: String, var _testScore: Int) {
    var fName: String
        get() = field.capitalize()
    var lName: String
        get() = field.capitalize()
    var testScore: Int
    var fullName: String

    init {
        fName = _fName
        lName = _lName
        testScore = _testScore
        fullName= fName+lName


    }

    fun addScore(student: String, TsScore: Int): MutableMap<String, Int> {
        var StudMap = mutableMapOf<String, Int>()

        if (TsScore > 0 && TsScore <= 100) {
            StudMap.put("$fullName", TsScore)

        } else {
            println("your score should be between 0 and 100")
        }
        return StudMap

    }

    fun display(map: MutableMap<String,Int>) {
        var student1= map.keys.toMutableList()
        println(student1)
        var grades= map.values.toMutableList()
        println(grades)



    }
}

