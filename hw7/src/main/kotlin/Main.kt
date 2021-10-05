fun main() {

    println(" number of students? ")
    var addStudent = 0
    try { addStudent = readLine()!!.toInt() }
    catch (e: Exception) { print(" ") }

    println("Student first name? ")
    var firstName = ""
    try {
        firstName = readLine()!!.toString()
    } catch (e: Exception) {
        print(" ")
    }
    println("Student last name? ")
    var lastName = ""
    try {
        lastName = readLine()!!.toString()
    } catch (e: Exception) {
        print(" ")
    }
    println("Student scoured: ")
    var scour = 0
    try {
        scour = readLine()!!.toInt()
    } catch (e: Exception) {
        print(" ")
    }

    var fullName = "$firstName $lastName"

    var student = Student(firstName!!, lastName!!, scour!!)

    var map = student.addTest(fullName, scour)

    var i = 1
    while (i <= addStudent!! - 1) {
        println("student's first name: ")
        try {
            firstName = readLine()!!.toString()
        } catch (e: Exception) {
            print(" ")
        }
        println("student's last name: ")
        try {
            lastName = readLine()!!.toString()
        } catch (e: Exception) {
            print(" ")
        }
        println("student scoured: ")
        try {
            scour = readLine()!!.toInt()
        } catch (e: Exception) {
            print(" ")
        }
        fullName = "$firstName $lastName"
        map += student.addTest(fullName, scour!!)
        i++
    }
    student.displayTests(map)
}