// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun main() {
    val tuoi : Int = 30
    val loaiVe : String = if (tuoi < 18) {
        "Ve tre em"
    } else if (tuoi < 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }

    println("Khach hang $tuoi tuoi -> Loai ve: $loaiVe")
}