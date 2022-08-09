import java.util.*

class Pen {
    class Pen(var color:String){
        var on:Boolean=false
        var penInk:Int=10

        fun onPen(isTrue:Boolean):Boolean{
            return true
        }
        fun offPen(isFalse:Boolean):Boolean{
            return false
        }
    }

    fun main() {
        var scanner= Scanner(System.`in`)
        val  pen=Pen("Black")
        var p=pen.offPen(pen.on)
        p=pen.onPen(true)
        if (p==pen.onPen(true)){
            println("Pen off")
            println("Pen on --> 1")
            val n=scanner.nextInt()
            var res=pen.penInk
            while (true){
                if (n==1){
                    print("Write: ")
                    scanner= Scanner(System.`in`)
                    val write=scanner.nextLine()
                    for (i in 0..write.length) {
                        res--
                    }
                    if (write.length>10) {
                        println(write.substring(0,10))
                        print("zapas qolmadi" )
                    }
                    if (write.length<10){
                        println(write)
                        println("Continue")
                    }

                }else{
                    println("Pen off")
                }
            }
        }
    }

}