// hw
class Student(first: String ) {
    var first = "default value"
    var last: String = "default value"
    var score: Int = 0

    init {
        this.first = first.capitalize()

    }
    constructor(f: String, last: String, score: Int) : this(f) {
        //this.score = score
    }
}
fun main() {

    val map1 = mutableMapOf<String, Int>()
    print("Enter number of student: ")
    val number = readLine()!!.toInt()
    var i = 1
    while (i <= number) {
        print("first name for student $i: ")
        val student = Student(readLine()!!)

        print("last name for student $i: ")
        student.last = readLine()!!.capitalize()
        print("score  $i: ")
        student.score = readLine()!!.toInt()
        val key = student.first + " " + student.last
        val value = student.score
        i++
        map1.put(key, value)

    }
    println(map1)

    for(j in map1.values){
        if (j >= 90) println(" honor students${map1.keys} ")

    }
}
