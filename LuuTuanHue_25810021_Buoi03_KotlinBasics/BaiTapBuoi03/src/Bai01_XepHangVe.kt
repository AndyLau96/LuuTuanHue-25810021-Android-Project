// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun main() {
    val tuoi : Int = 30
    val loaiVe : String = if (tuoi < 18) {
        "Ve tre em"
    } else if (tuoi < 60) {
        "Ve nguoi lon"
    } else {
        "Ve cao tuoi"
    }
    println("Khach hang $tuoi tuoi -> Loai ve: $loaiVe")
}