// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun xuLyVanBan(chuoi: String, hamXuLy: (String) -> String): String {
    return hamXuLy(chuoi)
}
fun vietHoa(s: String): String {
    return s.uppercase()
}

fun main() {
    val chuoiGoc = "kotlin"
    val k1 = xuLyVanBan(chuoiGoc, { it.reversed() })
    println("Cach 1: $k1")
    val k2 = xuLyVanBan(chuoiGoc, ::vietHoa)
    println("Cach 2: $k2")
    val k3 = xuLyVanBan(chuoiGoc) { it.uppercase() }
    println("Cach 3: $k3")
}