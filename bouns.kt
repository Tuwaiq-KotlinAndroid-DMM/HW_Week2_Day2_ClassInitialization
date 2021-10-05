class Student(var fName:String, var lName:String, var testScore:Double){
    var smap = mutableMapOf<String,Double>()
    init {
        fName = ""
        lName = ""
        testScore = 0.0
    }
    fun addTest(){

        var i = 1
        while (i<6){
            println("Student First Name#$i:")
            var fName:String = readLine()!!.toString()
            println("Student Last Name#$i:")
            var lname: String = readLine()!!.toString()
            println("Score of the Student#$i:")
            var testScore :Double= readLine()!!.toDouble()
            if (testScore < 0 || testScore >100){
                println("Please try again, the score should be from 0 to 100")
                return addTest()}
            smap["${fName.capitalize()} ${lname.capitalize()}"] = testScore
            i++
            println("your map is $smap")
        }
    }

    fun displayTests(){
        println("Write name 5 of Students and their test score ")
        println(addTest())
        println("your list ${smap.toList()}")
        return search()
    }
    fun search(){
        println("type or copy the Student name that you want to know his score from the map:")
        var sa = smap.entries
        var sn = readLine()!!.toString()
        println("his score is: ${smap[sn]}")
        return getAvr()
    }
    fun getAvr(){
        var avr = smap.values
        var sum = avr.sum()
        var avr1 = sum/5
        println("The average of the scores is $avr1")
        return honList()
    }
    fun honList(){
        var honStudent = smap.filterValues { it >= 90 }
        var ma = smap
        println("Honored students are ${honStudent.toList()}")
    }
}
fun main(){
    var v = Student("","",0.0)
    var x =  v.displayTests()
    println(x)

}