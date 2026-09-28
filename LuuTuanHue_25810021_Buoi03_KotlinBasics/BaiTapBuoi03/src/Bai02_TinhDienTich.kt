fun tinhDienTich (chieuDai: Double, chieuRong : Double) : Double {
    return (chieuDai * chieuRong)
}

val dienTich1 = tinhDienTich(5.6, 3.2)
val dienTich2 = tinhDienTich(10.0, 5.0)

fun main() {
    println("$dienTich1")
    println("$dienTich2")
}