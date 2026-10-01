// Nguyen Ngoc Yen Nhi - 25810030
class NhanVien(
    val maNhanVien: String,
    val ten: String,
    val luongThang: Double
) {
    constructor(ten: String, luongThang: Double) : this(
        "NV000",
        ten,
        luongThang
    ) {
        // Constructor phụ gọi constructor chính bằng this()
    }

    fun inThongTin() {
        println("Mã nhân viên: $maNhanVien")
        println("Tên: $ten")
        println("Lương tháng: $luongThang")
    }
}

fun main() {
    val nhanVien1 = NhanVien("NV001", "Nguyen Ngoc Yen Nhi", 8000000.0)
    val nhanVien2 = NhanVien("Nguyen Ngoc Yen", 9000000.0)

    println("Nhân viên 1:")
    nhanVien1.inThongTin()

    println()

    println("Nhân viên 2:")
    nhanVien2.inThongTin()
}