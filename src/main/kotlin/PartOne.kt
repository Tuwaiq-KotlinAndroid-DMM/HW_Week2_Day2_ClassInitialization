class Student(Firstname: String, Lastname: String, TScore: Int, val map: Unit) {

    var Fname: String

    var Lname: String

    var testScore: Int


    init {
        Fname = Firstname
        Lname = Lastname
        testScore = TScore
    }

    fun addTest(name: String, score: Int) {
        var MAP = mutableMapOf<String, Double>()
        var N = 3
        while (N <= 5) {
            MAP["$N"] = N + 1.0
            N++
            return map
        }

        fun displayTests(map: MutableMap<String, Int>) {

            var students = map.keys.toMutableList()
            var scores = map.values.toMutableList()
            println(students)
            println(scores)


        }
    }
}

