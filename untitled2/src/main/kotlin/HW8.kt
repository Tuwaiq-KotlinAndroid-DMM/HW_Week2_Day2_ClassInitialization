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
        if (_scour in 0..100) {
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


}