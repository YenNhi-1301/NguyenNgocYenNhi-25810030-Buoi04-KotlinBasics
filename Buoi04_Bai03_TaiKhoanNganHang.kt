// Nguyen Ngoc Yen Nhi - 25810030
class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("Số dư không hợp lệ")
        } else {
            println("Tạo tài khoản thành công với số dư ban đầu: $soDu")
        }
    }
}
fun main() {
    val taiKhoan1 = TaiKhoanNganHang("TK001", 5000000.0)

    println()

    val taiKhoan2 = TaiKhoanNganHang("TK002", -1000000.0)
}