class Student {
    var fname: String = ""
        get() = field.uppercase()
    var lname: String = ""
        get() = field.uppercase()
    var testScore: Int = 0
    var mymap = mutableMapOf<String, Int>()

    var theList_of_Keys = ArrayList(mymap.keys)
    var the_lsit_of_values = ArrayList(mymap.values)

    fun addTest() {
        println("Enter number of students you want to add")
        var number_students = readLine()!!.toInt()
        for(i in 1..number_students ){



        println("Enter student first name:")
        fname = readLine()!!
        println("Enter student last name:")
        lname = readLine()!!
        var theName = "$fname  $lname"
        println("Enter student score:")
        testScore = readLine()!!.toInt()
        while (testScore > 100) {
            println("please Enter student score between 0 and 100:")
            testScore = readLine()!!.toInt()

        }
            mymap.put(theName, testScore)
        }





    }
    fun displayTests() {
        var theList_of_Keys = ArrayList(mymap.keys)
        var the_lsit_of_values = ArrayList(mymap.values)
        println("Names : $theList_of_Keys")
        println("score : $the_lsit_of_values")



//
//        println("Name: $theList_of_Keys " + " Score $the_lsit_of_values"  )






    }



}