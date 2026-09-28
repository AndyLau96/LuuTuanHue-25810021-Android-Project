// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun tinhBinhPhuong1(x: Int) : Int {
    return x * x
}

fun tinhBinhPhuong2(x: Int) = x * x

fun tinhChuViHinhVuong1(canh: Double): Double {
    return canh * 4
}

fun tinhChuViHinhVuong2(canh: Double) = canh * 4

fun kiemTraSoChan1(n: Int): Boolean {
    return n % 2 == 0
}
// Bản rút gọn
fun kiemTraSoChan2(n: Int) = n % 2 == 0

fun main() {
    println("tinhBinhPhuong1: ${tinhBinhPhuong1(5)}")
    println("tinhBinhPhuong2: ${tinhBinhPhuong2(5)}")
    println("tinhChuViHinhVuong1: ${tinhChuViHinhVuong1(2.5)}")
    println("tinhChuViHinhVuong2: ${tinhChuViHinhVuong2(2.5)}")
    println("kiemTraSoChan1: ${kiemTraSoChan1(10)}")
    println("kiemTraSoChan2: ${kiemTraSoChan2(10)}")
}