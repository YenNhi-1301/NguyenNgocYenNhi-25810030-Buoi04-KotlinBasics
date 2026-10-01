// Nguyen Ngoc Yen Nhi - 25810030
class TaiKhoanNganHang(
    val soTaiKhoan: String,
    var soDu: Double
) {
    fun napTien(soTien: Double) {
        soDu = soDu + soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien <= soDu) {
            soDu = soDu - soTien
            return true
        }

        return false
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("TK001", 5000000.0)

    taiKhoan.napTien(2000000.0)

    println("Số dư sau khi nạp: ${taiKhoan.soDu}")

    val ketQua = taiKhoan.rutTien(3000000.0)

    println("Kết quả rút tiền: $ketQua")
    println("Số dư sau khi rút: ${taiKhoan.soDu}")
}