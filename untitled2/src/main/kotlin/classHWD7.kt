fun main(){
var s1 = student()
    var s2 =student()
    s1.name ="amal"
    s1.age =25
    s1.id =1234
    s1.say_Hello()
}
class Student(name:String,id:Int,age:Int){
    var id :Int = id
    var name :String = name
    var age :Int =age
    fun say_Hello (){
       println("Hello")
    }
    }
