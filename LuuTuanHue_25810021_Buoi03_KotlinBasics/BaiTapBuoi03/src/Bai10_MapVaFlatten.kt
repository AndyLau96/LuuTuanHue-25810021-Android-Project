// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021

fun main() {
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val danhSachNhanDoi = danhSachSo.map { it * 2 }
    println("Kết quả: $danhSachNhanDoi")
    val danhSachLongNhau = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6, 7, 8, 9))
    println("Ds lồng nhau gốc: $danhSachLongNhau")
    val danhSachPhang = danhSachLongNhau.flatten()
    println("Sau khi dùng flatten: $danhSachPhang")
}