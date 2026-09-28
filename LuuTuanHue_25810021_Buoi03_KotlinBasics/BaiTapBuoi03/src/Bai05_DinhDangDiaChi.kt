// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun dinhDangDiaChi(soNha: String, tenDuong: String, phuongXa: String = "Unknow", quanHuyen: String = "Unknow", tinhThanh: String = "Sài Gòn"
) {
    println("Giao đến: $soNha, đường $tenDuong, P/X: $phuongXa, Q/H: $quanHuyen, T/P: $tinhThanh")
}
fun main() {
    dinhDangDiaChi("Số 1", "Võ Văn Ngân", quanHuyen = "Thủ Đức", tinhThanh = "Sài Gòn")
    dinhDangDiaChi("QL 12A", "QL 12A", tinhThanh = "Quảng Bình", phuongXa = "Tuyên Hoá"
    )
}