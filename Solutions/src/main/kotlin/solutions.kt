import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl

fun main(args: Array<String>) {
    println("Enter your first name:")
    var first = readLine()!!
    println("Enter your Last name:")
    var last = readLine()!!
    println("Enter your grade:")
    var grade = readLine()!!.toInt()

    var student = Students(first, last, grade)
    var fullName = (first + last)
    var studentMap = student.addScore(fullName,grade)


}




