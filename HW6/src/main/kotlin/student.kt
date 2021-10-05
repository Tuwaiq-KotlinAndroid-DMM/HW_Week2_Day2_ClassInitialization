class student {
    var fname:String
    var lName:String
   var  testScore:Int
    var studentScore = mutableMapOf<String,Int>()
    lateinit var fullName: String
     var size = readLine()!!.toInt()
    constructor( name:String,  lastName:String, score: Int) {

       fname =name
        lName = lastName
        testScore =  score

    }
    fun addTest(fName: String, testScore: Int){
        var x = 1
        while (x < size +1) {
            println("Emter student first name:")
            fname = readLine()!!
            println("Emter student last name:")
            lName = readLine()!!
            fullName = ("${fName.capitalize()} ${lName.capitalize()}")

            println("Emter student test score:")
            this.testScore = readLine()!!.toInt()
            if (testScore > 100 || testScore <0 ) {
                println("enter the score between 0-100")
                this.testScore = readLine()!!.toInt()
            }
        }
        studentScore.put(fName, testScore)
        println("the map of Student Score: $studentScore")
    }
    fun display () {

println("the list of student score ${studentScore.toList()}")
    }


}