fun main(args: Array<String>) {

    var studentNumbers = 0
    var firstName:String
    var lastName:String
    var scor:Int


    while (studentNumbers==0){
        println("This Program to store student name and score \n" +
                "will ask you to Enter student name and score one by one\n"+
                "be patient and Thank you \n" +
                "////////////////////////////////////////////////////////////\n" +
                "PLEASE Enter number of student")

        studentNumbers = try {
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) { 0 }
    }


    firstName = readFirstName(1)
    lastName = readLastName(1)
    scor = readScore(1)

    var student = Student(firstName,lastName,scor)
    student.addTest(firstName,lastName,scor)

    for (i in 2..studentNumbers) {

        student.apply {
            fName = readFirstName(i)
            lName = readLastName(i)
            testScore = readScore(i)
            student.addTest(fName,lName,testScore)
        }
    }
    student.displayTests()
    student.getAvr()
    student.honList()
    student.search(searchStudent())

    }


fun readFirstName(studentOrder:Int):String{
    println("please Enter student First Name , For student ($studentOrder)")
    return readLine()!!
}

fun readLastName(studentOrder:Int):String{
    println("please Enter student Last Name , For student ($studentOrder)")
    return readLine()!!
}

fun readScore(studentOrder:Int):Int{

    var score = -1
    while (score<0 || score>100){
        println("please Enter student score between 0 to 100 , For student ($studentOrder)")
        score = try{
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) { -1 }}
    return score
}

fun searchStudent():String{
    println("please Enter student First and last Name")
    return readLine()!!
}
