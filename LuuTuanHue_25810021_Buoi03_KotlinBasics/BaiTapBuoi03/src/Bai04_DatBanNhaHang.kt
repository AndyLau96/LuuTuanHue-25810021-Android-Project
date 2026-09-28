// Họ và tên: Lưu Tuấn Huê - MSSV: 25810021
fun datBan(tenKH: String, soLuong: Int, loaiBan: String = "ban thuong" ){
    println("KH: $tenKH, SL: $soLuong, Loai: $loaiBan")
}

fun main() {
    datBan("Luu Tuan Hue", 5)
    datBan("Ho Thi Hien", 2,"Ban VIP")
    datBan(loaiBan = "Ban Thuong", tenKH = "Bui Dang Tuan", soLuong = 2)
}