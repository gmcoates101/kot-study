import models.MobilePhone
import data.Robot

class Masterclass {

    companion object {
        @JvmStatic
        fun chap24() {
            val s: String = "Android Masterclass"
            val f: Float = 13.37F
            val d: Double = 3.14159265358979
            val b: Byte = 25
            val sh: Short = 2020
            val l: Long = 18881234567
            val boo: Boolean = true
            val c: Char = 'a'
            println("$s : $f : $d : $b : $sh : $l : $boo : $c")
        }

        @JvmStatic
        fun chap45(vararg a: Double): Double = a.sum() / a.size

        @JvmStatic
        fun chap55() {
            val ip = MobilePhone("iOS", "Apple", "X")
            val and = MobilePhone("Android Lollipop", "Marshall", "London")
            val sam = MobilePhone("Android S", "Samsung", "A52s 5G")
        }

        @JvmStatic
        fun chap61() {
            val robot = Robot("Robbie")
            val rob = Robot("Robbie")

            println("$robot - $rob")
            println(robot == rob)
            robot.name = "Marvin"
            println("$robot - $rob")
            println(robot == rob)
        }

        @JvmStatic
        fun chap62() {
            val ip = MobilePhone("iOS", "Apple", "X", 25)
            ip.chargeBattery(40)
        }
    }
}