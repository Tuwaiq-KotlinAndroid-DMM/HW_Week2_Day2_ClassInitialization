fun main() {
    try {


        println("enter how many want: ")
        var addStudent = readLine()?.toInt()

        println("Enter first name: ")
        var firstName = readLine()?.toString()

        println("Enter last name: ")
        var lastName = readLine()?.toString()

        println("Enter the scour: ")
        var scour = readLine()?.toInt()

        var fullName = "$firstName $lastName"

        var student = Student(firstName!!, lastName!!, scour!!)


        var map = student.addTest(fullName, scour)


        var count = 1

        while (count <= addStudent!! - 1) {
            println("Enter first name: ")
            firstName = readLine()?.toString()

            println("Enter last name: ")
            lastName = readLine()?.toString()

            println("Enter the scour: ")
            scour = readLine()?.toInt()

            fullName = "$firstName $lastName"

            map += student.addTest(fullName, scour!!)



            count++
        }

        // display the map
        student.displayTests(map)
        // input name of student
        println("enter name for search what his scour: ")
        var studentSearch = readLine()?.toString()

        // print scour the student his search about it
        println("search student : ${student.search(studentSearch!!, map)}")

        // print hostList
        println(" honList : ${student.honList(map)}")
    }catch (e:Exception){
        println(e.message)
    }
}