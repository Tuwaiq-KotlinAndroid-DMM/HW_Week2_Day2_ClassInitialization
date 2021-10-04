import java.util.*

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