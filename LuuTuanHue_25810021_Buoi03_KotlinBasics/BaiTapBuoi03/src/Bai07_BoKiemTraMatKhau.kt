// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021

fun main() {
    val checkLength : (String) -> Boolean = {mk -> mk.length >=8}
    val matKhau1 = "12345"
    val matKhau2 = "password"
    val matKhau3 = "CaDuoiCaMap!@#"
    println("MK '$matKhau1'? -> ${checkLength(matKhau1)}")
    println("MK '$matKhau2'? -> ${checkLength(matKhau2)}")
    println("MK '$matKhau3'? -> ${checkLength(matKhau3)}")
}