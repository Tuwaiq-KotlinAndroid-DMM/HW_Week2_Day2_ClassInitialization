
fun main() {
    var hala = Student("Hala", "Lama", 0)
    var ha = hala.displayTests()
    println(ha)
}

class Student(var fName:String, var lName:String, var testScore:Int){
    var halamap = mutableMapOf<String,Int>()
    var input = readLine()!!.toInt()
    init {
        fName = "Hala"
        lName = "Lama"
        testScore = 0
    }
    fun Test(){
        var H = 1
        while (H<4){
            println("Student First Name#$H:")
            var firstName:String = readLine()!!.toString()

            println("Student Last Name#$H:")
            var lastname: String = readLine()!!.toString()

            println("Student Score#$H:")
            var testScore :Int= readLine()!!.toInt()

            if (testScore < 0 || testScore >100){
                println("Score must be from 0 to 100")
                return Test()}
            halamap["${firstName.capitalize()}, ${lastname.capitalize()}"] = testScore
            H++
            println("your map is $halamap")
        }
    }
    fun displayTests(){apply {
        println("Write name 5 of Students and their test score ")
        println(Test())
        println("your list ${halamap.toList()}")
    }


        fun search() {
            println("write student name with the first and last name Capital letters" +
                    " to see their result:")

            println(halamap[readLine()!!])
        }


        fun getAvr() {
            var arg = halamap.values
            println("the class average is: ${arg.sum() / input}")

        }

        fun honList() {
            var honorList = mutableListOf<String>()
           halamap.forEach { y, l ->
                if (l > 90) {
                    honorList.add(y) } }
    }
}}
