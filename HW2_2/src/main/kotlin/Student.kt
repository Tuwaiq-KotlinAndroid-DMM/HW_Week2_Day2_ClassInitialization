
class Student() {
   var fName:String
   get() = field.uppercase()
     var lName:String
    get() = field.uppercase()
     var testScore:Int
init {
    print("Your  first name: ")
    fName = readLine()!!

    print("Your  last name: ")
    lName = readLine()!!


    print("Your  Score: ")
    testScore= readLine()!!.toInt()

}

    fun fullName(f:String,L:String):String{
        return "$fName $lName"
    }

   fun addTest(name:String,Score:Int):Map<String,Int> {
       var map = mutableMapOf<String,Int>(name to Score)
       return map
   }
   fun displayTest(map: Map<String,Int>){
       println(map)
   }

}





