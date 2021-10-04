class Student {

    var studentMap = mutableMapOf<String, Int>()

    var fullName: String
    var fName: String
        set(value) { field = value.uppercase() }
    var lName: String
        set(value) { field = value.uppercase() }
    var testScore: Int = 0

    constructor(_fName: String, _lName: String, _testScore: Int) {
        fName = _fName
        lName = _lName
        testScore = _testScore
        fullName = "$fName $lName"
    }


    fun addTest(_fName:String,_lName:String,_testScore:Int) {
       var fullName = "$_fName $_lName"
        studentMap[fullName]=_testScore

    }

    fun displayTests() {

        studentMap.forEach{
                k, v ->
            println("student name : $k , score : $v \n")
        }

    }

    fun search(studentName:String){

        println("the score of $studentName is ${studentMap[studentName]}")
    }
    fun getAvr(){
        var total = 0
        var scoreNum = studentMap.size
        studentMap.forEach{
                k, v ->
               total += v
        }
        var average = total/scoreNum
        println("the  average of students' scores is $average")

    }

    fun honList(){
        studentMap.forEach{
                k, v ->

            if (v>90)
            println("the  honList of students is $k , the score $v \n")
        }

    }
}
