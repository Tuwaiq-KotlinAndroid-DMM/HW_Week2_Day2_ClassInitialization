class Student(fName :String, lName:String, testScour:Int) {
    var firstName: String
    var lastName: String
    var _testScore: Int = 0
    init {
        firstName = fName.uppercase()
        lastName = lName.uppercase()
        _testScore = testScour
    }
    fun addTest(_name: String, _scour: Int): MutableMap<String, Int> {
        var map = mutableMapOf<String, Int>()
        if (_scour >= 0 && _scour <= 99.99)
        { map.put("$_name", _scour)}

        else { println("try again") }

        return map }

    fun displayTests(_map: MutableMap<String, Int>) {
        println(" result: ")
        for ((e, w) in _map) {
            println("$e ,  scoured : $w")
        }

    }}