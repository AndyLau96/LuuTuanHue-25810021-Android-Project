// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val phanHoTen = value.trim().split(Regex("\\s+"), limit = 2)
            ho = phanHoTen[0]
            ten = phanHoTen.getOrElse(1) { "" }
        }
}

fun main() {
    val khachHang = KhachHang("Luu", "Hue")
    println(khachHang.hoTen)

    khachHang.ten = "Tuan Hue"
    println(khachHang.hoTen)

    khachHang.hoTen = "Ho Thi Hien"
    println("Ho: ${khachHang.ho}")
    println("Ten: ${khachHang.ten}")
}
