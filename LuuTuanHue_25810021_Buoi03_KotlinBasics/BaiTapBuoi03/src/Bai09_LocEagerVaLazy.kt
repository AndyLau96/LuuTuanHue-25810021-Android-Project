// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun main() {
    val danhSachNhacCu = listOf("Guitar", "Piano", "Violin", "Gong", "Flute", "Guitar Bass")
    val ketQuaThongThuong = danhSachNhacCu.filter { it.startsWith("G") }
    println("Kết quả lọc thông thường: $ketQuaThongThuong")
    val ketQuaSequence = danhSachNhacCu.asSequence().filter { it.startsWith("G") }.toList()
    println("Kết quả lọc qua Sequence: $ketQuaSequence")
}