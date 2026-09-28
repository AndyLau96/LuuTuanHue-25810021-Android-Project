// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun ghiNhatKy1(moTa: String) : Unit {
    println("$moTa")
}

fun ghiNhatKy2(moTa: String) {
    println("$moTa")
}

fun main() {
    // Gọi thử hai hàm với cùng một hành động để thấy kết quả giống hệt nhau
    ghiNhatKy1("ghiNhatKy1")
    ghiNhatKy2("ghiNhatKy2")
}