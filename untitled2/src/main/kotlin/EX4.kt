//fun main(){
// var corolla = Vehicle()
//
//    println(corolla.name)
//    println(corolla.seatsNumber)
//    println(corolla.vehicleType)
//    println(corolla.doorStatus)
//
//
//    var bmw = Vehicle()
//    bmw.name = "bmw"
//    println(bmw.name)
//    println(bmw.seatsNumber)
//    println(bmw.vehicleType)
//    println(bmw.doorStatus)
//
//    var lx = Vehicle()
//    lx.name = "lx"
//    println(lx.name)
//
//    lx.doorStatus = true // set the value
//    println(lx.doorStatus) // read or get and print
//
//    println(lx.seatsNumber)
//
//
//
//    println(lx.vehicleType)
//}


class Vehicle{

    // Properties
    var name:String ="toyota"
    var seatsNumber:Int =5
        set(value){
            field = value
        }

    var vehicleType:String ="bus"
    var doorStatus:Boolean = false

}